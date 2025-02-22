/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.IConexion;
import Entidades.Medico;
import Excepciones.PersistenciaExcption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janethcristinagalvanquinonez
 */
public class MedicoDAO {

    private final IConexion conexion;

    private static final Logger logger = Logger.getLogger(CitaDAO.class.getName());

    public MedicoDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    public boolean registrarMedico(Medico medico) throws PersistenciaExcption {
        String consulta = "INSERT INTO medicos (nombre, apellidoP, apellidoM, cedulaPro, especialidad) VALUES (?, ?, ?, ?, ?)";
        int filasAfectadas = 0;
        try (Connection con = conexion.crearConexion()) {

            try (PreparedStatement ps = con.prepareStatement(consulta)) {

                ps.setString(1, medico.getNombre());
                ps.setString(2, medico.getApellidoP());
                ps.setString(3, medico.getApellidoM());
                ps.setString(4, medico.getCedulaPro());
                ps.setString(5, medico.getEspecialidad());

                filasAfectadas = ps.executeUpdate();
                if (filasAfectadas == 0) {
                    logger.severe("La insercion del medico ha fallado");
                    return false;
                } else {
                    logger.info("Insercion de medico con exito");
                    return true;
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, "Error al registrar medico", ex);
            throw new PersistenciaExcption("Error al registrar medico ");
        }
       // return filasAfectadas!=0;

    }
    
    
}

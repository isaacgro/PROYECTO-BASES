/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.IConexion;
import Entidades.Consulta;
import Excepciones.PersistenciaExcption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janethcristinagalvanquinonez
 */
public class ConsultaDAO {
    
    
    private final IConexion conexion;

    private static final Logger logger = Logger.getLogger(CitaDAO.class.getName());

    public ConsultaDAO(IConexion conexion) {
        this.conexion = conexion;
    }
    
    
    public boolean registrarConsulta(Consulta consulta) throws PersistenciaExcption {

        String consultaSQL = "INSERT INTO consultas (fecha_hora, diagnostico, tratamiento) VALUES (?, ?, ?)";
        int filasAfectadas = 0;
       // String verificacion = "SELECT COUNT(*) FROM consultas WHERE fecha_hora = ? AND (id_Medico = ? OR id_Paciente = ?)";

       
       
       if (consulta.getFecha_hora() == null || consulta.getDiagnostico() == null || consulta.getTratamiento() == null) {
        throw new PersistenciaExcption("Ningun campo puede ser null");
         }
       
        try (Connection cone = conexion.crearConexion()) {
           
            
            try (PreparedStatement ps = cone.prepareStatement(consultaSQL, Statement.RETURN_GENERATED_KEYS)) {

            ps.setTimestamp(1, consulta.getFecha_hora());
                ps.setString(2, consulta.getDiagnostico());
                ps.setString(3, consulta.getTratamiento());

                filasAfectadas = ps.executeUpdate();
                if (filasAfectadas == 0) {
                    logger.severe("La insercion de la consulta ha fallado");
                }
                else{
                    logger.info("Insercion de consulta con exito");
                }

                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        consulta.setId_Consulta(rs.getInt(1));
                        logger.info("Consulta creada exitosamente con ID: " + consulta.getId_Consulta());

                    } else {
                        logger.severe("No se pudo generar el ID de la consulta ");
                    }

                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CitaDAO.class.getName()).log(Level.SEVERE, "Error al registrar consulta", ex);
            throw new PersistenciaExcption("Error al registrar la consulta en la base de datos ");
        }
        return filasAfectadas != 0;
    }
    
    
    
    
    


    
}

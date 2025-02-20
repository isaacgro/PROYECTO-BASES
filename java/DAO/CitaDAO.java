/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.IConexion;
import Entidades.Cita;
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
 * @author mmax2
 */
public class CitaDAO implements ICitaDAO {

    private final IConexion conexion;

    public CitaDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean registraCitaR(Cita cita) throws PersistenciaExcption {
        String consultaSQL = "INSERT INTO CITAS (estado, fecha_hora, id_Paciente, id_Medico) VALUES (?,?,?,?)";
        String Verificacion = "SELECT COUNT(*) FROM CITAS WHERE fecha_hora = ? and id_Medico = ?";
        int r = 0;

        try (Connection cone = this.conexion.crearConexion();) {
            cone.setAutoCommit(false);
            
            try (PreparedStatement vrs = cone.prepareStatement(Verificacion);){
                vrs.setObject(1, cita.getFecha_hora());
                vrs.setObject(2, cita.getMedico());
                
                try (ResultSet res = vrs.executeQuery()){
                    if(res.next() && res.getInt(1)>0){
                        throw new PersistenciaExcption("El horario se encuentra ocupado");
                    }
                }
            
            }

            try (PreparedStatement ps = cone.prepareStatement(consultaSQL, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, cita.getEstado());
                ps.setObject(2, cita.getFecha_hora());
                ps.setObject(3, cita.getPaciente());
                ps.setObject(4, cita.getMedico());
                
                r = ps.executeUpdate();

                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (!rs.next()) {
                        throw new PersistenciaExcption("NO se pudo generar la conexion");
                    }
                    int idP = rs.getInt(1);
                }
            }
            cone.commit();
        } catch (SQLException e) {
            throw new PersistenciaExcption("No se pudo realizar la operacion");
        }

        return r != 0;
    }
}

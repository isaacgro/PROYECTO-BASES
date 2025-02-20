/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Excepciones.PersistenciaExcption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mmax2
 */
public class Conexion implements IConexion {

    /*Este atributo permite obtener el URL de la base de datos*/
    final String URL = "jdbc:mysql://localhost:3306/hospitalBDA";
    /*Este atributo permite obtener el nombre de usuario de MySQL*/
    final String USER = "root";
    /*Este atributo permite obtener la password de la base de datos*/
    final String PASS = "Mario";

    /**
     * Este metodo genera una conexion con la base de datos de MySQL
     *
     * @throws Excepciones.PersistenciaExcption
     */
    @Override
    public Connection crearConexion() throws PersistenciaExcption {
        try (
                Connection conexion = DriverManager.getConnection(URL, USER, PASS);) {
            return conexion;
        } catch (SQLException e) {
            throw new PersistenciaExcption("No se pudo generar la conexion");
        }
    }

}

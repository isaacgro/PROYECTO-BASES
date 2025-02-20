/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Conexion;

import Excepciones.PersistenciaExcption;
import java.sql.Connection;

/**
 *
 * @author mmax2
 */
public interface IConexion {

    /**
     * Este metodo genera la conexion con la base de datos
     *
     * @return
     * @throws Excepciones.PersistenciaExcption
     */
    public Connection crearConexion() throws PersistenciaExcption;
}

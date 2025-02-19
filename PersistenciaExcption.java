/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 * Esta clase es una excepcion personalisada para el proyecto persistencia
 *
 * @author Alejandro Preciado
 */
public class PersistenciaExcption extends Exception {

    /**
     * Metodo que devuelve un mesaje de error en caso de ser invocado
     *
     * @param message mensaje que se envia
     */
    public PersistenciaExcption(String message) {
        super(message);
    }

    /**
     * Metodo que devuelve un mesaje de error junto a su causa en caso de ser
     * invocado
     *
     * @param message mensaje que se envia
     * @param cause casua del error
     */
    public PersistenciaExcption(String message, Throwable cause) {
        super(message, cause);
    }

}

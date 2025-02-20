/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Cita;
import Excepciones.PersistenciaExcption;

/**
 *
 * @author mmax2
 */
public interface ICitaDAO {
    
    
    
    /**
     * Metodo que regresa falso o verdadero depediendo de si se logro agendar o
     * no una cita
     * @param cita recibe un objeto de tipo cita que le proprociona 
     * toda la informacion para agendar una cita
     * @return 
     * @throws Excepciones.PersistenciaExcption 
     */
    public boolean registraCitaR(Cita cita) throws PersistenciaExcption;

}

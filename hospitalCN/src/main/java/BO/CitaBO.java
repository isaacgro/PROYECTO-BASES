/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.IConexion;
import DAO.CitaDAO;
import DAO.ICitaDAO;
import DTO.CitaDTO;
import Excepciones.PersistenciaExcption;
import Exception.NegocioException;
import Mapper.Mapper;

/**
 *
 * @author janethcristinagalvanquinonez
 */
public class CitaBO {

    private final ICitaDAO citaDAO; 
    
    public CitaBO(IConexion conexion) {
        this.citaDAO = new CitaDAO(conexion);
    }

    
    
    public void registrarCitaR(CitaDTO citaDTO) throws NegocioException, PersistenciaExcption {

         try {
             citaDAO.registraCitaR(Mapper.toEntity(citaDTO));
         }catch(PersistenciaExcption e){
             throw new NegocioException("Error arl registrar la cita" + e.getMessage(), e);
         }

    }

}

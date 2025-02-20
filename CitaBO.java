/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Conexion.IConexion;
import DAO.CitaDAO;
import DAO.ICitaDAO;
import DTO.CitaDTO;
import Entidades.Cita;
import Exception.NegocioException;
import Mapper.CitaMapper;
import java.util.logging.Logger;

/**
 *
 * @author janethcristinagalvanquinonez
 */
public class CitaBO {

    private static final Logger logger = Logger.getLogger(CitaBO.class.getName());
    ICitaDAO citaDAO;
    private final CitaMapper mapper = new CitaMapper();

    
    
    
    
    public CitaBO(IConexion conexion) {
        this.citaDAO = new CitaDAO(conexion);
    }

    
    
    public boolean agregarCita(CitaDTO citadto) throws NegocioException {

        
        if (citadto == null) {
            throw new NegocioException("No existe una cita");
        }

        
        Cita cita = mapper.toEntity(citadto);

        try {
            //devuelve True si se logro registrar la cita
            return citaDAO.registraCitaR(cita);

        } catch (Exception e) {

            logger.severe("Error al agregar la cita: " + e.getMessage());
            throw new NegocioException("Error al agregar la cita.", e);
        }

    }

}

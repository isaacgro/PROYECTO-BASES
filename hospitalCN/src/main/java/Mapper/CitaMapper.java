/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapper;

import DTO.CitaDTO;
import Entidades.Cita;
import java.time.LocalDate;

/**
 *
 * @author janethcristinagalvanquinonez
 */
public class CitaMapper {
    
    
    
  public Cita toEntity(CitaDTO cita) {
        if (cita == null) {
            return null;
        }
        return 
         new Cita(cita.getEstado(), 
                 cita.getFecha_hora(), 
                 cita.getPaciente(), 
                 cita.getMedico()
         );
 }
}

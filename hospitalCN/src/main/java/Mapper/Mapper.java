/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapper;

import DTO.*;
import Entidades.*;

/**
 *
 * @author janethcristinagalvanquinonez
 */
public class Mapper {

    public static Cita toEntity(CitaDTO citaDTO) {
        if (citaDTO == null) {
            return null;
        }
        
        Paciente paciente = toEntity(citaDTO.getPaciente());
        Medico medico = toEntity(citaDTO.getMedico());
        return new Cita(citaDTO.getId_Cita(),citaDTO.getEstado(), citaDTO.getFecha_hora(), paciente, medico);
    }
    
    public static Paciente toEntity (PacienteDTO pacienteDTO) {
        if (pacienteDTO == null){
            return null;
        }
        
        Usuario usuario = toEntity(pacienteDTO.getUsuario());
        return new Paciente(pacienteDTO.getId_Paciente(),pacienteDTO.getFecha_nacimiento(), pacienteDTO.getEdad(), pacienteDTO.getTelefono(), pacienteDTO.getCorreoE(), pacienteDTO.getNombre(), pacienteDTO.getApellidoP(), pacienteDTO.getApellidoM(), usuario);
                
        
    }
    
    public static Usuario toEntity (UsuarioDTO usuarioDTO)  {
        if (usuarioDTO == null){
            return null;
        }
        
        return new Usuario(
                    usuarioDTO.getId_Usuario(),
                    usuarioDTO.getContra()
        );
    }
    
    public static Medico toEntity (MedicoDTO medicoDTO) {
        if  (medicoDTO ==null)  {
            return null;
        }
        
        Horario horario = toEntity(medicoDTO.getHorario());
        Usuario usuario = toEntity(medicoDTO.getUsuario());
        
        return new Medico (
                    medicoDTO.getId_Medico(),
                    medicoDTO.getCedulaPro(),
                    medicoDTO.getEspecialidad(), horario,
                    medicoDTO.getNombre(),
                    medicoDTO.getApellidoP(),
                    medicoDTO.getApellidoM(),usuario
                    
        );
    }
    
    public static Horario toEntity(HorarioDTO horarioDTO){
        if(horarioDTO == null){
            return null;
        }
        
        Consulta consulta = toEntity (horarioDTO.getConsulta());
        
        return new Horario(
                horarioDTO.getId_Horario(),
                horarioDTO.getFecha(),
                horarioDTO.getHora_inicio(),
                horarioDTO.getHora_fin(), consulta
                
        );
    }
    
    public static Consulta toEntity (ConsultaDTO consultaDTO){
        if (consultaDTO == null){
            return null;
        }
        
        return new Consulta(
                    consultaDTO.getId_Consulta(),
                    consultaDTO.getFecha_hora(),
                    consultaDTO.getTratamiento(),
                    consultaDTO.getDiagnostico()
        );
    }

}

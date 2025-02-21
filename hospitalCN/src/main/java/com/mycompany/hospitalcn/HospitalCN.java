/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hospitalcn;

import BO.CitaBO;
import Conexion.Conexion;
import Conexion.IConexion;
import DTO.CitaDTO;
import DTO.ConsultaDTO;
import DTO.HorarioDTO;
import DTO.MedicoDTO;
import DTO.PacienteDTO;
import DTO.UsuarioDTO;
import Excepciones.PersistenciaExcption;
import Exception.NegocioException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;

/**
 *
 * @author janethcristinagalvanquinonez
 */
public class HospitalCN {

    public static void main(String[] args) throws NegocioException, PersistenciaExcption {
        IConexion conexion = new Conexion();
        CitaBO citaBO = new CitaBO(conexion);

        probarRegistraCita(citaBO);

    }

    public static void probarRegistraCita(CitaBO citaBO) throws NegocioException, PersistenciaExcption {
        try {
            UsuarioDTO usuarioMedico = new UsuarioDTO(1, "contraMedico123");
            UsuarioDTO usuarioPaciente = new UsuarioDTO(2, "contraPaciente456");

            // Crear un objeto PacienteDTO
            PacienteDTO paciente = new PacienteDTO(
                    1, // id_Paciente
                    LocalDate.of(1990, 5, 12), // fecha_nacimiento
                    35, // edad
                    "555-1234", // teléfono
                    "paciente@mail.com", // correo electrónico
                    "Juan", // nombre
                    "Pérez", // apellido paterno
                    "López", // apellido materno
                    usuarioPaciente // objeto UsuarioDTO para el paciente
            );

            // Crear un objeto ConsultaDTO
            ConsultaDTO consulta = new ConsultaDTO(
                    3, // id_Consulta
                    LocalDate.now(), // fecha_hora (se utiliza la fecha actual)
                    "Tratamiento de ejemplo", // tratamiento
                    "Diagnóstico de ejemplo" // diagnostico
            );

            // Crear un objeto HorarioDTO
            HorarioDTO horario = new HorarioDTO(
                    3, // id_Horario
                    LocalDate.now(), // fecha (fecha actual)
                    Time.valueOf("09:00:00"), // hora_inicio
                    Time.valueOf("10:00:00"), // hora_fin
                    consulta // objeto ConsultaDTO
            );

            // Crear un objeto MedicoDTO
            MedicoDTO medico = new MedicoDTO(
                    1, // id_Medico
                    "C1234567", // cedulaPro
                    "Cardiología", // especialidad
                    horario, // objeto HorarioDTO
                    "María", // nombre
                    "García", // apellido paterno
                    "Rodríguez", // apellido materno
                    usuarioMedico // objeto UsuarioDTO para el médico
            );

            CitaDTO citaDTO = new CitaDTO(
                    3, // id_Cita
                    "Pendiente", // estado
                    new Timestamp(System.currentTimeMillis()), // fecha_hora actual
                    paciente, // objeto PacienteDTO
                    medico // objeto MedicoDTO
            );

            citaBO.registrarCitaR(citaDTO);
            System.out.println("Cita registrada con exito");
        } catch (NegocioException e) { 
            System.err.println("Error al generar la cita" + e.getMessage() );
        }

    }
}

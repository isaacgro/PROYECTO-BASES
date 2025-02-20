/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Conexion.Conexion;
import Conexion.IConexion;
import DAO.CitaDAO;
import Entidades.Cita;
import Entidades.Horario;
import Entidades.Medico;
import Entidades.Paciente;
import Entidades.Usuario;
import Excepciones.PersistenciaExcption;
import java.time.LocalDate;

/**
 *
 * @author mmax2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConexion conexion = new Conexion ();
        Usuario usuarioMedico = new Usuario();
        usuarioMedico.setId_Usuario(1);
        usuarioMedico.setContra("med123");
        usuarioMedico.setNombre("Carlos");
        usuarioMedico.setApellidoP("Lopez");
        usuarioMedico.setApellidoM("Ramirez");

        Usuario usuarioPaciente = new Usuario();
        usuarioPaciente.setId_Usuario(2);
        usuarioPaciente.setContra("pac456");
        usuarioPaciente.setNombre("Maria");
        usuarioPaciente.setApellidoP("Gonzalez");
        usuarioPaciente.setApellidoM("Perez");

        
        Horario horario = new Horario();
        horario.setId_Horario(1);
        horario.setFecha(LocalDate.of(2025, 2, 21)); 
        horario.setHora_inicio(LocalDate.of(2025, 2, 21)); 
        horario.setHora_fin(LocalDate.of(2025, 2, 21));    

        
        Medico medico = new Medico();
        medico.setId_Medico(1);
        medico.setCedulaPro("MED12345");
        medico.setEspecialidad("Cardiología");
        medico.setHorario(horario);
        medico.setUsuario(usuarioMedico);

        
        Paciente paciente = new Paciente();
        paciente.setId_Paciente(1);
        paciente.setFecha_nacimiento(LocalDate.of(1995, 5, 15));
        paciente.setEdad(29);
        paciente.setTelefono("555-123-4567");
        paciente.setCorreoE("maria.perez@gmail.com");
        paciente.setUsuario(usuarioPaciente);

        
        Cita cita = new Cita();
        cita.setId_Cita(1);
        cita.setEstado("Pendiente");
        cita.setFecha_hora(LocalDate.of(2025, 2, 21));
        cita.setPaciente(paciente);
        cita.setMedico(medico);

        
        try {
            CitaDAO citaDAO = new CitaDAO(conexion); 
            boolean resultado = citaDAO.registraCitaR(cita);

            if (resultado) {
                System.out.println("✅ Cita registrada con éxito");
            } else {
                System.out.println("❌ No se pudo registrar la cita");
            }
        } catch (PersistenciaExcption e) {
            System.out.println("⚠️ Error al registrar la cita: " + e.getMessage());
        }
    }
    
}

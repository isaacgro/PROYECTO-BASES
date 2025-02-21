/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Entidades.Medico;
import Entidades.Paciente;
import java.sql.Timestamp;

/**
 *
 * @author janethcristinagalvanquinonez
 */
public class CitaDTO {
    private int id_Cita;
    private String estado;
    private Timestamp fecha_hora;
    private PacienteDTO paciente;
    private MedicoDTO medico;

    public CitaDTO() {
    }

    public CitaDTO(int id_Cita, String estado, Timestamp fecha_hora, PacienteDTO paciente, MedicoDTO medico) {
        this.id_Cita = id_Cita;
        this.estado = estado;
        this.fecha_hora = fecha_hora;
        this.paciente = paciente;
        this.medico = medico;
    }
    
    public int getId_Cita(){return id_Cita;}
    public String getEstado () {return estado;}
    public Timestamp getFecha_hora () {return fecha_hora;}
    public PacienteDTO getPaciente () {return  paciente;}
    public MedicoDTO getMedico ()  {return medico;}

    @Override
    public String toString() {
        return "CitaDTO{" + ", estado=" + estado + ", fecha_hora=" + fecha_hora + ", paciente=" + paciente + ", medico=" + medico + '}';
    }

}

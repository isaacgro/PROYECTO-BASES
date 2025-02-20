/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Entidades.Medico;
import Entidades.Paciente;
import java.time.LocalDate;

/**
 *
 * @author janethcristinagalvanquinonez
 */
public class CitaDTO {
    private int id_Cita;
   private String estado;
   private LocalDate fecha_hora;
   private Paciente paciente;
   private Medico medico;

    public CitaDTO() {
    }

    public CitaDTO(int id_Cita, String estado, LocalDate fecha_hora, Paciente paciente, Medico medico) {
        this.id_Cita = id_Cita;
        this.estado = estado;
        this.fecha_hora = fecha_hora;
        this.paciente = paciente;
        this.medico = medico;
    }

    public CitaDTO(String estado, LocalDate fecha_hora, Paciente paciente, Medico medico) {
        this.estado = estado;
        this.fecha_hora = fecha_hora;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getId_Cita() {
        return id_Cita;
    }

    public void setId_Cita(int id_Cita) {
        this.id_Cita = id_Cita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "CitaDTO{" + "id_Cita=" + id_Cita + ", estado=" + estado + ", fecha_hora=" + fecha_hora + ", paciente=" + paciente + ", medico=" + medico + '}';
    }
   
   
   
   

}

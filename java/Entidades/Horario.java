/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 * Clase que representa a al entidad horario de la base de datos
 * @author mmax2
 */
public class Horario {
    private int id_Horario;
    private LocalDate fecha;
    private LocalDate hora_inicio; 
    private LocalDate hora_fin; 
    private Consulta consulta;

    public Horario() {
    }

    public Horario(int id_Horario, LocalDate fecha, LocalDate hora_inicio, LocalDate hora_fin, Consulta consulta) {
        this.id_Horario = id_Horario;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.consulta = consulta;
    }

    public Horario(LocalDate fecha, LocalDate hora_inicio, LocalDate hora_fin, Consulta consulta) {
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.consulta = consulta;
    }

    public int getId_Horario() {
        return id_Horario;
    }

    public void setId_Horario(int id_Horario) {
        this.id_Horario = id_Horario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalDate hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public LocalDate getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(LocalDate hora_fin) {
        this.hora_fin = hora_fin;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    @Override
    public String toString() {
        return "Horario{" + "id_Horario=" + id_Horario + ", fecha=" + fecha + ", hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin + ", consulta=" + consulta + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *Clase que referencia a la entidad horario_consulta de la base de datos
 * @author mmax2
 */
public class HorarioConsulta {
    private int id_HorarioConsulta;
    private LocalDate hora_inicio;
    private LocalDate hora_fin;
    private Horario horario;
    private Consulta consulta;

    public HorarioConsulta() {
    }

    public HorarioConsulta(int id_HorarioConsulta, LocalDate hora_inicio, LocalDate hora_fin, Horario horario, Consulta consulta) {
        this.id_HorarioConsulta = id_HorarioConsulta;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.horario = horario;
        this.consulta = consulta;
    }

    public HorarioConsulta(LocalDate hora_inicio, LocalDate hora_fin, Horario horario, Consulta consulta) {
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.horario = horario;
        this.consulta = consulta;
    }

    public int getId_HorarioConsulta() {
        return id_HorarioConsulta;
    }

    public void setId_HorarioConsulta(int id_HorarioConsulta) {
        this.id_HorarioConsulta = id_HorarioConsulta;
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

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    @Override
    public String toString() {
        return "HorarioConsulta{" + "id_HorarioConsulta=" + id_HorarioConsulta + ", hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin + ", horario=" + horario + ", consulta=" + consulta + '}';
    }
}

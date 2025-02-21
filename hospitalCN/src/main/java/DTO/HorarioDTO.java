/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Entidades.Consulta;
import java.sql.Time;
import java.time.LocalDate;

/**
 *
 * @author mmax2
 */
public class HorarioDTO {
    private int id_Horario;
    private LocalDate fecha;
    private Time hora_inicio; 
    private Time hora_fin; 
    private ConsultaDTO consulta;

    public HorarioDTO(int id_Horario, LocalDate fecha, Time hora_inicio, Time hora_fin, ConsultaDTO consulta) {
        this.id_Horario = id_Horario;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.consulta = consulta;
    }

    public int getId_Horario () {return id_Horario;}
    public LocalDate getFecha () {return fecha;}
    public Time getHora_inicio () {return hora_inicio;}
    public Time getHora_fin () {return hora_fin;}
    public ConsultaDTO getConsulta () {return consulta;}
    
    @Override
    public String toString() {
        return "HorarioDTO{" + "id_Horario=" + id_Horario + ", fecha=" + fecha + ", hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin + ", consulta=" + consulta + '}';
    }
    
    
}

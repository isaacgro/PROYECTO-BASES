/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;

/**
 *
 * @author mmax2
 */
public class ConsultaDTO {
    private int id_Consulta;
    private LocalDate fecha_hora;
    private String tratamiento;
    private String diagnostico;

    public ConsultaDTO(int id_Consulta, LocalDate fecha_hora, String tratamiento, String diagnostico) {
        this.id_Consulta = id_Consulta;
        this.fecha_hora = fecha_hora;
        this.tratamiento = tratamiento;
        this.diagnostico = diagnostico;
    }
    
    public int getId_Consulta ()  {return id_Consulta;}
    public LocalDate getFecha_hora  ()  {return fecha_hora;}
    public String getTratamiento () {return tratamiento;}
    public String getDiagnostico () {return diagnostico;}

    @Override
    public String toString() {
        return "ConsultaDTO{" + "id_Consulta=" + id_Consulta + ", fecha_hora=" + fecha_hora + ", tratamiento=" + tratamiento + ", diagnostico=" + diagnostico + '}';
    }
    
    
}

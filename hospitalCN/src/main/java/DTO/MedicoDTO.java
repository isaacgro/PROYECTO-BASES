/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Entidades.Horario;
import Entidades.Usuario;

/**
 *
 * @author mmax2
 */
public class MedicoDTO {
    private int id_Medico;
    private String cedulaPro;
    private String especialidad;
    private HorarioDTO horario;
    private String nombre; // Atributo que hacer referencia al nombre del usuario
    private String apellidoP; // Atributo que hace referencia al apellido paterno del usuario
    private String apellidoM;
    private UsuarioDTO usuario; 

    public MedicoDTO(int id_Medico, String cedulaPro, String especialidad, HorarioDTO horario, String nombre, String apellidoP, String apellidoM, UsuarioDTO usuario) {
        this.id_Medico = id_Medico;
        this.cedulaPro = cedulaPro;
        this.especialidad = especialidad;
        this.horario = horario;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.usuario = usuario;
    }

    public int getId_Medico() {
        return id_Medico;
    }

    public String getCedulaPro() {
        return cedulaPro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public HorarioDTO getHorario() {
        return horario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }
    
    

    @Override
    public String toString() {
        return "MedicoDTO{" + "id_Medico=" + id_Medico + ", cedulaPro=" + cedulaPro + ", especialidad=" + especialidad + ", horario=" + horario + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", usuario=" + usuario + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *Clase que representa a la entidad medico de la base de datos
 * @author mmax2
 */
public class Medico {
    private int id_Medico;
    private String cedulaPro;
    private String especialidad;
    private Horario horario;
    private Usuario usuario;

    public Medico() {
    }

    public Medico(int id_Medico, String cedulaPro, String especialidad, Horario horario, Usuario usuario) {
        this.id_Medico = id_Medico;
        this.cedulaPro = cedulaPro;
        this.especialidad = especialidad;
        this.horario = horario;
        this.usuario = usuario;
    }

    public Medico(String cedulaPro, String especialidad, Horario horario, Usuario usuario) {
        this.cedulaPro = cedulaPro;
        this.especialidad = especialidad;
        this.horario = horario;
        this.usuario = usuario;
    }

    public int getId_Medico() {
        return id_Medico;
    }

    public void setId_Medico(int id_Medico) {
        this.id_Medico = id_Medico;
    }

    public String getCedulaPro() {
        return cedulaPro;
    }

    public void setCedulaPro(String cedulaPro) {
        this.cedulaPro = cedulaPro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Medico{" + "id_Medico=" + id_Medico + ", cedulaPro=" + cedulaPro + ", especialidad=" + especialidad + ", horario=" + horario + ", usuario=" + usuario + '}';
    }
    
    
}

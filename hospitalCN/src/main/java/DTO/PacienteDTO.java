/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Entidades.Usuario;
import java.time.LocalDate;

/**
 *
 * @author mmax2
 */
public class PacienteDTO {

    private int id_Paciente;
    private LocalDate fecha_nacimiento;
    private int edad;
    private String telefono;
    private String correoE;
    private String nombre; // Atributo que hacer referencia al nombre del usuario
    private String apellidoP; // Atributo que hace referencia al apellido paterno del usuario
    private String apellidoM;
    private UsuarioDTO usuario;

    public PacienteDTO(int id_Paciente, LocalDate fecha_nacimiento, int edad, String telefono, String correoE, String nombre, String apellidoP, String apellidoM, UsuarioDTO usuario) {
        this.id_Paciente = id_Paciente;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.telefono = telefono;
        this.correoE = correoE;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.usuario = usuario;
    }

    public int getId_Paciente() {
        return id_Paciente;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoE() {
        return correoE;
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
        return "PacienteDTO{" + "id_Paciente=" + id_Paciente + ", fecha_nacimiento=" + fecha_nacimiento + ", edad=" + edad + ", telefono=" + telefono + ", correoE=" + correoE + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", usuario=" + usuario + '}';
    }

}

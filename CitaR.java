/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 * Clase que referencia a la clase consulta_regular de la base de datos
 * 
 * @author mmax2
 */
public class CitaR {
    private int id_CitaR;
    private Cita cita;

    public CitaR() {
    }

    public CitaR(int id_CitaR, Cita cita) {
        this.id_CitaR = id_CitaR;
        this.cita = cita;
    }

    public CitaR(Cita cita) {
        this.cita = cita;
    }

    public int getId_CitaR() {
        return id_CitaR;
    }

    public void setId_CitaR(int id_CitaR) {
        this.id_CitaR = id_CitaR;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String toString() {
        return "CitaR{" + "id_CitaR=" + id_CitaR + ", cita=" + cita + '}';
    }
}

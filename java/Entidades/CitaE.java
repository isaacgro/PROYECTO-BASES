/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *Clase que referencia a la entidad citas_emergencia de la base de datos
 * 
 * @author mmax2
 */
public class CitaE {
    private int id_CitaE;
    private String folio;
    private Cita cita;

    public CitaE() {
    }

    public CitaE(int id_CitaE, String folio, Cita cita) {
        this.id_CitaE = id_CitaE;
        this.folio = folio;
        this.cita = cita;
    }

    public CitaE(String folio, Cita cita) {
        this.folio = folio;
        this.cita = cita;
    }

    public int getId_CitaE() {
        return id_CitaE;
    }

    public void setId_CitaE(int id_CitaE) {
        this.id_CitaE = id_CitaE;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String toString() {
        return "CitaE{" + "id_CitaE=" + id_CitaE + ", folio=" + folio + ", cita=" + cita + '}';
    }
}

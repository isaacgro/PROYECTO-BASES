/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author mmax2
 */
public class UsuarioDTO {
    private int id_Usuario; // Atributo que hace referencia al id del usuario
    private String contra;

    public UsuarioDTO(int id_Usuario, String contra) {
        this.id_Usuario = id_Usuario;
        this.contra = contra;
    }
    
    public int getId_Usuario () {return id_Usuario;}
    public String getContra () {return contra;}

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id_Usuario=" + id_Usuario + ", contra=" + contra + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DTOs;

/**
 *
 * @author sala8
 */
public class VehiculoDTO {
    String matricula = "";
    String nombre_v = "";
    String modelo = "";
    String color = "";
    String precio = "";
    String disponible = "";
    String id_TipoV ="";
     String id_marca ="";
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
     public String getNombre_v() {
        return nombre_v;
    }

    public void setNombre_v(String nombre_v) {
        this.nombre_v = nombre_v;
    }

     public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
     public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
     public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
         public String getId_TipoV() {
        return id_marca;
    }

    public void setId_TipoV(String id_TipoV) {
        this.id_TipoV = id_TipoV;
    }
         public String getId_marca() {
        return id_marca;
    }

    public void setId_marca(String id_marca) {
        this.id_marca = id_marca;
    }
}

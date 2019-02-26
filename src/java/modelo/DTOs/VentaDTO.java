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
public class VentaDTO {
    String numero = "";
    String precio_total = "";
    String id_persona = "";
    String id_vehiculo = "";
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
     public String getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(String precio_total) {
        this.precio_total = precio_total;
    }

     public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }
      public String getId_vehiculo() {
        return id_persona;
    }

    public void setId_vehiculo(String id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

}

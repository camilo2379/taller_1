/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAOs;

import modelo.DTOs.VentaDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author sala8
 */
public class VentaMySQLDbDAO implements VentaDAO{

    public boolean insert(DataSource ds, VentaDTO v)
    {
        boolean rta = false;
        Connection con = null;
        Statement stmt = null;        
        try {
                con = ds.getConnection();
                stmt = con.createStatement();
                rta = stmt.execute("insert into venta (numero,"
                        + "precio_total,id_persona,id_vehiculo)"
                        + " values ("+v.getNumero()+", '"+v.getPrecio_total()+"', '"+v.getId_persona()+"', "
                        + "'"+v.getId_vehiculo()+"')");
                
        } catch (SQLException e) {
                e.printStackTrace();
        }finally{
            try {
                    if(stmt != null) stmt.close();
                    if(con != null) con.close();
            } catch (SQLException e) {
                    e.printStackTrace();
            }
        }
        return rta;
    }
    public List<VentaDTO> consulta(DataSource ds, String num)
    {
        List<VentaDTO> datos = new ArrayList<VentaDTO>();
        
        Statement s;
        try {
            
            s = ds.getConnection().createStatement();
            ResultSet rs = s.executeQuery ("select numero,precio_total, "
                    + "id_persona, id_vehiculo " 
                    + " from venta" 
                    + " where numero = " + num);
            while (rs.next())
            {
                VentaDTO v = new VentaDTO();
                v.setNumero(rs.getString(1));
                v.setPrecio_total(rs.getString(2));
                v.setId_persona(rs.getString(3));
                v.setId_vehiculo(rs.getString(4));
                datos.add(v);
                
            }
            
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return datos;
    }
    
}

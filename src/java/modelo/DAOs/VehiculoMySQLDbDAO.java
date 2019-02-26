/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAOs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import modelo.DTOs.VehiculoDTO;

/**
 *
 * @author sala8
 */
public class VehiculoMySQLDbDAO implements VehiculoDAO{

    public boolean insert(DataSource ds, VehiculoDTO v)
    {
        boolean rta = false;
        Connection con = null;
        Statement stmt = null;        
        try {
                con = ds.getConnection();
                stmt = con.createStatement();
                rta = stmt.execute("insert into vehiculo (matricula,"
                        + "nombre_v,modelo, color, precio, disponible,id_TipoV,id_marca)"
                        + " values ("+v.getMatricula()+", '"+v.getNombre_v()+"', '"+v.getModelo()+"', "
                        + "'"+v.getColor()+"', '"+v.getPrecio()+"', '"+v.getDisponible()+"', '"+v.getId_TipoV()+"', '"+v.getId_marca()+"')");
                
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
    public List<VehiculoDTO> consulta(DataSource ds, String mat, String nombreV)
    {
        List<VehiculoDTO> datos = new ArrayList<VehiculoDTO>();
        
        Statement s;
        try {
            
            s = ds.getConnection().createStatement();
            ResultSet rs = s.executeQuery ("select matricula,nombre_v, "
                    + "modelo, color, precio, disponible,id_TipoV,id_marca " 
                    + " from vehiculo" 
                    + " where matricula = " + mat);
            while (rs.next())
            {
                VehiculoDTO v = new VehiculoDTO();
                v.setMatricula(rs.getString(1));
                v.setNombre_v(rs.getString(2));
                v.setModelo(rs.getString(3));
                v.setColor(rs.getString(4));
                v.setPrecio(rs.getString(5));
                v.setDisponible(rs.getString(6));
                v.setId_TipoV(rs.getString(7));
                v.setId_marca(rs.getString(8));
                datos.add(v);
            }
            
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return datos;
    }
    
}

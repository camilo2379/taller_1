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
import modelo.DTOs.PersonaDTO;

/**
 *
 * @author sala8
 */
public class PersonaMySQLDbDAO implements PersonaDAO{

    @Override
    public boolean insert(DataSource ds, PersonaDTO p)
    {
        boolean rta = false;
        Connection con = null;
        Statement stmt = null;        
        try {
                con = ds.getConnection();
                stmt = con.createStatement();
                rta = stmt.execute("insert into persona (identificacion,"
                        + "nombre_1, nombre_2, apellido_1, apellido_2, genero, telefono, email,"
                        + "fecha_nacimiento, id_TipoP)"
                        + " values ("+p.getIdentificacion()+", '"+p.getNombre_1()+"', '"+p.getNombre_2()+"', '"+p.getApellido_1()+"', "
                        + "'"+p.getApellido_2()+"', '"+p.getGenero()+"', '"+p.getTelefono()+"','"+p.getEmail()+"',"
                        + "'"+p.getFecha_nacimiento()+"', '"+p.getId_TipoP()+"')");
                
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
    @Override
    public List<PersonaDTO> consulta(DataSource ds, String id, String nombre1, String apellido1)
    {
       List<PersonaDTO> datos = new ArrayList<PersonaDTO>();
        
        Statement s;
        try {
            
            s = ds.getConnection().createStatement();
            ResultSet rs = s.executeQuery ("select identificacion,nombre_1, "
                    + "nombre_2, apellido_1, apellido_2, genero, telefono, "
                    + "email,fecha_nacimiento, id_TipoP" 
                    + " from persona" 
                    + " where identificacion = " + id);
            while (rs.next())
            {
               PersonaDTO p = new PersonaDTO();
                p.setIdentificacion(rs.getString(1));
                p.setNombre_1(rs.getString(2));
                p.setNombre_2(rs.getString(3));
                p.setApellido_1(rs.getString(4));
                p.setApellido_2(rs.getString(5));
                p.setGenero(rs.getString(6));
                p.setTelefono(rs.getString(7));
                p.setEmail(rs.getString(8));
                p.setFecha_nacimiento(rs.getString(9));
                p.setId_TipoP(rs.getString(10));
                datos.add(p);
            }
            
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return datos;
    }
    
}

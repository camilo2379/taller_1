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
public interface VentaDAO {
    public boolean insert(DataSource ds, VentaDTO v);
    public List<VentaDTO>  consulta(DataSource ds, String num);
}

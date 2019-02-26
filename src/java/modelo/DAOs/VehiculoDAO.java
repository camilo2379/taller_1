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
public interface VehiculoDAO {
    public boolean insert(DataSource ds, VehiculoDTO p);
    public List<VehiculoDTO> consulta(DataSource ds, String mat, String nombreV);
}

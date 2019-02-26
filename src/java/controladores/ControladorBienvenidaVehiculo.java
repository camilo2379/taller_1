/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import modelo.DAOs.DAOFactory;
import modelo.DTOs.VehiculoDTO;
import util.MyDataSourceFactory;

/**
 *
 * @author sala8
 */
public class ControladorBienvenidaVehiculo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Llegue al controlador....");
        
        String mat = request.getParameter("matricula");
        String nombreV = request.getParameter("nombreV");
        String modelo = request.getParameter("modelo");
        String color = request.getParameter("color");
        String precio = request.getParameter("precio");
        String disponible = request.getParameter("disponible");
        String tipov = request.getParameter("tipov");
        String marca = request.getParameter("marca");
        VehiculoDTO vehiculo = new VehiculoDTO();
        vehiculo.setMatricula(mat);
        vehiculo.setNombre_v(nombreV);
        vehiculo.setModelo(modelo);
        vehiculo.setColor(color);
        vehiculo.setPrecio(precio);
        vehiculo.setDisponible(disponible);
        vehiculo.setId_TipoV(tipov);
        vehiculo.setId_marca(marca);
        
        DataSource ds = null;
        
        ds = MyDataSourceFactory.getMySQLDataSource();
        
        DAOFactory pbd = DAOFactory.getDAOFactory(1);
        pbd.getVehiculoDAO().insert(ds,vehiculo);
        
        System.out.println("nombre: " +  nombreV);
        System.out.println("DataSource: " +  ds);
        
        request.setAttribute("parametroservlet1", nombreV);
        RequestDispatcher rd = request.getRequestDispatcher("./paginas/respuestaVehiculo.jsp");
        rd.forward(request, response);
        
        //response.sendRedirect("./paginas/respuesta.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

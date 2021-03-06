/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelo.DTOs.VentaDTO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import modelo.DAOs.DAOFactory;
import util.MyDataSourceFactory;

/**
 *
 * @author sala8
 */
public class ControladorBienvenidaVenta extends HttpServlet {

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
        
        String num = request.getParameter("numeroV");
        String preciot = request.getParameter("preciot");
        String cliente = request.getParameter("cliente");
        String vehiculo = request.getParameter("vehiculo");
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha");
        VentaDTO venta = new VentaDTO();
        venta.setNumero(num);
        venta.setPrecio_total(preciot);
        venta.setId_persona(cliente);
        venta.setId_vehiculo(vehiculo);
        venta.setDescripcion(descripcion);
        venta.setFecha(fecha);
        DataSource ds = null;
        
        ds = MyDataSourceFactory.getMySQLDataSource();
        
        DAOFactory pbd = DAOFactory.getDAOFactory(1);
        pbd.getVentaDAO().insert(ds,venta);
        
        System.out.println("nombre: " +  num);
        System.out.println("DataSource: " +  ds);
        
        request.setAttribute("parametroservlet2", num);
        RequestDispatcher rd = request.getRequestDispatcher("./paginas/respuestaVenta.jsp");
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

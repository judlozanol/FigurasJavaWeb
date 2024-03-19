/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import logica.Circulo;
import logica.Cuadrado;
import logica.Figura;
import logica.Rectangulo;
import logica.Triangulo;

/**
 *
 * @author birdo
 */
@WebServlet(name = "Entrega", urlPatterns = {"/Entrega"})
public class Entrega extends HttpServlet {

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
        Figura figura;
        String calculo;
        String valor;
        figura = new Circulo();
        
        if("triangulo".equals(request.getParameter("figura"))){
            figura = new Triangulo();
        }else if("rectangulo".equals(request.getParameter("figura"))){
            figura = new Rectangulo();   
        }else if("cuadrado".equals(request.getParameter("figura"))){
            figura = new Cuadrado();
        }
        
        figura.setPunto1(Integer.parseInt(request.getParameter("x1")), 
                        Integer.parseInt(request.getParameter("y1")));
        figura.setPunto2(Integer.parseInt(request.getParameter("x2")), 
                        Integer.parseInt(request.getParameter("y2")));
        
        if ("area".equals(request.getParameter("calculo"))){
            calculo = "área";
            valor = String.format("%.2f", figura.calcularArea());
        } else {
            calculo = "perímetro";
            valor = String.format("%.2f", figura.calcularPerimetro());
        }
        
        response.setContentType("text/html");
        try(PrintWriter out = response.getWriter()){
            out.println("<script type=\"text/javascript\">");
            out.println("alert('El "+calculo+" del "
                        + figura.getClass().getSimpleName()+" ingresado es: "
                        + valor +"')");
            out.println("window.location.href = 'index.html';");
            out.println("</script>");
        }
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

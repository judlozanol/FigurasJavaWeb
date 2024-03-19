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

/**
 *
 * @author birdo
 */
@WebServlet(name = "ServletPuntos", urlPatterns = {"/ServletPuntos"})
public class ServletPuntos extends HttpServlet {

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
        String imagen = "";
        String nombre = "";
        response.setContentType("text/html;charset=UTF-8");
        
        if("circulo".equals(request.getParameter("figuras"))){
            imagen = "img/circulo.png";
            nombre = "circulo";
        } else if("triangulo".equals(request.getParameter("figuras"))){
            imagen = "img/triangulo.png";
            nombre = "triangulo";
        } else if("rectangulo".equals(request.getParameter("figuras"))){
            imagen = "img/rectangulo.png";
            nombre = "rectangulo";
        } else if("cuadrado".equals(request.getParameter("figuras"))){
            imagen = "img/cuadrado.png";
            nombre = "cuadrado";
        } 
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
        out.println("<html lang=\"es\">");
        out.println("<head>");
        out.println("    <meta charset=\"UTF-8\">");
        out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("    <title>Formulario de Puntos</title>");
        out.println("    <link rel=\"stylesheet\" href=\"estilos/estilos2.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("    <div class=\"container\">");
        out.println("        <form action=\"Entrega\" method=\"post\">");
        out.println("            <div class=\"form-group\">");
        out.println("                <label for=\"figura\">Figura:</label>");
        out.println("                <input type=\"text\" id=\"figura\" name=\"figura\" placeholder=\"Figura\" value=\""+nombre+"\" readonly>");
        out.println("            </div>");
        out.println("           <h2>Ingrese dos puntos</h2>");
        out.println("            <div class=\"form-group\">");
        out.println("                <label for=\"x1\">Punto 1 (x, y):</label>");
        out.println("                <input type=\"text\" id=\"x1\" name=\"x1\" placeholder=\"x1\" required>");
        out.println("                <input type=\"text\" id=\"y1\" name=\"y1\" placeholder=\"y1\" required>");
        out.println("            </div>");
        out.println("            <div class=\"form-group\">");
        out.println("                <label for=\"x2\">Punto 2 (x, y):</label>");
        out.println("                <input type=\"text\" id=\"x2\" name=\"x2\" placeholder=\"x2\" required>");
        out.println("                <input type=\"text\" id=\"y2\" name=\"y2\" placeholder=\"y2\" required>");
        out.println("            </div>");
        out.println("            <div class=\"form-group\">");
        out.println("                <label for=\"calculo\">Cálculo:</label>");
        out.println("                <select id=\"calculo\" name=\"calculo\" required>");
        out.println("                    <option value=\"area\">Área</option>");
        out.println("                    <option value=\"perimetro\">Perímetro</option>");
        out.println("                </select>");
        out.println("            </div>");
        out.println("            <button type=\"submit\">Enviar</button>");
        out.println("        </form>");
        out.println("    </div>");
        out.println("    <div class=\"image-container\">");
        out.println("        <img src=\""+ imagen +"\" alt=\"Imagen\" class=\"center-image\">");
        out.println("    </div>");
        out.println("</body>");
        out.println("</html>");

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

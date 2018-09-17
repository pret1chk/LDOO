/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LSTI204_A3
 */
@WebServlet(name = "practica1", urlPatterns = {"/practica1"})
public class practica2 extends HttpServlet {

   public void init() throws ServletException {

   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
       String ip = request.getRemoteAddr();
       String host = request.getRemoteHost();
 
      
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
        response.setContentType("text/html");
 
        out.println("<html><head><title>Obtener IP del cliente</title></head><body>");
        out.println("<strong>Obtener la IP del cliente </strong>");
        out.println("La ip del cliente es " + ip + "<br>");
        out.println("El host del cliente es " + host);
        out.println("</body></html>");
   }

    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

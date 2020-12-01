/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordemoedas;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Jake Freitas
 */
@WebServlet(name = "ConversorMoedas", urlPatterns = {"/ConversorMoedas"})
public class ConversorMoedas extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8000/conversormoedas.wsdl")
    private ConversordeMOedasService service;

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
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        String sel = request.getParameter("selectConversao");
        String vs = request.getParameter("valor");
        double vd = Double.parseDouble(vs);
        double result = 0.0;
        
        switch(sel){
            case "1":
                result = realToDolar(vd);
                break;
            case "2":
                result = dolarToReal(vd);
                break;
            case "3":
                result = realToEuro(vd);
                break;
            case "4":
                result = euriToReal(vd);
                break;
                
        }
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConversorMoedas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Valor Conversão: " + formatador.format(result) + "</h1>");
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

    private double dolarToReal(double arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        conversordemoedas.ConversordeMOedas port = service.getConversordeMOedasPort();
        return port.dolarToReal(arg0);
    }

    private double realToDolar(double arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        conversordemoedas.ConversordeMOedas port = service.getConversordeMOedasPort();
        return port.realToDolar(arg0);
    }

    private double realToEuro(double arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        conversordemoedas.ConversordeMOedas port = service.getConversordeMOedasPort();
        return port.realToEuro(arg0);
    }

    private double euriToReal(double arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        conversordemoedas.ConversordeMOedas port = service.getConversordeMOedasPort();
        return port.euriToReal(arg0);
    }

}

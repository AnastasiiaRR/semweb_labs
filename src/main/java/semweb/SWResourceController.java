package semweb;


import semweb.modeljena.ModelResource;
import semweb.modeljena.RDF;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SWResourceController", urlPatterns = {"/create"})
public class SWResourceController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getContextPath();
        String personName = request.getParameter("name");
        String personSurname = request.getParameter("surname");
        ModelResource.create(personName, personSurname);


        ModelResource.generateForm(request, response);
    }
}
package com.example.demoruiz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

@WebServlet(name = "user", value = "/user-servlet")
public class userServlet extends HttpServlet {
    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Crear una respuesta en formato JSON
        JSONObject jsonResponse = new JSONObject();
        // Obtener los datos del formulario
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");


       if (contrasenia.equals("123456")) {
            System.out.println("user juanito");
        } else {
            System.out.println("user not found");
        }

        jsonResponse.put("status", "success");
        jsonResponse.put("message", "Inicio de sesión exitoso");

        // Establecer el tipo de contenido de la respuesta a JSON
        response.setContentType("application/json");

        // Enviar la respuesta al cliente
        response.getWriter().write(jsonResponse.toString());

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entra al get");
        resp.sendRedirect("index.jsp");
    }
}
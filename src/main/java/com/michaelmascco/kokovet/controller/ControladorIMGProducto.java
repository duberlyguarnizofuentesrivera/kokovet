package com.michaelmascco.kokovet.controller;

import com.michaelmascco.kokovet.model.Producto;
import com.michaelmascco.kokovet.model.ProductoDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControladorIMGProducto extends HttpServlet {

    private final ProductoDAO pDao = ProductoDAO();
    List<Producto> productos = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        productos = pDao.listar();
        if (!"ejemplo".equals(accion)) {
            request.setAttribute("productos", productos);
            request.getRequestDispatcher("Productos.jsp").forward(request, response);
        }
    }

    private ProductoDAO ProductoDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        pDao.listarImg(id, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

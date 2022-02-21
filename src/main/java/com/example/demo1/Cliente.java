package com.example.demo1;

import com.example.demo1.model.ClienteModel;
import com.example.demo1.model.ListaDeClientes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cliente", value = "/cliente")
public class Cliente extends HttpServlet {

    ListaDeClientes listaDeClientes = new ListaDeClientes();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String clienteNome = req.getParameter("clienteNome");

        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setNome(clienteNome);

        listaDeClientes.adiciona(clienteModel);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("ClienteCadastrado.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("clientes", listaDeClientes.mostra());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("ListaClientes.jsp");
        requestDispatcher.forward(req, resp);

    }
}

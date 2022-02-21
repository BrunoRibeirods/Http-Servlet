package com.example.demo1.model;

import java.util.ArrayList;
import java.util.List;

public class ListaDeClientes {
    private static List<ClienteModel> clientes = new ArrayList();

    public void adiciona(ClienteModel cliente) {
        ListaDeClientes.clientes.add(cliente);
    }

    public List<ClienteModel> mostra(){
        return ListaDeClientes.clientes;
    }
}

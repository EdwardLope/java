package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionPedido;
import com.example.Store.modelos.Pedido;
import com.example.Store.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PedidoServicio {

    @Autowired
    ValidacionPedido validacionPedido;
    @Autowired
    PedidoServicio pedidoServicio;

    public Pedido guardarPedido(){
        return null;
    }

    public  Usuario buscarPedidoPorId(){
        return null;
    }

    public List<Pedido> buscarTodosPedidos(){
        return null;
    }

    public Pedido modificarPedido(){
        return null;
    }

    public boolean eliminarPedido(){
        return true;
    }

}

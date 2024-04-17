package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionPedido;
import com.example.Store.modelos.Pedido;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorio.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PedidoServicio {

    @Autowired
    ValidacionPedido validacionPedido;
    @Autowired
    PedidoRepositorio pedidoRepositorio;


    public Pedido guardarPedido(Pedido datosPedido) throws Exception{
        try{
            if(validacionPedido.validarFechaHora(datosPedido.getFechaYHora())==false) {
                throw new Exception("NOMBRE INVALIDO, REVISE PORFAVOR");
            }  return pedidoRepositorio.save(datosPedido);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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

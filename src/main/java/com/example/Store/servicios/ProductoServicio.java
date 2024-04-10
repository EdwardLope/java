package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionProducto;
import com.example.Store.modelos.Producto;
import com.example.Store.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductoServicio {

    @Autowired
    ValidacionProducto validacionProducto;
    @Autowired
    PedidoServicio pedidoServicio;

    public Producto guardarProducto(){
        return null;
    }

    public  Producto buscarProductoPorId(){
        return null;
    }

    public List<Producto> buscarTodosProductos(){
        return null;
    }

    public Producto modificarProducto(){
        return null;
    }

    public boolean eliminarProducto(){
        return true;
    }

}

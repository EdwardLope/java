package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionProducto;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductoServicio {

    @Autowired
    ValidacionProducto validacionProducto;
    @Autowired
    PedidoServicio pedidoServicio;
}

package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionPedido;
import org.springframework.beans.factory.annotation.Autowired;

public class PedidoServicio {

    @Autowired
    ValidacionPedido validacionPedido;
    @Autowired
    PedidoServicio pedidoServicio;
}

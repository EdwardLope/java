package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionDetalle;
import org.springframework.beans.factory.annotation.Autowired;

public class DetalleServicio {

    @Autowired
    ValidacionDetalle validacionDetalle;
    @Autowired
    DetalleServicio detalleServicio;
}

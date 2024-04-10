package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionDetalle;
import com.example.Store.modelos.Detalle;
import com.example.Store.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetalleServicio {

    @Autowired
    ValidacionDetalle validacionDetalle;
    @Autowired
    DetalleServicio detalleServicio;

    public Detalle guardarDetalle(){
        return null;
    }

    public  Detalle buscarDetallePorId(){
        return null;
    }

    public List<Detalle> buscarTodosDetalle(){
        return null;
    }

    public Detalle modificarDetalle(){
        return null;
    }

    public boolean eliminarDetalle(){
        return true;
    }

}

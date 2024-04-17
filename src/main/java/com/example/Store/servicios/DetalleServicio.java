package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionDetalle;
import com.example.Store.modelos.Detalle;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorio.DetalleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetalleServicio {

    @Autowired
    ValidacionDetalle validacionDetalle;
    @Autowired
    DetalleRepositorio detalleRepositorio;

    public Detalle guardarDetalle(Detalle datosDetalle) throws Exception{
        try{
            if(validacionDetalle.validarCantidadProductos(datosDetalle.getCantidadProductos())==false) {
                throw new Exception("CANTIDAD DE PRODUCTOS INVALIDO, REVISE PORFAVOR");
            }
            if (validacionDetalle.validarCostoTotal(datosDetalle.getCostoTotal())==false)
                throw new Exception("COSTO TOTAL INVALIDO, REVISE PORFAVOR");
            return detalleRepositorio.save(datosDetalle);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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

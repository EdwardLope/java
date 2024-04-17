package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionTipoPrenda;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorio.TipoPrendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TipoPrendaServicio {
    @Autowired
    ValidacionTipoPrenda validacionTipoPrenda;
    @Autowired
    TipoPrendaRepositorio tipoPrendaRepositorio;

    public TipoPrenda guardarTipoPrenda(TipoPrenda datosTipoPrenda) throws Exception{
        try {
            if (validacionTipoPrenda.validarNombre(datosTipoPrenda.getNombre()) == false) {
                throw new Exception("NOMBRe INVALIDO, REVISE PORFAVOR");
            }
            return tipoPrendaRepositorio.save(datosTipoPrenda);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }


    public  TipoPrenda buscarTipoPrendaPorId(){
        return null;
    }

    public List<TipoPrenda> buscarTodosTipoPrenda(){
        return null;
    }

    public TipoPrenda modificarTipoPrenda(){
        return null;
    }

    public boolean eliminarTipoPrenda(){
        return true;
    }


}

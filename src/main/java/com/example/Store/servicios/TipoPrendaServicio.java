package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionTipoPrenda;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TipoPrendaServicio {
    @Autowired
    ValidacionTipoPrenda validacionTipoPrenda;
    @Autowired
    TipoPrendaServicio tipoPrendaServicio;

    public TipoPrenda guardarTipoPrenda(){
        return null;
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

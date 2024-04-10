package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionMarca;
import com.example.Store.modelos.Marca;
import com.example.Store.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MarcaServicio {

    @Autowired
    ValidacionMarca validacionMarca;
    @Autowired
    MarcaServicio marcaServicio;

    public Marca guardarMarca(){
        return null;
    }

    public  Marca buscarMarcaPorId(){
        return null;
    }

    public List<Marca> buscarTodosMarca(){
        return null;
    }

    public Marca modificarMarca(){
        return null;
    }

    public boolean eliminarMarca(){
        return true;
    }

}

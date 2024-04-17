package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionMarca;
import com.example.Store.modelos.Marca;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorio.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MarcaServicio {

    @Autowired
    ValidacionMarca validacionMarca;
    @Autowired
    MarcaRepositorio marcaRepositorio;

    public Marca guardarMarca(Marca datosMarca) throws Exception{
        try{
            if(validacionMarca.validarNombreMarca(datosMarca.getNombreMarca())==false) {
                throw new Exception("NOMBRE INVALIDO, REVISE PORFAVOR");
            }
            if (validacionMarca.validarNit(datosMarca.getNit())==false) {
                throw new Exception("NIT INVALIDO, REVISE PORFAVOR");
            }
            if (validacionMarca.validarAnoCreacion(datosMarca.getAnoCreacion())==false){
                throw new Exception("AÑO CREACION INVALIDO, REVISE PORFAVOR");
            }
            return marcaRepositorio.save(datosMarca);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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

package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionUsuario;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorio.UsuarioRepositirio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {

    //en los servicios dobo inyectar las depedencias de las validaciones y las consultas o repositorios
    @Autowired
    ValidacionUsuario validacionUsuario;
    @Autowired
    UsuarioRepositirio usuarioRepositirio;

    // en el servicio se crea un metodo para cada una de las consultas en BD

    public Usuario guardarUsuario(){
        return null;
    }

    public  Usuario buscarUsuarioPorId(){
        return null;
    }

    public List<Usuario>buscarTodosUsuarios(){
        return null;
    }

    public Usuario modificarUsuario(){
        return null;
    }

    public boolean eliminarUsuario(){
        return true;
    }




}

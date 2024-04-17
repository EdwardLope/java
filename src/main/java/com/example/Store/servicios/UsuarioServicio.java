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

    public  Usuario guardarUsuario(Usuario datosUsuario) throws  Exception{
        try{
            if(validacionUsuario.validarNombres(datosUsuario.getNombres())==true){
                if (validacionUsuario.validarCedula(datosUsuario.getCedula())==true){
                    if (validacionUsuario.validarCorreo(datosUsuario.getCorreo())==true){
                        if (validacionUsuario.validarSexo(datosUsuario.getSexo())==true){
                            if (validacionUsuario.validarCodigoPostal(datosUsuario.getCodigoPostal())==true){
                                //en este apartado ya se puede guardar datos porque todos estan correctos

                                //llamar a la capa responsable de guardar estos en BD
                                return usuarioRepositirio.save(datosUsuario);
                            }
                        }
                    }
                }
            }
            return  null;

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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

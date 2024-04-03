package com.example.Store.heipers;

public class ValidacionUsuario {
    private EvaluarPatron evaluarPatron=new EvaluarPatron();

    public boolean validarNombres(String nombres)throws Exception{
        String regex = "^[a-zA-Z\\s]{1,50}$";
        if (!this.evaluarPatron.evaluarPatron(nombres,regex)){
            throw new Exception("Reviza el nombre");
        }
        return true;
    }

    public boolean validarCedula(String cedula)throws Exception{
        String regex = "^[0-9]+$";
        if (!this.evaluarPatron.evaluarPatron(cedula,regex)){
            throw new Exception("Reviza el costo");
        }
        return true;
    }

    public boolean validarCorreo(String correo)throws Exception{
        return true;
    }

    public boolean validarSexo(String sexo)throws Exception{
        return true;
    }

    public boolean validarCodigoPostal(String codigoPostal)throws Exception{
        return true;
    }

}

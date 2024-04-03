package com.example.Store.heipers;

public class ValidacionDetalle {

    private EvaluarPatron evaluarPatron=new EvaluarPatron();

    public boolean validarCostoTotal(String costoTotal)throws Exception{
        String regex = "^[0-9]+(\\.[0-9]+)?$";

        if (!this.evaluarPatron.evaluarPatron(costoTotal,regex)){
            throw new Exception("Reviza el costo");
        }
        return true;
    }

    public boolean validarCantidadProductos(String cantidadProductos)throws Exception{
        String regex = "^[0-9]+$";

        if (!this.evaluarPatron.evaluarPatron(cantidadProductos,regex)){
            throw new Exception("Reviza la cantidad");
        }


        return true;
    }

}

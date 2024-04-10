package com.example.Store.helpers;

public class ValidacionPedido {
    private EvaluarPatron evaluarPatron=new EvaluarPatron();

    public boolean validarFechaHora(String fechaHora)throws Exception{
        String regex = "^\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}:\\d{2}$";
        if (!this.evaluarPatron.evaluarPatron(fechaHora,regex)){
            throw new Exception("Reviza la fecha y hora");
        }

        return true;
    }

}

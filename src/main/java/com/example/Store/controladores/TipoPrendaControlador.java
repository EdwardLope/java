package com.example.Store.controladores;

import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.servicios.TipoPrendaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("storeapi/v1/tipoprenda")
public class TipoPrendaControlador {

    @Autowired
    TipoPrendaServicio tipoPrendaServicio;

    @PostMapping
    public ResponseEntity<?> guardarTipoPrenda(@RequestBody TipoPrenda datosTipoPrenda) {
        try {

            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(tipoPrendaServicio.guardarTipoPrenda(datosTipoPrenda));

        } catch (Exception error) {
            Map<String, Object> errores = new LinkedHashMap<>();
            errores.put("hora:", LocalDateTime.now());
            errores.put("mensaje", error.getMessage());
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errores);

        }
    }
}

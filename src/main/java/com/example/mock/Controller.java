package com.example.mock;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/traslado/solicitar/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {

    @RequestMapping(value = "{idTransaccion}",method = RequestMethod.POST)
    public Object mockInicioTraslado(@PathVariable (value = "idTransaccion")final String sessioId,@RequestBody final Object inicioTraslado){
        System.out.println("La petición ha llegado");
        System.out.println(inicioTraslado.toString());
        return inicioTraslado;
    }
}

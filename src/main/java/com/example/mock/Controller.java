package com.example.mock;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/mock/inicioTraslado", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {

    @PostMapping
    public Object mockInicioTraslado(@RequestBody final Object inicioTraslado){
        return inicioTraslado;
    }
}

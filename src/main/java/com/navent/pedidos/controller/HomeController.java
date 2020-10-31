package com.navent.pedidos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/pedidos/guardar")
    public String guardarPedido(){
        return "guardar";
    }
}

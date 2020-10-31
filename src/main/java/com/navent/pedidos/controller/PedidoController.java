package com.navent.pedidos.controller;

import com.navent.pedidos.model.Pedido;
import com.navent.pedidos.service.PedidoService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/{idPedido}")
    public ResponseEntity<Pedido> getPedidoById(@PathVariable("idPedido") Integer idPedido){
        try {
            Pedido pedido = pedidoService.getPedidoById(idPedido);
            return new ResponseEntity<>(pedido, HttpStatus.OK);
        } catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pedido Not Found", exception);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<Pedido> createPedido(@RequestBody Pedido pedido){
        try {
            pedidoService.createPedido(pedido);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Location", "/api/v1/pedidos/guardar" + pedido.getIdPedido().toString());

            return new ResponseEntity<>(headers, HttpStatus.CREATED);
        } catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid data for Pedido", exception);
        }
    }

    @PutMapping("/{idPedido}")
    public ResponseEntity<Pedido> updatePedido(@RequestBody Pedido pedido){
        try {
            pedidoService.updatePedido(pedido);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception exception){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct Pedido Id", exception);
        }
    }

    @DeleteMapping("/{idPedido}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePedido(@RequestBody Pedido pedido){
        try {
            pedidoService.deletePedido(pedido);
        } catch (Exception exception){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Provide correct Pedido Id", exception);
        }
    }
}

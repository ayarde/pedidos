package com.navent.pedidos.service;

import com.navent.pedidos.model.Pedido;

public interface PedidoService {
    public Pedido getPedidoById(Integer idPedido);
    public void createPedido(Pedido pedido);
    public void updatePedido(Pedido pedido);
    public void deletePedido(Pedido pedido);
}

package com.navent.pedidos.dao;

import com.navent.pedidos.model.Pedido;

public interface PedidoCustomRepository {
    void insertOrUpdate(Pedido pedido);
    Pedido select(Integer idPedido);
}

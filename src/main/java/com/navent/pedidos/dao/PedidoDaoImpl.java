package com.navent.pedidos.dao;

import com.navent.pedidos.model.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoDaoImpl implements PedidoCustomRepository {
    @Override
    public void insertOrUpdate(Pedido pedido) {

    }

    @Override
    public Pedido select(Integer idPedido) {
        return null;
    }

}

package com.navent.pedidos.dao;

import com.navent.pedidos.model.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoDaoImpl implements PedidoCustomRepository {
    @Override
    public void insertOrUpdate(Pedido pedido) {
        //TODO:Implementar
    }

    @Override
    public Pedido select(Integer idPedido) {
        //TODO:Implementar
        return null;
    }

}

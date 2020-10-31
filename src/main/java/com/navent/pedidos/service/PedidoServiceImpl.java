package com.navent.pedidos.service;

import com.navent.pedidos.dao.PedidoDao;
import com.navent.pedidos.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {
    private final PedidoDao pedidoDao;

    public PedidoServiceImpl(PedidoDao pedidoDao) {
        this.pedidoDao = pedidoDao;
    }

    @Override
    public Pedido getPedidoById(Integer idPedido) {
        return pedidoDao.select(idPedido);
    }

    @Override
    public void createPedido(Pedido pedido) {
        pedidoDao.insertOrUpdate(pedido);
    }

    @Override
    public void updatePedido(Pedido pedido) {
        pedidoDao.insertOrUpdate(pedido);
    }

    @Override
    public void deletePedido(Pedido pedido) {
        pedidoDao.delete(pedido);
    }
}

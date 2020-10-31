package com.navent.pedidos.dao;

import com.navent.pedidos.model.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoDao extends CrudRepository<Pedido,Integer>, PedidoCustomRepository {

}

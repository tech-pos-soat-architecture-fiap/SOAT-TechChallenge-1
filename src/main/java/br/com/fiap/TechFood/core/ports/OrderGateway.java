package br.com.fiap.TechFood.core.ports;

import br.com.fiap.TechFood.core.domain.Order;

public interface OrderGateway {
    PagePort<Order> findAll(int page, int size);
}

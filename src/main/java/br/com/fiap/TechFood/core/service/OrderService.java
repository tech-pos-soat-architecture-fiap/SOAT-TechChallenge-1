package br.com.fiap.TechFood.core.service;

import br.com.fiap.TechFood.core.domain.Order;
import br.com.fiap.TechFood.core.ports.OrderGateway;
import br.com.fiap.TechFood.core.ports.PagePort;

public class OrderService implements OrderServicePort{
    private OrderGateway orderGateway;

    public OrderService(OrderGateway orderGateway) {
        this.orderGateway = orderGateway;
    }

    public PagePort<Order> findAll(int page, int size) {
        return orderGateway.findAll(page, size);
    }
}

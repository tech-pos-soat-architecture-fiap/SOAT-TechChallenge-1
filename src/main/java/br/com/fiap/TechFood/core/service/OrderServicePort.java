package br.com.fiap.TechFood.core.service;

import br.com.fiap.TechFood.core.domain.Order;
import br.com.fiap.TechFood.core.ports.PagePort;

public interface OrderServicePort {
    PagePort<Order> findAll(int page, int size);
}

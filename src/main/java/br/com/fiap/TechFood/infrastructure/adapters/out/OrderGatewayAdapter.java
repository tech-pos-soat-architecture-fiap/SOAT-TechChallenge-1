package br.com.fiap.TechFood.infrastructure.adapters.out;

import br.com.fiap.TechFood.core.domain.Order;
import br.com.fiap.TechFood.core.ports.OrderGateway;
import br.com.fiap.TechFood.core.ports.PagePort;
import br.com.fiap.TechFood.infrastructure.adapters.PageDTO;
import br.com.fiap.TechFood.infrastructure.adapters.out.entity.OrderEntity;
import br.com.fiap.TechFood.infrastructure.adapters.out.repository.OrderRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

@Component
public class OrderGatewayAdapter implements OrderGateway {

    private final OrderRepository orderRepository;

    public OrderGatewayAdapter(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public PagePort<Order> findAll(int page, int size) {
        Page<Order> orders = orderRepository.findAll(PageRequest.of(page, size)).map(OrderEntity::getOrder);
        return new PageDTO<>(orders);
    }
}

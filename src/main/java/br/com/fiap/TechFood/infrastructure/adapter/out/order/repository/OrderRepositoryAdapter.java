package br.com.fiap.TechFood.infrastructure.adapter.out.order.repository;

import br.com.fiap.TechFood.application.core.domain.order.Order;
import br.com.fiap.TechFood.application.port.PagePort;
import br.com.fiap.TechFood.application.port.order.OrderRepositoryPort;
import br.com.fiap.TechFood.infrastructure.adapter.out.PageDTO;
import br.com.fiap.TechFood.infrastructure.adapter.out.order.entity.OrderEntity;
import br.com.fiap.TechFood.infrastructure.adapter.out.user.repository.UserEntityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderRepositoryAdapter implements OrderRepositoryPort {

    private final OrderEntityRepository orderEntityRepository;
    private final UserEntityRepository userRepository;

    public OrderRepositoryAdapter(OrderEntityRepository orderEntityRepository, UserEntityRepository userRepository) {
        this.orderEntityRepository = orderEntityRepository;
        this.userRepository = userRepository;
    }

    @Override
    public PagePort<Order> findAll(int page, int size) {
        Page<Order> orders = orderEntityRepository.findAll(PageRequest.of(page, size)).map(OrderEntity::toOrder);
        return new PageDTO<>(orders);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return orderEntityRepository.findById(id).map(OrderEntity::toOrder);
    }

    @Override
    public Order save(Order order) {
        return orderEntityRepository.save(new OrderEntity(order)).toOrder();
    }
}

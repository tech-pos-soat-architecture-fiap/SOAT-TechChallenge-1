package br.com.fiap.TechFood.infrastructure.adapters.out.entity;

import br.com.fiap.TechFood.core.domain.OrderStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private BigDecimal total = BigDecimal.ZERO;

//    private UserEntity user;

    @Enumerated(EnumType.STRING)
    private OrderStatus status = OrderStatus.RECEIVED;

    @NotNull
    private LocalDateTime createdAt = LocalDateTime.now();

    @NotEmpty
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //TODO Pensar melhor qual a melhor estrutura de dados pra por aqui
    private List<OrderItemEntity> items = new ArrayList<>();
    //TODO colocar o payment aqui
}

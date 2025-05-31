package br.com.fiap.TechFood.infrastructure.adapters.out.entity;

import br.com.fiap.TechFood.core.domain.Order;
import br.com.fiap.TechFood.core.domain.OrderItem;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

@Entity(name = "order_item")
public class OrderItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private BigDecimal price = BigDecimal.ZERO;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private OrderEntity order;

    //TODO colocar a productEntity aqui

    @PositiveOrZero
    private int quantity;

    @Deprecated
    public OrderItemEntity() {
    }

    public OrderItem getOrderItem() {
        return new OrderItem(this.price, this.order, this.quantity);
    }


}

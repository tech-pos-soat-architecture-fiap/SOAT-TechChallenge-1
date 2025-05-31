package br.com.fiap.TechFood.core.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long id;
    private User user;
    private BigDecimal total = BigDecimal.ZERO;
    private LocalDateTime createdAt = LocalDateTime.now();
    private OrderStatus status = OrderStatus.RECEIVED;
    private List<OrderItem> orderItems = new ArrayList<>();
    //TODO colocar o payment aqui
    private String payment;

    public Order(Long id, User user, BigDecimal total,
                 OrderStatus status, List<OrderItem> orderItems, String payment) {
        this.id = id;
        this.user = user;
        this.total = total;
        this.status = status;
        this.orderItems = orderItems;
        this.payment = payment;
    }
}

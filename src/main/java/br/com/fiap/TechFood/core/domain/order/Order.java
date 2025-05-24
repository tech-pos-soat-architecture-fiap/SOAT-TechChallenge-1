package br.com.fiap.TechFood.core.domain.order;

import br.com.fiap.TechFood.core.domain.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {
    private Long id;
    private User user;
    private BigDecimal total = BigDecimal.ZERO;
    private LocalDateTime createdAt = LocalDateTime.now();
    private OrderStatus status = OrderStatus.RECEIVED;;
}

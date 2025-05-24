package br.com.fiap.TechFood.core.domain.order;

import java.math.BigDecimal;

public class OrderItem {
    private String name;
    private String description;
    private BigDecimal price = BigDecimal.ZERO;
}

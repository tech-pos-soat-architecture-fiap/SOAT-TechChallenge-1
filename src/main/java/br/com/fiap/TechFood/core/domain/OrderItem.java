package br.com.fiap.TechFood.core.domain;

import java.math.BigDecimal;

public class OrderItem {
    private Long id;
    private Order order;
    private int quantity;
    //TODO adicionar o produto aqui
    private String produtName;
    private BigDecimal price = BigDecimal.ZERO;
}

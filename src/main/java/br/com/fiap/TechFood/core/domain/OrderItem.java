package br.com.fiap.TechFood.core.domain;

import br.com.fiap.TechFood.infrastructure.adapters.out.entity.OrderEntity;

import java.math.BigDecimal;

//TODO faz sentido isso aqui ter id de fato ou ser um elemento de collection?
public class OrderItem {
    private Long id;
    private Order order;
    private int quantity;
    //TODO adicionar o produto aqui
    private String produtName;
    private BigDecimal price = BigDecimal.ZERO;

    public OrderItem(BigDecimal price, OrderEntity order, int quantity) {
    }
}

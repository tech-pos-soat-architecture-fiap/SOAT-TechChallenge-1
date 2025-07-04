package br.com.fiap.TechFood.infrastructure.adapter.in.order;

import br.com.fiap.TechFood.application.port.order.OrderItemPort;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record OrderItemForm(@Min(1) int quantity, @NotNull Long productId) implements OrderItemPort {}

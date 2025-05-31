package br.com.fiap.TechFood.infrastructure.adapters.in;

import br.com.fiap.TechFood.core.service.OrderService;
import br.com.fiap.TechFood.core.service.OrderServicePort;
import br.com.fiap.TechFood.infrastructure.adapters.out.OrderView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final OrderServicePort orderServicePort;

    public OrderController(OrderServicePort orderServicePort) {
        this.orderServicePort = orderServicePort;
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderView>> listOrders() {
        return null;
    }
}

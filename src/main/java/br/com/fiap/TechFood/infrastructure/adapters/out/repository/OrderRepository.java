package br.com.fiap.TechFood.infrastructure.adapters.out.repository;

import br.com.fiap.TechFood.infrastructure.adapters.out.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}

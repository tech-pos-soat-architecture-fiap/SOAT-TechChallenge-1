package br.com.fiap.TechFood.infrastructure.adapters.out.repository;

import br.com.fiap.TechFood.infrastructure.adapters.out.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {

}
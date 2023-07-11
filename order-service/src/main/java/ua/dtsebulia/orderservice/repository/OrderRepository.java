package ua.dtsebulia.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.dtsebulia.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
}

package com.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderVO, Integer>{
	OrderVO findByItem(String item);
}

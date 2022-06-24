package com.order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderVO, Integer>{
	OrderVO findByItem(String item);
	OrderVO findByItemAndPrice(String item, float price);

}

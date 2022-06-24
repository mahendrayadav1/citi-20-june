package com.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	@Autowired
	RestTemplate template;
	@Autowired
	OrderRepository repository;

	void insertOrder(OrderVO order) {
		repository.save(order);
//		template.getForEntity("http://EMAIL-SERVICE/email/"+order.getEmail(), String.class);
		
	}

	public OrderVO getByItem(String item) {
		return repository.findByItem(item);
	}
}

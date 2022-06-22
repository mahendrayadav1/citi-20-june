package com.order;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@PostMapping
	public void createOrder(@Valid @RequestBody OrderVO order) {
		orderService.insertOrder(order);
		System.out.println(order.getPrice());
	}
	
	@GetMapping("/item/{item}")
	 OrderVO getByItem(@PathVariable String item) {
		return orderService.getByItem(item);
	}
	
	@GetMapping("/id/{id}/username/{username}" )
	public OrderVO getOrder(Integer id) {
		
		return new OrderVO();
	}
	
	void deleteOrder() {
		// TODO Auto-generated method stub

	}
}

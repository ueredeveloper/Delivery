package com.ueredeveloper.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ueredeveloper.delivery.model.Orders;
import com.ueredeveloper.delivery.service.OrderService;


@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders")
	public ResponseEntity<List<Orders>> getAll() {
		List<Orders> list = orderService.listOrders();
		return new ResponseEntity<List<Orders>>(list, HttpStatus.OK);
	}

}

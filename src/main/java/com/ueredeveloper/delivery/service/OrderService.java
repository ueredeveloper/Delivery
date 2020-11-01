package com.ueredeveloper.delivery.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ueredeveloper.delivery.model.Orders;

@Component
public interface OrderService {

	public List<Orders> listOrders();
}

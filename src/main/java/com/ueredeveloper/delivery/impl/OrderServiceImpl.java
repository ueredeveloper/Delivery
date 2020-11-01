package com.ueredeveloper.delivery.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ueredeveloper.delivery.model.Orders;
import com.ueredeveloper.delivery.repository.OrderRepository;
import com.ueredeveloper.delivery.service.OrderService;

@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	

	@Transactional
	public List<Orders> listOrders() {
        List<Orders> ordersList = (List<Orders>) orderRepository.findAll();
         
        if(ordersList.size() > 0) {
            return ordersList;
        } else {
            return new ArrayList<Orders>();
        }
    }

}

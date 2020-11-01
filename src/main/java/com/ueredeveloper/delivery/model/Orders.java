package com.ueredeveloper.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="order_id")
	private Long orderId;
	
	@Column(name="order_status", columnDefinition="varchar(20)")
	private String orderStatus;

	public Long getOrderId() {
		return orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	

}

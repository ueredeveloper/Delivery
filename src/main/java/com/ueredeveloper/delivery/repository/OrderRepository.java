package com.ueredeveloper.delivery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ueredeveloper.delivery.model.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Long>{

}

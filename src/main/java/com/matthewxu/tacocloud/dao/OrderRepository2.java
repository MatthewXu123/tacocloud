package com.matthewxu.tacocloud.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matthewxu.tacocloud.model.Order;

@Repository
public interface OrderRepository2 extends CrudRepository<Order, Long>{

	List<Order> findByZip(String zip);
	
	List<Order> readOrdersByZipAndPlacedAtBetween(String zip, Date startDate, Date endDate);
}

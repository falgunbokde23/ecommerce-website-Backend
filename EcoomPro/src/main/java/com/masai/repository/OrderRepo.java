package com.masai.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Customer;
import com.masai.model.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {

	public List<Orders> findByCustomer(Customer customer);

	public List<Orders> findByLocation(String location);

	public List<Orders> findByOrderDate(LocalDate orderDate);

}

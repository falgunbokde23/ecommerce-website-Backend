package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CustomerException;
import com.masai.exception.UserException;
import com.masai.model.Customer;
import com.masai.model.User;
import com.masai.service.CustomerService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private CustomerService customerService;

	@PostMapping
	public ResponseEntity<Customer> addUserHandler(@Valid @RequestBody User user)
			throws UserException, CustomerException {

		Customer customer = new Customer();
		customer.setFirstName(user.getFirstName());
		customer.setLastName(user.getLastName());
		customer.setMobileNumber(user.getMobileNumber());
		customer.setEmail(user.getEmail());
		customer.setPassword(user.getPassword());
		customer.setRole(user.getRole());
		customer = customerService.addCustomer(customer);

		return new ResponseEntity<>(customer, HttpStatus.CREATED);
	}

//	@DeleteMapping
//	public ResponseEntity<User> deleteUserHandler(@RequestBody User user) throws UserException {
//
//		User deleteuser = logService.removeUser(user);
//
//		return new ResponseEntity<>(deleteuser, HttpStatus.ACCEPTED);
//	}

}

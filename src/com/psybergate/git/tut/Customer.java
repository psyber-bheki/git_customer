package com.psybergate.git.tut;

import java.time.LocalDate;

public class Customer {

	private Long customerId;

	private String name;

	private LocalDate dob;

	public Customer(Long customerId, String name, LocalDate dob) {
		this.customerId = customerId;
		this.name = name;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Your code has been violated";
	}
}
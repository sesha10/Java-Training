package com.techmojo.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Person {
	@Value("111")
	int id;
	@Value("Yoda")
	String name;
	Address address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Person(Address address) {
		super();
		this.address = address;
	}
	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}

package com.techmojo.service;

import org.springframework.stereotype.Component;

import com.techmojo.beans.Person;

public class PersonFileService implements PersonService {

	@Override
	public void save(Person p) {
		System.out.println("Saving person to file: " + p);		
	}

	@Override
	public Person find(int id) {
		System.out.println("Return a file with ID: " + id);
		return new Person(id, "Yoda");
	}
	
}

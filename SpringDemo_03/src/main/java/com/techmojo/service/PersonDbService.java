package com.techmojo.service;

import org.springframework.stereotype.Service;

import com.techmojo.beans.Person;

@Service
public class PersonDbService implements PersonService {

	@Override
	public void save(Person p) {
		System.out.println("Saving person to DB: " + p);		
	}

	@Override
	public Person find(int id) {
		System.out.println("Find person with id: " + id);
		return new Person(id, "Name");
	}
	
}

package com.ryan.bom;

import java.util.List;

import javax.jws.WebService;

import com.ryan.interfaces.PersonService;
import com.ryan.model.Person;

@WebService(endpointInterface="com.ryan.interfaces.PersonService")
public class PersonServiceImpl implements PersonService {

	@Override
	public boolean createPerson(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person[] retrievePersonList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePerson(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deletePerson(Person p) {
		// TODO Auto-generated method stub
		
	}
	
}

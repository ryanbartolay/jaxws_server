package com.ryan.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.ryan.model.Person;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface PersonService {
	
	@WebMethod
	public boolean createPerson(Person p);
	
	@WebMethod
	public Person[] retrievePersonList();
	
	@WebMethod
	public boolean updatePerson(Person p);
	
	@WebMethod
	public void deletePerson(Person p);
}

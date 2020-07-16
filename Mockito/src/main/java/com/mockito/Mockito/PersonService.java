package com.mockito.Mockito;

public class PersonService {
	private final PersonRepo personRepo;
	public PersonService(PersonRepo personRepo)
	{
		this.personRepo=personRepo;
	}
	public void save(Person person)
	{
		personRepo.save(person);
	}
	public Person update(Person person)
	{
		return personRepo.update(person); 
	}
	public Person select(Person first, Person second, Person third)
	{
		return personRepo.select(first, second, third);
	}
	public void delete(Person person)
	{
		personRepo.delete(person);
	}
}

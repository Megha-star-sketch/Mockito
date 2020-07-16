package com.mockito.Mockito;

public class PersonRepo {
	public void save(Person person)
	{
		System.out.println("Saving Person");
	}
	public Person update(Person person)
	{
		return person;
	}
	public Person select(Person first, Person second, Person third)
	{
		return first;
	}
	public void delete(Person person)
	{
		System.out.println("deleting");
	}
}

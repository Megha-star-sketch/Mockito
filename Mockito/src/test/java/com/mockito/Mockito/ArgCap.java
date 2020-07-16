package com.mockito.Mockito;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ArgCap {
	@InjectMocks
	private PersonService personService;
	@Mock
	private PersonService personRepo;
	@Captor
	private ArgumentCaptor<Person> argCap;
	@Test
	public void shouldCaptor()
	{
		Person person=new Person("Test");
		personService.delete(person);
		Mockito.verify(personRepo).delete(argCap.capture());
		Person captured=argCap.getValue();
        Assertions.assertThat(captured.getName()).isEqualTo("deleted");
	}
}

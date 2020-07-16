package com.mockito.Mockito;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class TestingCalc {
	Calculator c = null;
	CalculatorService service=Mockito.mock(CalculatorService.class);
	
	@Before
	public void setup()
	{
		c=new Calculator(service);
	}
	
	@Test
	public void test()
	{
		when(service.add(2,3)).thenReturn(5);
		assertEquals(5,c.perform(2,3));
		verify(service).add(2,3);
	}
}

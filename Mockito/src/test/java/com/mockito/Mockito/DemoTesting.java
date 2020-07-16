package com.mockito.Mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class DemoTesting {
	
	@Mock
	DemoInter demoInter;
	@InjectMocks
	Demo demo;
	
	@Test
	public void testDemo()
	{
	//	demo.setName("Demo Class");
		when(demoInter.add(2,3)).thenReturn(5);
		assertEquals(5,demoInter.add(2,3));
	}
}

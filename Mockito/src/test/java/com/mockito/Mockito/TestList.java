package com.mockito.Mockito;

import java.util.List;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

public class TestList {
//	@Test
//	public void testList_Argument_Matcher()
//	{
//		List<String> mocklist=mock(List.class);
//		when(mocklist.get(Mockito.anyInt())).thenReturn("Mockito");
//		assertEquals("Mockito",mocklist.get(0));
//		assertEquals("Mockito",mocklist.get(1));
//		assertEquals("Mockito",mocklist.get(2));
//	}
	
	@Test(expected=RuntimeException.class)
public void testList_Throws_Exception()
{
		List<String> mocklist=mock(List.class);
		when(mocklist.get(Mockito.anyInt())).thenThrow(new RuntimeException("Error"));
		mocklist.get(0);
}
}

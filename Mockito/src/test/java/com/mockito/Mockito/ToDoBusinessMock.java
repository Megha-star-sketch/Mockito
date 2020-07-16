package com.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.mockito.BDDMockito.given;  
import static org.mockito.Mockito.*;

public class ToDoBusinessMock {
	//@Test
//	public void testusing_Mocks()
//	{
//		ToDoService doService=mock(ToDoService.class);
//		List<String> combinedlist=Arrays.asList("Use Core Java","Use Spring Core","Use w3eHibernate","Use Spring MVC");
//		when(doService.getTodos("dummy")).thenReturn(combinedlist);
//		ToDoBusiness business=new ToDoBusiness(doService);
//		List<String> alltd=business.getTodosforHibernate("dummy");
//		System.out.println(alltd);
//		assertEquals(1,alltd.size());
//	}
	
	//Example of mocking a List Class
//	public void testList_ReturnsSingle_value()
//	{
//		List mocklist = mock(List.class);  
//      //  when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3);  //for multiple return values
//		when(mocklist.get(0)).thenReturn("Mockito");
//		assertEquals("Mockito",mocklist.get(0));
////assertEquals(1, mocklist.size());  
////assertEquals(1, mocklist.size());  
////assertEquals(2, mocklist.size());  
////assertEquals(3, mocklist.size());  
//    //   System.out.println( mocklist.size());  
//System.out.println(mocklist.get(0));  
//
//	}
	@Test
	public void deleteToDoUsing()
	{
		ToDoService todoService=mock(ToDoService.class);
		List<String> combinedList =Arrays.asList("Use Hibernate Java", "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");
		given(todoService.getTodos("dummy")).willReturn(combinedList);
		ToDoBusiness business=new ToDoBusiness(todoService);
		//When
		business.deletetodosNotRelatedtoHibernate("dummy");
		//Then
		verify(todoService).deletetodos("Use Spring MVC");
	}
}

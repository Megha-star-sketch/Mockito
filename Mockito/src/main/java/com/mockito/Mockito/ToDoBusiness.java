package com.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {
	
	public ToDoService doService;
	public ToDoBusiness(ToDoService doService)
	{
		this.doService=doService;
	}
//	public List<String> getTodosforHibernate(String user)
//	{
//		List<String> hibernatelist=new ArrayList<String>();
//		List<String> Combinedlist=doService.getTodos(user);
//		for(String todo : Combinedlist)
//		{
//			if(todo.contains("Hibernate"))
//			{
//				hibernatelist.add(todo);
//			}
//		}
//		return hibernatelist;
//	}
	
	public void deletetodosNotRelatedtoHibernate(String user)
	{
		List<String> combinedlist=doService.getTodos(user);
		for(String todos: combinedlist)
		{
			if(!todos.contains("Hibernate"))
			{
				doService.deletetodos(todos);
			}
		}
	}
}

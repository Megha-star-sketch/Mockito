package com.mockito.Mockito;

import java.util.List;

public interface ToDoService {
	public List<String> getTodos(String user);
	public void deletetodos(String doString);
}

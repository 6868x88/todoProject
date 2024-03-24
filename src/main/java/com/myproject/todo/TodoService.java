package com.myproject.todo;

import java.util.List;


public interface TodoService {
	
	public List<TodoDTO> getTodoList();
	public boolean insertTodoList(TodoDTO para);
	public boolean deleteTodoList(Integer idx);
	public boolean updateTodoList(Integer idx);
}
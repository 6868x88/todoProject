package com.myproject.todo;

import java.util.List;


public interface TodoService {
//	private final List<TodoDTO> todoList = new ArrayList<>();
//	
//	public List<TodoDTO> readAll(){
//		return todoList;
//	}
//	
	
	public List<TodoDTO> getTodoList();
//	public boolean insertTodoList(TodoDTO para);
	public boolean deleteTodoList(Integer idx);
}
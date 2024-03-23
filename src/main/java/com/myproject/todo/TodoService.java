package com.myproject.todo;

import java.util.ArrayList;
import java.util.List;
import com.myproject.todo.TodoDTO;

import org.springframework.stereotype.Service;

public interface TodoService {
//	private final List<TodoDTO> todoList = new ArrayList<>();
//	
//	public List<TodoDTO> readAll(){
//		return todoList;
//	}
//	
	
	public List<TodoDTO> getTodoList();
//	public boolean insertTodoList(TodoDTO para);
//	public boolean deleteTodoList(int idx);
}
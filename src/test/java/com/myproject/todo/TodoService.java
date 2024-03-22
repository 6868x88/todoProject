package com.myproject.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private final List<TodoDTO> todoList = new ArrayList<>();
	
	public List<TodoDTO> readAll(){
		return todoList;
	}
	
}

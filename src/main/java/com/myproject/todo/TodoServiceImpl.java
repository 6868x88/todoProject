package com.myproject.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoMapper todoMapper;
	
	@Override
	public List<TodoDTO> getTodoList(){
		List<TodoDTO> todoList = todoMapper.selectTodoList();
		return todoList;
	}
	
//	@Override
//	public boolean insertTodoList(TodoDTO para) {
//		int queryResult = 0;
//		if(para != null) {
//			queryResult = todoMapper.insertTodoList(para);
//		}
//		return (queryResult == 1)? true:false;
//	}
//
//	@Override
//	public boolean deleteTodoList(int idx) {
//		int queryResult = 0;
//		if((Integer)idx != null) {
//			queryResult = todoMapper.deleteTodoList(idx);
//		}
//		return (queryResult == 1)? true:false;
//	}
}

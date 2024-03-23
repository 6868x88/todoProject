package com.myproject.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoMapper todoMapper;


	//목록 불러오기
	@Override
	public List<TodoDTO> getTodoList(){
		List<TodoDTO> todoList = todoMapper.selectTodoList();
		return todoList;
	}

	//목록 삭제
	@Override
	public boolean deleteTodoList(Integer idx) {
		int queryResult = 0;
		if(idx != null) {
			queryResult = todoMapper.deleteTodoList(idx);
		}
		return (queryResult == 1)? true:false;
	}


	//목록 추가
	@Override
	public boolean insertTodoList(TodoDTO para) {
		int queryResult = 0;
		if(para != null) {
			queryResult = todoMapper.insertTodoList(para);
		}
		return (queryResult == 1)? true:false;
	}


}

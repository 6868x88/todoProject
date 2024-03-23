package com.myproject.todo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {
	public List<TodoDTO> selectTodoList();
//	public int insertTodoList(TodoDTO params);
	public int deleteTodoList(Integer idx);
}

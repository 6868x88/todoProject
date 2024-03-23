package com.myproject.todo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.myproject.todo.TodoDTO;

@Mapper
public interface TodoMapper {
	public List<TodoDTO> selectTodoList();
//	public int insertTodoList(TodoDTO params);
//	public int deleteTodoList(int idx);
}

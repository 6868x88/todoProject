package com.myproject.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TodoController {
	private final TodoService todoService;

	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	@GetMapping("/")
	public String todoList(Model model) {
		List<TodoDTO> todoDtoList = this.todoService.getTodoList();
		model.addAttribute("todoList",todoDtoList);
		model.addAttribute("todo", new TodoDTO());
		return "todo";
	}

	@GetMapping(value = "/todo/delete.do")
	public String deleteTodoList(@RequestParam(value="idx", required = false)Integer idx) {
		System.out.println("delete todo : "+idx);
		todoService.deleteTodoList(idx);
		return "redirect:/";
	}

	@GetMapping(value = "todo/newTodo.do")
	public String insertTodoList(Model model, TodoDTO para) {
		todoService.insertTodoList(para);
		return "redirect:/";
	}


}
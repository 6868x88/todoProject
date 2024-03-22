package com.myproject.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
	private final TodoService todoService;
	
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	
	@RequestMapping("/todo")
	public String todo(Model model) {
		List<TodoDTO> todoDtoList = this.todoService.readAll();
		model.addAttribute("todoList",todoDtoList);
		
		return "todo";
	}
	
	@GetMapping("/index")
	public String home() {
		System.out.println("index controller");
		return "index";
	}
}

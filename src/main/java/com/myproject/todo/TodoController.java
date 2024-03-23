package com.myproject.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.oracle.wls.shaded.org.apache.bcel.generic.NEW;

@Controller
public class TodoController {
	private final TodoService todoService;
	
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	
//	@RequestMapping("/todo")
//	public String todo(Model model) {
//		List<TodoDTO> todoDtoList = this.todoService.readAll();
//		model.addAttribute("todoList",todoDtoList);
//		
//		System.out.println("todo page");
//		return "todo";
//	}
	
	
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
	
}
package com.myproject.todo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TodoDTO {
	private int idx;
	private String tododate;
	private String content;
	private String isdone;
	
	public TodoDTO() {}
	
}

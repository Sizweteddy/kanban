package com.kanbanboard.KanbanBoard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kanbanboard.KanbanBoard.entity.WorkItem;

import com.kanbanboard.KanbanBoard.service.WorkItemService;

@RestController
public class WorkItemController {
	

	private WorkItemService workItemService;
	

	@Autowired
	public WorkItemController(WorkItemService workItemService) {
		this.workItemService = workItemService;
		
		//Handler method to handle list work items and return model and view
	}
	
	@GetMapping("/listWorkItems")
	public List<WorkItem>  getAllListItems() {
		
		 return workItemService.listAllWorkItem();
		 
	
		
		
		
	}
	
	/*@GetMapping("/student/new")
	public String createStudent(Model model) {
		
		//Create student object to hold student form data
		
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";		
		
	}
         */
}

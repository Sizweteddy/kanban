package com.kanbanboard.KanbanBoard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kanbanboard.KanbanBoard.entity.Status;
import com.kanbanboard.KanbanBoard.entity.User;
import com.kanbanboard.KanbanBoard.entity.WorkItem;
import com.kanbanboard.KanbanBoard.repository.StatusRepo;
import com.kanbanboard.KanbanBoard.repository.UserRepo;
import com.kanbanboard.KanbanBoard.repository.WorkItemRepo;

@SpringBootApplication
public class KanbanBoardApplication implements CommandLineRunner{
	
	
	private WorkItemRepo  workItemRepo;
	
	private UserRepo  userRepo;
	
	private StatusRepo  statusRepo;
	
	
	
	@Autowired
	public KanbanBoardApplication(WorkItemRepo workItemRepo) {
		this.workItemRepo = workItemRepo;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(KanbanBoardApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		WorkItem wItem = new WorkItem("uche", "in_progress", "IT Security Expert", "IT Security");
		
		
		User user1 = new User("uche", "james@gmail.com");
		
		Status status1 = new Status("Security  Task", true, false);
		
		wItem.setUser(user1);
		wItem.setStatus(status1);
		workItemRepo.save(wItem);
		
		
	}

}

package com.kanbanboard.KanbanBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanbanboard.KanbanBoard.entity.WorkItem;
import com.kanbanboard.KanbanBoard.repository.WorkItemRepo;


@Service
public class WorkItemServiceImpl implements WorkItemService{
	
	
	WorkItemRepo workItemRepo;
	
	@Autowired
	public WorkItemServiceImpl(WorkItemRepo workItemRepo) {
		this.workItemRepo = workItemRepo;	
		
	}

	@Override
	public List<WorkItem> listAllWorkItem() {
		
		return workItemRepo.findAll();
	}

	@Override
	public WorkItem saveWorkItem(WorkItem workItem) {
		
		return workItemRepo.save(workItem);
	}

	@Override
	public WorkItem getWorkItemById(int id) {
		
		return workItemRepo.findById(id).get();
	}

	@Override
	public WorkItem getWorkItemByStatus(String workstatus) {
		
		List<WorkItem> workItems = workItemRepo.findAll();
		 
		WorkItem workItem = null;
		 
		 for(WorkItem item : workItems) {
			 if(item.getStatus().equals(workstatus));
			 workItem = item;	 	 
		 }
		 
		 return workItem;	
	}
	
	
	@Override
	public WorkItem updateWorkItem(WorkItem workItem) {
		return workItemRepo.save(workItem);
	}

	@Override
	public void deleteWorkItemById(int id) {
		workItemRepo.deleteById(id);
		
	}

}

package com.kanbanboard.KanbanBoard.service;

import java.util.List;

import com.kanbanboard.KanbanBoard.entity.WorkItem;


public interface WorkItemService {
	
List<WorkItem> listAllWorkItem();
	
WorkItem saveWorkItem(WorkItem workItem);
	
WorkItem getWorkItemById(int id);

WorkItem getWorkItemByStatus(String workstatus);
	
WorkItem updateWorkItem(WorkItem workItem);
	
void deleteWorkItemById(int id);
	


}

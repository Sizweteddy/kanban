package com.kanbanboard.KanbanBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanbanboard.KanbanBoard.entity.WorkItem;

public interface WorkItemRepo  extends JpaRepository<WorkItem, Integer>{

}

package com.kanbanboard.KanbanBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanbanboard.KanbanBoard.entity.Status;

public interface StatusRepo extends JpaRepository<Status, Integer>{

}

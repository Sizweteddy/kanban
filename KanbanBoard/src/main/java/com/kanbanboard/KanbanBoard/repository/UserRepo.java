package com.kanbanboard.KanbanBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanbanboard.KanbanBoard.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}

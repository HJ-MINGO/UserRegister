package com.application.userregister.repository;

import com.application.userregister.domain.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<ToDoEntity,Long> {

}

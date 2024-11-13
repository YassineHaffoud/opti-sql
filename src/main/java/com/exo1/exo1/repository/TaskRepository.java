package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Task;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    @Query("SELECT t FROM Task t JOIN FETCH t.projet JOIN FETCH t.user")
    List<Task> findAllWithProjetAndUser();
}

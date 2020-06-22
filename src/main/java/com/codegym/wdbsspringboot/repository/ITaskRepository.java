package com.codegym.wdbsspringboot.repository;

import com.codegym.wdbsspringboot.model.AppUser;
import com.codegym.wdbsspringboot.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<Task, Long> {
    Iterable<Task> findAllByUser(AppUser user);
}

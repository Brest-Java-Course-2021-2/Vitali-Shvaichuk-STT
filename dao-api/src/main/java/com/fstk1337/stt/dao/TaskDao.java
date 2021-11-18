package com.fstk1337.stt.dao;

import com.fstk1337.stt.model.Task;

import java.util.List;

public interface TaskDao {

    List<Task> findAll();

    Integer create(Task task);

    Integer update(Task task);

    Integer delete(Integer id);
}

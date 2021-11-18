package com.fstk1337.stt.model;

import java.time.LocalDateTime;

public class Task {
    private int id;
    private String description;
    private Employee initiator;
    private Employee executor;
    private LocalDateTime timeInitiated;
    private TaskDifficulty difficulty;
    private TaskStatus status;

    public Task() {}

    public Task(int id, String description, Employee initiator, Employee executor,
                LocalDateTime timeInitiated, TaskDifficulty difficulty, TaskStatus status) {
        this.id = id;
        this.description = description;
        this.initiator = initiator;
        this.executor = executor;
        this.timeInitiated = timeInitiated;
        this.difficulty = difficulty;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getInitiator() {
        return initiator;
    }

    public void setInitiator(Employee initiator) {
        this.initiator = initiator;
    }

    public Employee getExecutor() {
        return executor;
    }

    public void setExecutor(Employee executor) {
        this.executor = executor;
    }

    public LocalDateTime getTimeInitiated() {
        return timeInitiated;
    }

    public void setTimeInitiated(LocalDateTime timeInitiated) {
        this.timeInitiated = timeInitiated;
    }

    public TaskDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(TaskDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", initiator=" + initiator +
                ", executor=" + executor +
                ", timeInitiated=" + timeInitiated +
                ", difficulty=" + difficulty +
                ", status=" + status +
                '}';
    }
}

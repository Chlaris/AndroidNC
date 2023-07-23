package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "kma_task_item")
public class Task {
    @PrimaryKey
    @NonNull
    private String task_id;
    private String task_name;
    private String task_description;
    private String status_id;
    private String work_id;

    public Task(@NonNull String task_id, String task_name, String task_description,
                String status_id, String work_id) {
        this.task_id = task_id;
        this.task_name = task_name;
        this.task_description = task_description;
        this.status_id = status_id;
        this.work_id = work_id;
    }

    @NonNull
    public String getTask_id() {
        return task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public String getStatus_id() {
        return status_id;
    }

    public void setStatus_id(String status_id) {
        this.status_id = status_id;
    }

    public String getWork_id() {
        return work_id;
    }

    public void setWork_id(String work_id) {
        this.work_id = work_id;
    }
}

package com.example.androidnc.api.converter;

import com.example.androidnc.database.model.Status;
import com.example.androidnc.database.model.Task;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TaskConverter {
    @SerializedName("all_kma_tasks")
    @Expose
    private List<Task> tasks;

    public TaskConverter() {
    }
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}

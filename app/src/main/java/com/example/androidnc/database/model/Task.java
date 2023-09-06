package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "kma_task_item")
public class Task {
    @PrimaryKey
    @NonNull
    @SerializedName("task_id")
    @Expose
    private String task_id;
    @SerializedName("task_name")
    @Expose
    private String task_name;
    @SerializedName("task_description")
    @Expose
    private String task_description;
    @SerializedName("status_id")
    @Expose
    private String status_id;
    @SerializedName("work_id")
    @Expose
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

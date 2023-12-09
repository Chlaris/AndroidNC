package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

@Entity(tableName = "kma_task_item")
public class Task {
    @PrimaryKey
    @NonNull
    @SerializedName("task_id")
    @Expose
    private Integer task_id;
    @SerializedName("task_name")
    @Expose
    private String task_name;
    @SerializedName("task_description")
    @Expose
    private String task_description;
    @SerializedName("status_id")
    @Expose
    private Integer status_id;
    @SerializedName("work_id")
    @Expose
    private Integer work_id;
    @SerializedName("level_id")
    @Expose
    private Integer level_id;
    @SerializedName("task_start")
    @Expose
    private Date task_start;
    @SerializedName("task_end")
    @Expose
    private Date task_end;
    @SerializedName("user_create")
    @Expose
    private String user_create;
    @SerializedName("user_respond")
    @Expose
    private String user_respond;
    @SerializedName("user_support")
    @Expose
    private String user_support;

    public Task(@NonNull Integer task_id, String task_name, String task_description,
                Integer status_id, Integer work_id, Integer level_id, Date work_start, Date work_end, String user_create,
                String user_respond, String user_support) {
        this.task_id = task_id;
        this.task_name = task_name;
        this.task_description = task_description;
        this.status_id = status_id;
        this.work_id = work_id;
        this.level_id = level_id;
        this.work_start = work_start;
        this.work_end = work_end;
        this.user_create = user_create;
        this.user_respond = user_respond;
        this.user_support = user_support;
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

    public void setTask_id(@NonNull String task_id) {
        this.task_id = task_id;
    }

    public Date getWork_start() {
        return work_start;
    }

    public void setWork_start(Date work_start) {
        this.work_start = work_start;
    }

    public Date getWork_end() {
        return work_end;
    }

    public void setWork_end(Date work_end) {
        this.work_end = work_end;
    }

    public String getUser_respond() {
        return user_respond;
    }

    public void setUser_respond(String user_respond) {
        this.user_respond = user_respond;
    }

    public String getUser_support() {
        return user_support;
    }

    public void setUser_support(String user_support) {
        this.user_support = user_support;
    }
}

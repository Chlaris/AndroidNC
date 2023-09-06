package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

@Entity(tableName = "kma_work_item")
public class WorkItem {
    @PrimaryKey
    @NonNull
    @SerializedName("work_id")
    @Expose
    private String work_id;
    @SerializedName("work_name")
    @Expose
    private String work_name;
    @SerializedName("work_description")
    @Expose
    private String work_description;
    @SerializedName("level_id")
    @Expose
    private String level_id;
    @SerializedName("status_id")
    @Expose
    private String status_id;
    @SerializedName("work_start")
    @Expose
    private Date work_start;
    @SerializedName("work_end")
    @Expose
    private Date work_end;
    @SerializedName("user_create")
    @Expose
    private String user_create;
    @SerializedName("user_respond")
    @Expose
    private String user_respond;
    @SerializedName("user_support")
    @Expose
    private String user_support;

    public WorkItem(@NonNull String work_id, String work_name, String work_description,
                    String level_id, String status_id, Date work_start, Date work_end,
                    String user_create, String user_respond, String user_support) {
        this.work_id = work_id;
        this.work_name = work_name;
        this.work_description = work_description;
        this.level_id = level_id;
        this.status_id = status_id;
        this.work_start = work_start;
        this.work_end = work_end;
        this.user_create = user_create;
        this.user_respond = user_respond;
        this.user_support = user_support;
    }

    @NonNull
    public String getWork_id() {
        return work_id;
    }

    public String getUser_create() {
        return user_create;
    }

    public String getUser_respond() {
        return user_respond;
    }

    public String getWork_name() {
        return work_name;
    }

    public void setWork_name(String work_name) {
        this.work_name = work_name;
    }

    public String getWork_description() {
        return work_description;
    }

    public void setWork_description(String work_description) {
        this.work_description = work_description;
    }

    public String getLevel_id() {
        return level_id;
    }

    public void setLevel_id(String level_id) {
        this.level_id = level_id;
    }

    public String getStatus_id() {
        return status_id;
    }

    public void setStatus_id(String status_id) {
        this.status_id = status_id;
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

    public void setUser_create(String user_create) {
        this.user_create = user_create;
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


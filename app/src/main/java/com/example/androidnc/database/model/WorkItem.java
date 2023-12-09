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
    private Integer work_id;
    @SerializedName("work_name")
    @Expose
    private String work_name;
    @SerializedName("work_description")
    @Expose
    private String work_description;
    @SerializedName("level_id")
    @Expose
    private Integer level_id;
    @SerializedName("status_id")
    @Expose
    private Integer status_id;
    @SerializedName("user_create")
    @Expose
    private String user_create;


    public WorkItem(@NonNull Integer work_id, String work_name, String work_description,
                    Integer level_id, Integer status_id, String user_create) {
        this.work_id = work_id;
        this.work_name = work_name;
        this.work_description = work_description;
        this.level_id = level_id;
        this.status_id = status_id;
        this.user_create = user_create;
    }

    @NonNull
    public Integer getWork_id() {
        return work_id;
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

    public Integer getLevel_id() {
        return level_id;
    }

    public void setLevel_id(Integer level_id) {
        this.level_id = level_id;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public String getUser_create() {
        return user_create;
    }

    public void setUser_create(String user_create) {
        this.user_create = user_create;
    }
}


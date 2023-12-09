package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "kma_connection")
public class Connection {
    @PrimaryKey
    @NonNull
    @SerializedName("connection_id")
    @Expose
    private Integer connection_id;
    @SerializedName("task_id")
    @Expose
    private Integer task_id;
    @SerializedName("file_id")
    @Expose
    private String file_id;


    public Connection(@NonNull Integer connection_id, Integer task_id, String file_id) {
        this.connection_id = connection_id;
        this.task_id = task_id;
        this.file_id = file_id;
    }

    @NonNull
    public Integer getConnection_id() {
        return connection_id;
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }
}

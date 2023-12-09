package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "kma_status")
public class Status {
    @PrimaryKey
    @NonNull
    @SerializedName("status_id")
    @Expose
    private Integer status_id;
    @SerializedName("status_name")
    @Expose
    private String status_name;

    public Status(@NonNull Integer status_id, String status_name) {
        this.status_id = status_id;
        this.status_name = status_name;
    }

    @NonNull
    public Integer getStatus_id() {
        return status_id;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }
}

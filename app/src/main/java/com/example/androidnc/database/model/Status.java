package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "kma_status")
public class Status {
    @PrimaryKey
    @NonNull
    private String status_id;
    private String status_name;

    public Status(@NonNull String status_id, String status_name) {
        this.status_id = status_id;
        this.status_name = status_name;
    }

    @NonNull
    public String getStatus_id() {
        return status_id;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }
}

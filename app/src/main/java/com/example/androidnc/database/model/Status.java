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
}

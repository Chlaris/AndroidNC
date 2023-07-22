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
}

package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "kma_work_item")
public class WorkItem {
    @PrimaryKey
    @NonNull  private String work_id;
    private String work_name;
    private String work_description;
    private Long quantity;
}


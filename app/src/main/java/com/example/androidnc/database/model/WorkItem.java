package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.Date;

@Entity(tableName = "kma_work_item")
public class WorkItem {
    @PrimaryKey
    @NonNull  private String work_id;
    private String work_name;
    private String work_description;
    private String level_id;
    private String status_id;
    private Date work_start;
    private Date work_end;
    private String user_create;
    private String user_respond;
    private String user_support;
}


package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "kma_level")
public class Level {
    @PrimaryKey
    @NonNull
    private String level_id;
    private String level_name;
    private String level_description;
}

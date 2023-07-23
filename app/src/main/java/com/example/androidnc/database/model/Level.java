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

    public Level(@NonNull String level_id, String level_name, String level_description) {
        this.level_id = level_id;
        this.level_name = level_name;
        this.level_description = level_description;
    }

    @NonNull
    public String getLevel_id() {
        return level_id;
    }

    public void setLevel_name(String level_name) {
        this.level_name = level_name;
    }

    public void setLevel_description(String level_description) {
        this.level_description = level_description;
    }

    public String getLevel_name() {
        return level_name;
    }

    public String getLevel_description() {
        return level_description;
    }


    public void remove(Level existLevel) {

    }
}



package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity(tableName = "kma_level")
public class Level {
    @PrimaryKey
    @NonNull
    @SerializedName("level_id")
    @Expose
    private Integer level_id;
    @SerializedName("level_name")
    @Expose
    private String level_name;
    @SerializedName("level_description")
    @Expose
    private String level_description;

    public Level(@NonNull Integer level_id, String level_name, String level_description) {
        this.level_id = level_id;
        this.level_name = level_name;
        this.level_description = level_description;
    }

    @NonNull
    public Integer getLevel_id() {
        return level_id;
    }

    public String getLevel_name() {
        return level_name;
    }

    public void setLevel_name(String level_name) {
        this.level_name = level_name;
    }

    public String getLevel_description() {
        return level_description;
    }

    public void setLevel_description(String level_description) {
        this.level_description = level_description;
    }

    public void remove(Level existLevel) {

    }
}



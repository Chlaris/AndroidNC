package com.example.androidnc.api.converter;

import com.example.androidnc.database.model.Level;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LevelConverter {
    @SerializedName("code")
    @Expose
    private int code;

    @SerializedName("levels")
    @Expose
    private List<Level> levels;

    public LevelConverter() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }
}

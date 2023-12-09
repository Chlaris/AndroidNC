package com.example.androidnc.api.converter;

import com.example.androidnc.database.model.Level;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LevelConverter {
    @SerializedName("all_kma_level")
    @Expose
    private List<Level> levels;

    public LevelConverter() {
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }
}

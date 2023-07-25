package com.example.androidnc.database.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import androidx.lifecycle.LiveData;

import com.example.androidnc.database.model.Level;
import com.example.androidnc.database.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface LevelDAO{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertLevel(Level... levels);
    @Update
    public void updateLevel(Level... levels);
    @Delete
    public void deleteLevel(Level... levels);

    @Query("SELECT * FROM kma_level")
    public LiveData<List<Level>> getAllLevels();

    @Query("SELECT * FROM kma_level where level_id = :id")
    public Level getLevelById(String id);

    @Query("DELETE FROM kma_level WHERE level_id = :id")
    void deleteLevelById(String id);
}

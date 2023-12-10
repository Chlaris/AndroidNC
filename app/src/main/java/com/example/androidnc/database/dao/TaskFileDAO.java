package com.example.androidnc.database.dao;

import android.arch.persistence.room.Query;
import androidx.lifecycle.LiveData;

import com.example.androidnc.database.model.TaskFile;

import java.util.List;

public interface TaskFileDAO {
    @Query("SELECT * FROM kma_task_file")
    public LiveData<List<TaskFile>> getAllFiles();
}

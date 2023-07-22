package com.example.androidnc.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import com.example.androidnc.database.model.Task;

@Dao
public interface TaskDAO {
//    @Insert
//    public void insert(Task tasks);
    @Insert
    public void insert(Task... tasks);
    @Update
    public void update(Task... tasks);
    @Delete
    public void delete(Task... tasks);
}

package com.example.androidnc.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.androidnc.database.model.Task;

import java.util.List;

@Dao
public interface TaskDAO {
    @Insert
    public void insertTask(Task... tasks);
    @Update
    public void updateTask(Task... tasks);
    @Delete
    public void deleteTask(Task... tasks);

    @Query("SELECT * FROM kma_task_item")
    public List<Task> getAllTasks();

    @Query("SELECT * FROM kma_task_item where task_id = :id")
    public Task getTasksById(String id);

    @Query("SELECT * FROM kma_task_item WHERE work_id = :id")
    public Task getTasksByWorId(String id);

    @Query("DELETE FROM kma_task_item WHERE task_id = :id")
    void deleteTaskById(String id);
}

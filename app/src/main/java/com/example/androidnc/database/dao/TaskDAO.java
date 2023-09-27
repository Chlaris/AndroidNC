package com.example.androidnc.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.androidnc.database.model.Task;
import com.example.androidnc.database.model.WorkItem;

import java.util.List;

@Dao
public interface TaskDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertTask(Task... tasks);
    @Update
    public void updateTask(Task... tasks);
    @Delete
    public void deleteTask(Task... tasks);

    @Query("SELECT * FROM kma_task_item")
    public List<Task> getAllTasks();

    @Query("SELECT * FROM kma_task_item where task_id = :id")
    public Task getTaskById(String id);

    @Query("SELECT * FROM kma_task_item WHERE work_id = :id")
    public Task getTaskByWorId(String id);

    @Query("DELETE FROM kma_task_item WHERE task_id = :id")
    void deleteTaskById(String id);

    @Query("SELECT * FROM kma_task_item WHERE user_respond = :user_respond")
    public WorkItem getTaskItemByUserRespond(String user_respond);
}

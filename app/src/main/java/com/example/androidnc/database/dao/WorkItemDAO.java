package com.example.androidnc.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import androidx.lifecycle.LiveData;

import com.example.androidnc.database.model.WorkItem;
import java.util.List;

@Dao
public interface WorkItemDAO {
    // methods without writing SQL statement
    // Room library does not understand the function names
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertWorkItem(WorkItem... items);
    // return an int value indicating the number of rows that were updated successfully
    @Update
    public void updateWorkItem(WorkItem... items);
    @Delete
    public void deleteWorkItem(WorkItem item);
    // writing SQL statements
    @Query("SELECT * FROM kma_work_item")
    public LiveData<List<WorkItem>> getAllWorkItems(); //WorkItem[]

    @Query("SELECT * FROM kma_work_item WHERE work_id = :work_id")
    public WorkItem getWorkItemById(String work_id);

//    @Query("SELECT work_name FROM kma_work_item")
//    public List<WorkItem> loadFullName();


    @Query("SELECT * FROM kma_work_item WHERE user_create = :user_create")
    public WorkItem getWorkItemByUserCreate(String user_create);

}

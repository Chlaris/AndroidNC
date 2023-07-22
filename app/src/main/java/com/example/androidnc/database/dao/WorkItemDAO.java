package com.example.androidnc.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.androidnc.database.model.WorkItem;

import java.util.List;

@Dao
public interface WorkItemDAO {
//    @Insert
//    public void insert(WorkItem item);
    @Insert
    public void insert(WorkItem... items);
    @Update
    public void update(WorkItem... items);
    @Delete
    public void delete(WorkItem item);

    @Query("SELECT * FROM kma_work_item")
    public List<com.example.androidnc.database.model.WorkItem> getAllWorkItems();

    @Query("SELECT * FROM kma_work_item WHERE work_id = :work_id")
    public com.example.androidnc.database.model.WorkItem getWorkItemById(String work_id);

    @Query("SELECT * FROM kma_work_item WHERE user_create = :user_create")
    public com.example.androidnc.database.model.WorkItem getWorkItemByUserCreate(String user_create);

    @Query("SELECT * FROM kma_work_item WHERE user_respond = :user_respond")
    public com.example.androidnc.database.model.WorkItem getWorkItemByUserRespond(String user_respond);
}

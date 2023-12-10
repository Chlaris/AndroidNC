package com.example.androidnc.database.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.androidnc.database.model.Notification;
import com.example.androidnc.database.model.Task;

public interface NotificationDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertNotif(Notification... notifications);
    @Delete
    public void deleteNotif(Notification... notifications);

    @Query("SELECT * FROM kma_notification WHERE user_received = :user_id")
    public Task getNotif(String user_id);
}

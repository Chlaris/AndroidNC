package com.example.androidnc.database.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import androidx.lifecycle.LiveData;
import com.example.androidnc.database.model.Connection;

import java.util.List;
public interface ConnectionDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertConnection(Connection... connections);
    @Update
    public void updateConnection(Connection... connections);
    @Delete
    public void deleteConnection(Connection... connections);
//    @Query("SELECT * FROM kma_connection")
//    public LiveData<List<Connection>> getAllKmaConnections();

    @Query("SELECT * FROM kma_connection WHERE task_id = :task_id")
    public Connection getKmaConnectionByTask(Integer task_id);

    @Query("DELETE FROM kma_connection WHERE connection_id = :id")
    void deleteConnection(Integer id);
}

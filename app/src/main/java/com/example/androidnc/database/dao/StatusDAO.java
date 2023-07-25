package com.example.androidnc.database.dao;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import androidx.lifecycle.LiveData;

import com.example.androidnc.database.model.Status;
import com.example.androidnc.database.model.WorkItem;

import java.util.List;

@Dao
public interface StatusDAO {
    @Insert (onConflict = REPLACE)
    public void insertStatus(Status... status);
    @Update
    public void updateStatus(Status... status);
    @Delete
    public void deleteStatus(Status... status);
    // The conflict strategy defines what happens,
    // if there is an existing entry.
    // The default action is ABORT.

    @Query("SELECT * FROM kma_status")
    public LiveData<List<Status>> getAllStatus();

    @Query("SELECT * FROM kma_status where status_id = :id")
    public Status getStatusById(String id);

    @Query("DELETE FROM kma_status WHERE status_id = :id")
    void deleteStatusById(String id);

}

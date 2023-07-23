package com.example.androidnc.database;


import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;

import androidx.annotation.NonNull;

import com.example.androidnc.database.dao.LevelDAO;
import com.example.androidnc.database.dao.StatusDAO;
import com.example.androidnc.database.dao.TaskDAO;
import com.example.androidnc.database.dao.WorkItemDAO;
import com.example.androidnc.database.model.Level;
import com.example.androidnc.database.model.Status;
import com.example.androidnc.database.model.Task;
import com.example.androidnc.database.model.WorkItem;

// bump version number if schema changes
@Database(
        entities = {
                WorkItem.class,
                Task.class,
                Level.class,
                Status.class
        },
        exportSchema = false,
        version = 1)

public abstract class AndroidNCDatabase extends RoomDatabase {
    // Database name to be used
    private static final String ANDROID_NC_DB_NAME = "NC_ANDROID_DB.db";
    private static volatile AndroidNCDatabase instance;

    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

//    @Override
//    public void clearAllTables() {
//
//    }


    // Declare data access objects as abstract
    public abstract WorkItemDAO worItemDAO();
    public abstract TaskDAO taskDAO();
    public abstract LevelDAO levelDAO();
    public abstract StatusDAO statusDAO();

}
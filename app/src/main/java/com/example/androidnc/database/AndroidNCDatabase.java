package com.example.androidnc.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import androidx.annotation.NonNull;

import com.example.androidnc.database.dao.WorkItemDAO;
import com.example.androidnc.database.model.Level;
import com.example.androidnc.database.model.Status;
import com.example.androidnc.database.model.Task;
import com.example.androidnc.database.model.WorkItem;

@Database(
        entities = {
                WorkItem.class,
                Task.class,
                Level.class,
                Status.class
        },
        exportSchema = false,
        version = 32)

public abstract class AndroidNCDatabase extends RoomDatabase {
    private static final String ANDROID_NC_DB_NAME = "NC_ANDROID_DB.db";
    private static volatile AndroidNCDatabase instance;

    public static final RoomDatabase.Callback ON_CREATE_CALLBACK = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }
    };

    public abstract WorkItemDAO getAllWorItemDAO();
}
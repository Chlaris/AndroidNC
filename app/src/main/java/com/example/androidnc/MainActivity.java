package com.example.androidnc;

import androidx.appcompat.app.AppCompatActivity;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.example.androidnc.database.AndroidNCDatabase;
import com.example.androidnc.database.dao.LevelDAO;
import com.example.androidnc.database.dao.StatusDAO;
import com.example.androidnc.database.model.Level;
import com.example.androidnc.database.model.Status;

public class MainActivity extends AppCompatActivity {
    private AndroidNCDatabase db = null;
    private StatusDAO statuses = null;
    private LevelDAO levels = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = AndroidNCDatabase.getDatabase(this);
        statuses = db.statusDAO();
        levels = db.levelDAO();

        statuses.insertStatus(new Status("1", "doing"));
        statuses.insertStatus(new Status("2", "done"));
        statuses.insertStatus(new Status("3", "delay"));

        levels.insertLevel(new Level("1", "urgent", "urgent"));
        levels.insertLevel(new Level("2", "important", "important"));
        levels.insertLevel(new Level("3", "normal", "normal"));
    }

}
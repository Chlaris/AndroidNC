package com.example.androidnc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.androidnc.api.AndroidNCApi;
import com.example.androidnc.api.RetrofitInstance;
import com.example.androidnc.api.converter.WorkItemConverter;
import com.example.androidnc.database.AndroidNCDatabase;
import com.example.androidnc.database.dao.LevelDAO;
import com.example.androidnc.database.dao.StatusDAO;
import com.example.androidnc.database.model.WorkItem;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private AndroidNCDatabase db = null;
    private StatusDAO statuses = null;
    private LevelDAO levels = null;

    ArrayList<WorkItem> workItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWorkItem();
//        db = AndroidNCDatabase.getDatabase(this);
//        statuses = db.statusDAO();
//        levels = db.levelDAO();
//
//        statuses.insertStatus(new Status("1", "doing"));
//        statuses.insertStatus(new Status("2", "done"));
//        statuses.insertStatus(new Status("3", "delay"));
//
//        levels.insertLevel(new Level("1", "urgent", "urgent"));
//        levels.insertLevel(new Level("2", "important", "important"));
//        levels.insertLevel(new Level("3", "normal", "normal"));
    }

    void getWorkItem() {
        AndroidNCApi api = RetrofitInstance.getService();
        Call<WorkItemConverter> calls = api.getAllKmaWork();
        calls.enqueue(new Callback<WorkItemConverter>() {
            @Override
            public void onResponse(Call<WorkItemConverter> call, Response<WorkItemConverter> response) {
                WorkItemConverter result = response.body();
                if(result != null && result.getWork_items() != null){
                    workItems = (ArrayList<WorkItem>)
                            result.getWork_items();
                    for (WorkItem c : workItems) {
                        Log.i("TAG", " " + c.getWork_name());
                    }
                }
            }

            @Override
            public void onFailure(Call<WorkItemConverter> call, Throwable t) {

            }
        });
    }

}
package com.example.androidnc.api;

import com.example.androidnc.database.model.Level;
import com.example.androidnc.database.model.Status;
import com.example.androidnc.database.model.Task;
import com.example.androidnc.database.model.WorkItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AndroidNCApi {
    String MODIFIED_SINCE_HEADER = "If-Modified-Since";
    String IF_NONE_MATCH = "If-None-Match";

    // Level
    @GET("kma_level/{id}")
    Call<Level> getLevel(@Path("id") String lever_id);

    @GET("kma_level")
    Call<List<Level>> getLevel1(@Query("id") String lever_id);

    @GET("kma_level")
    Call<List<Level>> getAllLevel();

//    @POST("/kma_level")
//    Call<Level> createLevel(@Body Level level);


    // Status
    @GET("kma_status/{id}")
    Call<List<Status>> getStatus(@Path("id") String status_id);
    @GET("kma_status")
    Call<List<Status>> getAllStatus();

    // Task
    @GET("kma_task/{id}")
    Call<List<Task>> getTaskb(@Path("id") String task_id);

    @GET("kma_task/{id}")
    Call<List<Task>> getTaskbyWorkID(@Path("id") String work_id);

    @GET("kma_task/{id}")
    Call<List<Task>> getTaskbyStatusID(@Path("id") String status_id);

    @GET("kma_task")
    Call<List<Task>> getAllTask();

    @POST("kma_task")
    Call<Task> createTask(@Body Task task);

    // update entire, the same as POST
    @PUT("kma_task/{id}")
    Call<Task> putTask(@Path("id") String task_id, @Body Task task);

    @PATCH("kma_task/{id}")
    Call<Task> patchTask(@Path("id") String task_id, @Body Task task);

    @DELETE("kma_task/{id}")
    Call<Void> deleteTask(@Path("id") String task_id);


    // WorkItem
    @GET("kma_work_item/{id}")
    Call<List<WorkItem>> getWorkItem(@Path("id") String work_id);
    @GET("kma_work_item/{id}")
    Call<List<WorkItem>> getWorkItembyLevelID(@Path("id") String level_id);

    @GET("kma_work_item/{id}")
    Call<List<WorkItem>> getWorkItembyUserCreatID(@Path("id") String user_create);

    @GET("kma_work_item/{id}")
    Call<List<WorkItem>> getWorkItembyStatusID(@Path("id") String status_id);

    @GET("kma_work_item")
    Call<List<WorkItem>> getAllWorkItem();

}

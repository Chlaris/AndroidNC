package com.example.androidnc.api;

import com.example.androidnc.api.converter.WorkItemConverter;
import com.example.androidnc.database.model.Account;
import com.example.androidnc.database.model.Comment;
import com.example.androidnc.database.model.Connection;
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
    // Comment
    @GET("all_task_comments")
    Call<List<Comment>> getAllTaskComments();
    @POST("create_kma_comment")
    Call<Comment> createKmaComment(@Body Comment comment);

    // Connection
    @GET("getAllKmaConnections")
    Call<List<Connection>> getAllKmaConnections();
    @POST("create_kma_connection")
    Call<Connection> createKmaConnection(@Body Connection connection);


    // Level
    @GET("all_kma_level")
    Call<List<Level>> getAllKmaLevel();

    @POST("create_kma_level")
    Call<Level> createKmaLevel(@Body Level level);

    // Status
    @GET("all_kma_status")
    Call<List<Status>> getAllKmaStatus();
    @POST("create_kma_level")
    Call<Status> createKmaStatus(@Body Status status);

    // Task
    @GET("all_kma_task")
    Call<List<Task>> getAllKmaTask();

    @POST("create_kma_task")
    Call<Task> createKmaTask(@Body Task task);


    // WorkItem
    @GET("all_kma_work")
    public Call<WorkItemConverter> getAllKmaWork();

    @POST("create_kma_work")
    Call<Task> createKmaWork(@Body WorkItem work);

    //Account
    @GET("account")
    Call<List<Account>> getAllAccount();
}

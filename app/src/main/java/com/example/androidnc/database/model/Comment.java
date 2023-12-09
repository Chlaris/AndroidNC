package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "kma_comment")
public class Comment {
    @PrimaryKey
    @NonNull
    @SerializedName("comment_id")
    @Expose
    private Integer comment_id;
    @SerializedName("user_create")
    @Expose
    private String user_create;
    @SerializedName("message")
    @Expose
    private String message;

    public Comment(@NonNull Integer comment_id, String user_create, String message) {
        this.comment_id = comment_id;
        this.user_create = user_create;
        this.message = message;
    }

    @NonNull
    public Integer getComment_id() {
        return comment_id;
    }

    public String getUser_create() {
        return user_create;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

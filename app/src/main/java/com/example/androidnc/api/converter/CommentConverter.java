package com.example.androidnc.api.converter;

import com.example.androidnc.database.model.Comment;
import com.example.androidnc.database.model.Connection;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommentConverter {
    @SerializedName("all_task_comments")
    @Expose
    private List<Comment> comments;

    public CommentConverter() {
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}

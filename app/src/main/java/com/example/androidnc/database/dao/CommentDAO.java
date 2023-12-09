package com.example.androidnc.database.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import androidx.lifecycle.LiveData;
import com.example.androidnc.database.model.Comment;

import java.util.List;

public interface CommentDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertComment(Comment... comments);
    @Update
    public void updateComment(Comment... comments);
    @Delete
    public void deleteComment(Comment... comments);
//    @Query("SELECT * FROM kma_comment")
//    public LiveData<List<Comment>> getAllTaskComments();

    @Query("SELECT * FROM kma_comment WHERE task_id = :id")
    public Comment getKmaCommentInTask(Integer id);

    @Query("DELETE FROM kma_comment WHERE comment_id = :id")
    void deleteComment(Integer id);
}

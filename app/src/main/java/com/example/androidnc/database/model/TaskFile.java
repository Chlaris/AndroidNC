package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "kma_task_file")
public class TaskFile {
    @PrimaryKey
    @NonNull
    @SerializedName("file_id")
    @Expose
    private Integer file_id;
    @SerializedName("file_name")
    @Expose
    private String file_name;
    @SerializedName("file_path")
    @Expose
    private String file_path;
    @SerializedName("file_size")
    @Expose
    private String file_size;

    public TaskFile(@NonNull Integer file_id, String file_name, String file_path, String file_size) {
        this.file_id = file_id;
        this.file_name = file_name;
        this.file_path = file_path;
        this.file_size = file_size;
    }

    @NonNull
    public Integer getFile_id() {
        return file_id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFile_path() {
        return file_path;
    }

    public String getFile_size() {
        return file_size;
    }
}

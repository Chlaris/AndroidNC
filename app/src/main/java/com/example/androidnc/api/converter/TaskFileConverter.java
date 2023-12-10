package com.example.androidnc.api.converter;

import com.example.androidnc.database.model.TaskFile;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TaskFileConverter {
    @SerializedName("filecache")
    @Expose
    private List<TaskFile> taskFiles;

    public TaskFileConverter() {
    }

    public List<TaskFile> getTaskFiles() {
        return taskFiles;
    }

    public void setTaskFiles(List<TaskFile> taskFiles) {
        this.taskFiles = taskFiles;
    }
}

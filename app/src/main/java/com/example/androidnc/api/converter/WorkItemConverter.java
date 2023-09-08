package com.example.androidnc.api.converter;

import com.example.androidnc.database.model.Task;
import com.example.androidnc.database.model.WorkItem;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorkItemConverter {
    @SerializedName("code")
    @Expose
    private int code;

    @SerializedName("work_items")
    @Expose
    private List<WorkItem> work_items;

    public WorkItemConverter() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<WorkItem> getWork_items() {
        return work_items;
    }

    public void setWork_items(List<WorkItem> work_items) {
        this.work_items = work_items;
    }
}

package com.example.androidnc.api.converter;

import com.example.androidnc.database.model.Level;
import com.example.androidnc.database.model.Status;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StatusConverter {
    @SerializedName("status")
    @Expose
    private List<Status> status;

    public StatusConverter() {
    }

    public List<Status> getStatus() {
        return status;
    }

    public void setStatus(List<Status> status) {
        this.status = status;
    }
}

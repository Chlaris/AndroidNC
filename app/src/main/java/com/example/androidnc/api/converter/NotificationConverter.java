package com.example.androidnc.api.converter;

import com.example.androidnc.database.model.Notification;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NotificationConverter {
    @SerializedName("kma_notification")
    @Expose
    private List<Notification> notifications;

    public NotificationConverter() {
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}

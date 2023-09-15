package com.example.androidnc.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "kma_account")
public class Account {
    @PrimaryKey
    @NonNull
    @SerializedName("account_id")
    @Expose
    private String account_id;
    @SerializedName("account_data")
    @Expose
    private String account_data;

    public Account(@NonNull String account_id, String account_data) {
        this.account_id = account_id;
        this.account_data = account_data;
    }

    @NonNull
    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(@NonNull String account_id) {
        this.account_id = account_id;
    }

    public String getAccount_data() {
        return account_data;
    }

    public void setAccount_data(String account_data) {
        this.account_data = account_data;
    }
}


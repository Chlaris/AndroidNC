package com.example.androidnc.api.converter;

import com.example.androidnc.database.model.Account;
import com.example.androidnc.database.model.Level;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AccountConverter {
    @SerializedName("code")
    @Expose
    private int code;

    @SerializedName("accounts")
    @Expose
    private List<Account> accounts;
}

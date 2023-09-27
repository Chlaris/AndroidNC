package com.example.androidnc.api.converter;

import com.example.androidnc.database.model.Account;
import com.example.androidnc.database.model.Level;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AccountConverter {
    @SerializedName("accounts")
    @Expose
    private List<Account> accounts;

    public AccountConverter() {
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}

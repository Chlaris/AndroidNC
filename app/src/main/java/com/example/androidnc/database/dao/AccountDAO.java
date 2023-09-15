package com.example.androidnc.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import androidx.lifecycle.LiveData;

import com.example.androidnc.database.model.Account;
import com.example.androidnc.database.model.Level;

import java.util.List;
@Dao
public interface AccountDAO {
    @Query("SELECT * FROM kma_account")
    public LiveData<List<Account>> getAllAccounts();
}

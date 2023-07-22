package com.example.androidnc.database.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import java.util.List;
import java.util.Optional;

public interface GenericDao<T> {

    List<T> getAll();

    Optional<T> get(String id);

    @SuppressWarnings("unchecked")
    @Insert
    void insert(T t);

    @SuppressWarnings("unchecked")
    @Update
    void update(T t);

    @SuppressWarnings("unchecked")
    @Delete
    void delete(T t);
}


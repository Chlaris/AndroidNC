package com.example.androidnc.database.dao;

import com.example.androidnc.database.model.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LevelDAO implements GenericDao<Level>{

    private List<Level> levels = new ArrayList<>();
    public LevelDAO() {
        levels.add(new Level("1", "urgent", "urgent"));
        levels.add(new Level("2", "important", "important"));
        levels.add(new Level("3", "normal", "normal"));
    }

    @Override
    public List<Level> getAll() {
        return levels;
    }

    @Override
    public Optional<Level> get(String id) {
        return levels.stream().filter(u -> u.getLevel_id() == id).findFirst();
    }

    @Override
    public void insert(Level t) {
        levels.add(t);
    }

    @Override
    public void update(Level t) {
        get(t.getLevel_id()).ifPresent(existLevel -> {
            existLevel.setLevel_name(t.getLevel_name());
            existLevel.setLevel_description(t.getLevel_description());
        });
    }

    @Override
    public void delete(Level t) {
        get(t.getLevel_id()).ifPresent(existLevel -> t.remove(existLevel));
    }
}

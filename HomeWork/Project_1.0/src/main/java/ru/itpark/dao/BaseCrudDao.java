package ru.itpark.dao;


import java.util.List;

public interface BaseCrudDao<T> {
    int save(T name);
    T find(int id);
    void update(T name);
    void delete(int id);
    List<T> findAll();
}

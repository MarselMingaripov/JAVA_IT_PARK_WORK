package ru.itpark.dao;

import java.util.List;


public interface BaseCrudDao<T> {

    int save(T model);


    T find(int id);


    void update(T model);


    void delete(int id);


    List<T> findAll();
}

package com.iNovus.dao;


import com.iNovus.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Long> {
    Role findByName(String name);
}

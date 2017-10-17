package com.iNovus.service;


import com.iNovus.model.User;
import com.iNovus.model.UserRole;

import java.util.Set;

public interface UserService {

    User findByUsername(String username);

    boolean checkUserExists(String username);

    boolean checkUsernameExists(String username);

    void save(User user);

    User createUser(User user, Set<UserRole> userRoles);

    User saveUser (User user);
}

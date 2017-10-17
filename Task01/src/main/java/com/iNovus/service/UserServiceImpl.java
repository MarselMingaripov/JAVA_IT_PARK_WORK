package com.iNovus.service;

import com.iNovus.dao.RoleDao;
import com.iNovus.dao.UserDao;
import com.iNovus.model.User;
import com.iNovus.model.UserRole;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger LOG = (Logger) LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public boolean checkUserExists(String username) {
        if (checkUsernameExists(username)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkUsernameExists(String username) {

        if (null != findByUsername(username)) {
            return true;
        }

        return false;
    }

    @Override
    public void save(User user) {
        userDao.save(user);

    }

    @Override
    public User createUser(User user, Set<UserRole> userRoles) {
        User localUser = userDao.findByUsername(user.getUsername());
        if (localUser != null){
            LOG.info("User with username {} is already exist. Sorry!");
        } else {
            String encryptedPassword = passwordEncoder.encode(user.getPassword());

            for (UserRole ur : userRoles){
                roleDao.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            localUser = userDao.save(user);
        }
        return localUser;
    }

    @Override
    public User saveUser(User user) {

        return userDao.save(user);
    }
}

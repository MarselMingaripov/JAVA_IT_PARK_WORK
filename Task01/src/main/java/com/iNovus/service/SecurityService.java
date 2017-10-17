package com.iNovus.service;

import com.iNovus.dao.UserDao;
import com.iNovus.model.User;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(SecurityService.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userDao.findByUsername(username);
        if (user == null){
            LOG.warn("Username {} not found, ");
            throw new UsernameNotFoundException("Username " + username + " not found");
        }
        return (UserDetails) user;
    }
}

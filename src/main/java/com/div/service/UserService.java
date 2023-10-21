package com.div.service;

import com.div.model.User;

public interface UserService {

    User findById(Long id);
    User create(User user);

}

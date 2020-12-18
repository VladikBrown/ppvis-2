package com.vladbrown.core.model.service.userService;

import com.vladbrown.core.model.entity.User;

public interface UserService {

    User get(Long id);

    User create(User user);

    User update(User user);
}

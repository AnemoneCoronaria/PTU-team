package com.PTUproject.login.service;

import com.PTUproject.user.repository.UserMapper;
import com.PTUproject.login.dto.Login;
import com.PTUproject.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private UserMapper userMapper;

    public void authenticate(Login login) {
        User user = userMapper.selectById(login.getId());
        if (user == null) {
            login.setError("Email does not exist.");
        } else {
            if (!user.getPassword().equals(login.getPassword())) {
                login.setError("Password is not correct.");
            } else {
                login.setError(null);
            }
        }
    }
}

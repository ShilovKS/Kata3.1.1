package com.example.pp_3_1_1_boot.service;

import com.example.pp_3_1_1_boot.model.User;
import java.util.List;

public interface UserService {

    void addUser(User user);
    List<User> getAllUsers();
    User getUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);

}

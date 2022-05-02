package com.example.pp_3_1_1_boot.service;

import com.example.pp_3_1_1_boot.repository.UserRepository;
import com.example.pp_3_1_1_boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User getUser(Long id) {
//        User user = null;
//        Optional<User> optional = userRepository.findById(id);
//        if(optional.isPresent()) {
//            user = optional.get();
//        }
        return userRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}

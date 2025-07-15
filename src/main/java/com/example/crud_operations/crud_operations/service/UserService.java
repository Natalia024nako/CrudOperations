package com.example.crud_operations.crud_operations.service;

import com.example.crud_operations.crud_operations.model.User;
import com.example.crud_operations.crud_operations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    //injektim konstruktori
    @Autowired

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();

    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    //getUserByID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);

    }
    //Update
    public User updateUser(Long id, User updateUser){
        return userRepository.update(id, updateUser);
    }
    //Delete
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}

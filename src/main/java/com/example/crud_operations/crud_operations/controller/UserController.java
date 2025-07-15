package com.example.crud_operations.crud_operations.controller;

import com.example.crud_operations.crud_operations.model.User;
import com.example.crud_operations.crud_operations.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @Autowired

    public UserController(UserService userService){
        this.userService = userService;
    }
    // Get merr te gjithe perdoruesit


    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    //post -> shtim i nje user

    @PostMapping
    public User createUser(@RequestBody User user ){
        return  userService.createUser(user);
    }

    //put per te uddate-uar

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updateUser){
        return userService.updateUser(id, updateUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build(); //kthen status 204 - no comment nuk ka permbajtje
    }
}

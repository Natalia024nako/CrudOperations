package com.example.crud_operations.crud_operations.repository;

import com.example.crud_operations.crud_operations.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// shtresa qe eshte eshte e pergjigjshme per qasjen dhe manipulimin e te dhenave
@Repository

public class UserRepository {
    private final List<User> users = new ArrayList<>();
    //zakonisht perdoret nje repository per te ruajtur users, por duke qene se nuk kemi database, e stimulojme vet kte mekanizem

    private Long nextId = 1L;

    //metode qe kthen te gjithe users
    public List<User> findAll(){
        return new ArrayList<>(users);
    }
    //Gjej user sipas id  findById
    public Optional<User> findById(Long id ){
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }
    // kemi ruajtjen e nje user

    public User save(User user){
        user.setId(nextId++); //I vendos perdoruesit nje id unike
        users.add(user);
        return user;
    }
    //Fshirja e nje user

    public void deleteById(Long id ){
        users.removeIf(user -> user.getId().equals(id));
    }
    // update i nje user

    public User update(Long id, User updateUser){
        //Shofim nese ekziston user me ate Id qe duam
        Optional<User> existingUser = findById(id);
        if(existingUser.isPresent()){
            User existingOUser = existingUser.get();
            existingOUser.setName(updateUser.getName());
            existingOUser.setName(updateUser.getEmail());
            return existingOUser;
        }
        return null;

    }
}

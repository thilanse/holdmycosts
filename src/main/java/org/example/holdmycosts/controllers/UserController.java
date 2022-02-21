package org.example.holdmycosts.controllers;

import org.example.holdmycosts.models.User;
import org.example.holdmycosts.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping()
    public List<User> getUsers() {
//        List<String> users = new ArrayList<>();
//        users.add("Thilan");
//        users.add("Saveen");
        return userRepository.findAll();
    }

    @PostMapping()
    public void createUser(@RequestBody User user) {
        userRepository.save(user);
    }
}

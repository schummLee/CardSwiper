package com.example.demo1.Controller;
import com.example.demo1.Repositories.UserRepositories;

@RestController
@RequestMapping("/users")
public class MyRestController {

    private final UserRepositories userRepositories;

    public MyRestController(UserRepositories userRepositories) {
        this.userRepositories = userRepositories; 
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {return this.userRepositories.findById(userId).get();}

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) { this.userRepositories.deleteById(userId); }

}
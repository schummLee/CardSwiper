package com.example.demo1.Controller;

@RestController
@RequestMapping("/users")
public class MyRestController {

    private final UserRepository userRepository;

    public MyRestController(UserRepository userRepository) {
        this.userRepository = userRepository; 
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {return this.userRepository.findById(userId).get();}

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) { this.userRepository.deleteById(userId); }

}
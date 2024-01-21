package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.UserNotFoundException;
import system.model.User;
import system.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> getAllUsers() {
        try {
            return userService.getAllUsers();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve Users", e);
        }
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id)  {
        return userService.findById(id).orElseThrow(() -> new UserNotFoundException("User not found with ID: " + id));
    }

}

package harsh.singh.dynamic_Backend.controller;

import harsh.singh.dynamic_Backend.model.User;
import harsh.singh.dynamic_Backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class Controller {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public void saveUsers(@RequestBody List<User> users) {
        userService.saveUsers(users);
    }
    @DeleteMapping("{email}")
    public void deleteUser(@PathVariable String email)
    {
        userService.deleteUser(email);
    }
    @GetMapping("/get")
    public List<User> getData(){
        return userService.getAll();
    }


}

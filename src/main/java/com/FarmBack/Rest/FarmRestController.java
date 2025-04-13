package com.FarmBack.Rest;
import com.FarmBack.DataSource.UsersService;
import com.FarmBack.Model.User;
import com.FarmBack.Model.UserSession;
import jakarta.validation.constraints.Null;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class FarmRestController {
    private final UsersService usersService;

    FarmRestController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public List<User> GetUsers() {
        List<User> users = usersService.findAllUsers();
        return users;
    }

    @PostMapping ("/login")
    public void Login(@RequestParam("login") String login, @RequestParam("password") String password) {

    }

    @GetMapping("/user")
    public Optional<User> FindUser() {
        Optional<User> user = usersService.findUserByLoginAndPassword("oihgfjeuigfuierie", "");
        return user;
    }
}

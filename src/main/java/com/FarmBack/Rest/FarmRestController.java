package com.FarmBack.Rest;
import com.FarmBack.DataSource.UsersService;
import com.FarmBack.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

}

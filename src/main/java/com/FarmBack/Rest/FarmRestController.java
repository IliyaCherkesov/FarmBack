package com.FarmBack.Rest;
import com.FarmBack.DataSource.UserRolesService;
import com.FarmBack.DataSource.UserSessionService;
import com.FarmBack.DataSource.UsersService;
import com.FarmBack.Model.*;
import com.FarmBack.Repositories.UserSessionsRepository;
import jakarta.validation.constraints.Null;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class FarmRestController {
    private final UsersService usersService;
    private final UserSessionService userSessionsService;
    private final UserRolesService userRolesService;

    FarmRestController(UsersService usersService, UserSessionService userSessionService, UserRolesService userRolesService) {
        this.usersService = usersService;
        this.userSessionsService = userSessionService;
        this.userRolesService = userRolesService;
    }

    @GetMapping("/users")
    public List<User> GetUsers() {
        return usersService.findAllUsers();
    }

    @PostMapping ("/login")
    public UserSession Login(@RequestBody UserLoginDTO creds) throws Exception {
        Optional<User> user = usersService.findUserByLoginAndPassword(creds.login, creds.password);
        if (user.isPresent()) {
            return this.userSessionsService.CreateUserSession(user.get());

        }
        throw new Exception("user not found");
    }

    @GetMapping("/user")
    public Optional<User> FindUser() {
        return usersService.findUserByLoginAndPassword("oihgfjeuigfuierie", "");
    }

    @PostMapping ("/user")
    public User CreateUser(@RequestBody UserDTO newUser) throws Exception {
        List<UserRole> userRoles = this.userRolesService.GetUserRoles();
        UserRole userRole = null;
        for (UserRole ur : userRoles) {
            if (ur.id.equals(newUser.role_id))
            {
                userRole = ur;
                break;
            }
        }
        if (userRole == null) {
            throw new Exception("Role not found");
        }
        return this.usersService.CreateUser(newUser.birthday, newUser.name, newUser.email, newUser.phone, userRole,newUser.password);

    }

}

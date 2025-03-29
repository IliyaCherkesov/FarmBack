package com.FarmBack.Rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FarmRestController {
    @GetMapping("/users")
    public ArrayList<String> GetUsers() {
        ArrayList<String> users = new ArrayList<>();
        users.add("Supervisor");
        return users;
    }

}

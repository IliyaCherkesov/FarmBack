package com.FarmBack.DataSource;

import com.FarmBack.Model.User;
import com.FarmBack.Repositories.UserRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    private final UserRepository userRepository;

    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return this.userRepository.findAll();
    }

    public Optional<User> findUserByLoginAndPassword(String login, String password) {
        User probe = new User();
        probe.email = login;

        Example<User> example= Example.of(probe);

        return this.userRepository.findOne(example);
    }
}



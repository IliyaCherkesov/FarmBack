package com.FarmBack.DataSource;

import com.FarmBack.Model.User;
import com.FarmBack.Model.UserRole;
import com.FarmBack.Repositories.UserRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsersService {
    private final UserRepository userRepository;

    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return this.userRepository.findAll();
    }

    public String getUserToken(String userId, String token) {
        userId = null;
        return userId
    }

    public Optional<User> findUserByLoginAndPassword(String login, String password) {
        User probe = new User();
        probe.email = login;
        probe.crypted_password = this.md5(password);
        Example<User> example= Example.of(probe);

        return this.userRepository.findOne(example);
    }

    public User CreateUser (String birthday, String name, String email, String phone, UserRole user_role, String password) {
        User newUser = new User();

        newUser.id = UUID.randomUUID().toString();
        newUser.email = email;
        newUser.crypted_password = this.md5(password);
        newUser.birthday = birthday;
        newUser.name = name;
        newUser.phone = phone;
        newUser.role_id = user_role.id;
        return this.userRepository.save(newUser);
    }

    private String md5(String source) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(source.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String character = String.format("%02x", b);
                hexString.append(character);
            }
            return hexString.toString();
        }
        catch (NoSuchAlgorithmException e) {
            return "";
        }
    }
}



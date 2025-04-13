package com.FarmBack.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    String id;
    public String getId() {return id;}

    String birthday;
    public String getBirthday() {
        return birthday;
    }

    String name;
    public String getName() {
        return name;
    }

    String email;

    public String getEmail() {
        return email;
    }

    String phone;

    public String getPhone() {
        return phone;
    }

    String role_id;

    public String getRole_id() {
        return role_id;
    }

}

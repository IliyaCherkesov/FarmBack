package com.FarmBack.Model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    String id;

    public String getId() { return id; }

    String name;

    public String getName() { return name; }

    Date birthday;

    public Date getBirthday() { return birthday; }

    String email;

    public String getEmail() { return email; }

    String phone;

    public String getPhone() { return phone; }

    String role_id;

    public String getRole_id() { return role_id; }
}

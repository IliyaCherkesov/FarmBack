package com.FarmBack.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    public String id;

    public String getId() {return id;}

    public String birthday;

    public String getBirthday() { return birthday; }

    public String name;

    public String getName() {
        return name;
    }

    public String email;

    public String getEmail() {
        return email;
    }

    public String phone;

    public String getPhone() {
        return phone;
    }

    public String role_id;

    public String getRole_id() {
        return role_id;
    }

    public String crypted_password;
    public String getCrypted_password() { return crypted_password; }
}

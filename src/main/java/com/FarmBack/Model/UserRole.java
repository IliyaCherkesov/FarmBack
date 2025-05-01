package com.FarmBack.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "user_roles")
public class UserRole {

    @Id
    public String id;

    public String get_id() { return id; }

    public String user_role_name;

    public String getUser_role_name() { return user_role_name; }

    public String role_id;

    public String getRole_id() { return role_id; }

    public String role_name;

    public String getRole_name() { return role_name; }
}

package com.FarmBack.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user_sessions")
public class UserSession {

    @Id
    @GeneratedValue(generator = "uuid2")
    public UUID id;

    public UUID get_id() { return id; }

    public String user_id;

    public String getUser_id() { return user_id; }

    public long expire_date;

    public long getExpire_date() {
        return expire_date;
    }

    public Integer is_closed;

    public Integer getIs_closed() {
        return is_closed;
    }

    public String session_token;

    public String getSession_token() {
        return session_token;
    }
}

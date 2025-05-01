package com.FarmBack.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    public String id;

    public String getId() {return id;}

    public String utility_type;

    public String getUtility_type() { return utility_type; }

    public String utility_state;

    public String getUtility_state() {
        return utility_state;
    }

    public String utility_failure_reason;

    public String getUtility_failure_reason() {
        return utility_failure_reason;
    }
}
package com.FarmBack.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "buildings")
public class Building {

    @Id
    public String id;

    public String getId() {return id;}

    public String building_type;

    public String getB_type() { return building_type; }

    public String building_state;

    public String getBuilding_state() {
        return building_state;
    }

}

package com.FarmBack.Repositories;

import com.FarmBack.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Animal, Long> {

}
package com.FarmBack.Repositories;

import com.FarmBack.Model.UserSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSessionsRepository extends JpaRepository<UserSession, Long> {

}

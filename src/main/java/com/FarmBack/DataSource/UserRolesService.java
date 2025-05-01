package com.FarmBack.DataSource;

import com.FarmBack.Model.UserRole;
import com.FarmBack.Repositories.UserRolesRepository;
import com.FarmBack.Repositories.UserSessionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRolesService {
    private final UserRolesRepository userRolesRepository;

    public UserRolesService(UserRolesRepository userRolesRepository) {
        this.userRolesRepository = userRolesRepository;
    }

    public List<UserRole> GetUserRoles() {
        return this.userRolesRepository.findAll();
    }
}

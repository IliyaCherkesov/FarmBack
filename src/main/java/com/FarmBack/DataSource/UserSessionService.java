package com.FarmBack.DataSource;


import com.FarmBack.Model.User;
import com.FarmBack.Model.UserSession;
import com.FarmBack.Repositories.UserSessionsRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserSessionService {
    private final UserSessionsRepository userSessionsRepository;

    public UserSessionService(UserSessionsRepository userSessionsRepository) {
        this.userSessionsRepository = userSessionsRepository;
    }

    public UserSession CreateUserSession(User user) {
        UserSession userSession = new UserSession();
        userSession.user_id = user.getId();
        userSession.expire_date = new Date().getTime() + 3600;
        userSession.is_closed = 0;
        userSession.session_token = "oretertroo";
        this.userSessionsRepository.save(userSession);
        return userSession;
    }

}

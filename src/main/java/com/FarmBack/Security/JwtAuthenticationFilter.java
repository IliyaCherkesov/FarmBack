package com.FarmBack.Security;

import com.FarmBack.DataSource.UserSessionService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    public JwtAuthenticationFilter(UserSessionService userSessionService) {

    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String header = request.getHeader("Authorization");

        if (header != null && header.startsWith("Bearer ")) {
            String token = header.substring(7); // Вырезаем "Bearer "

            // Здесь твоя проверка токена:
            if (validateToken(token)) {
                // Если токен валидный, установить авторизацию:
                UsernamePasswordAuthenticationToken auth = createAuthenticationFromToken(token);
                auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(auth); //Security context
            }
        }

        filterChain.doFilter(request, response);
    }

    private boolean validateToken(String token) {
        // Здесь твоя логика проверки токена
        return true;
    }

    private UsernamePasswordAuthenticationToken createAuthenticationFromToken(String token) {
        // Здесь создаешь объект Authentication
        return new UsernamePasswordAuthenticationToken(token, null, null);
    }
}

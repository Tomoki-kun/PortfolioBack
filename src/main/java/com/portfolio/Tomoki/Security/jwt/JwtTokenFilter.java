package com.portfolio.Tomoki.Security.jwt;

import com.portfolio.Tomoki.Security.Service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

public class JwtTokenFilter extends OncePerRequestFilter {

    private final static Logger logger = LoggerFactory.getLogger(JwtTokenFilter.class);

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private UserDetailsServiceImpl userDetailsServiceImpl;

    @Override
    protected void doFilterInternal(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.FilterChain filterChain) throws javax.servlet.ServletException, IOException {
        try {
            String token = getToken(request);
            if (token != null && jwtProvider.validateToken(token)) {
                String nombreUsuario = jwtProvider.getNombreUsuarioFromToken(token);
                UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(nombreUsuario);
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails,
                        null, userDetails.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        } catch (Exception e) {
            logger.error("Fallo el método doFilterInternal");
        }
        filterChain.doFilter(request, response);
    }
    
    private String getToken(HttpServletRequest request)
    {
        String header = request.getHeader("Authorization");
        if(header != null && header.startsWith("Bearer"))
            return header.replace("Bearer", "");
        return null;
    }
}

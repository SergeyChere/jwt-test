package com.example.demo;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.Map;
import java.util.function.Function;

public interface JwtUtilService {
    Boolean validateToken(String token, UserDetails userDetails);
    String createToken(Map<String, Object> claims, String subject);
    String generateToken(UserDetails userDetails);
    Boolean isTokenExpired(String token);
    Claims extractAllClaims(String token);
    <T> T extractClaims(String token, Function<Claims, T> claimsResolver);
    Date extractExpiration(String token);
    String extractUsername(String token);
}

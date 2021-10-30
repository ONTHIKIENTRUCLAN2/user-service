package com.example.user.service;

import com.example.user.entity.Token;
import com.example.user.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Autowired
    private TokenRepository tokenRepository;
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }
}

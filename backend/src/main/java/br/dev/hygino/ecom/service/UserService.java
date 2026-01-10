package br.dev.hygino.ecom.service;

import org.springframework.stereotype.Service;

import br.dev.hygino.ecom.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
   // private final UserMapper userMapper;
}

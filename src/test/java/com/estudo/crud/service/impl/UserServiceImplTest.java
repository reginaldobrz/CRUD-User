package com.estudo.crud.service.impl;

import com.estudo.crud.dto.UserDTO;
import com.estudo.crud.entity.User;
import com.estudo.crud.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    private UserRepository repository;
    private ModelMapper modelMapper;
    private UserServiceImpl service;

    @BeforeEach
    void setUp() {
        repository = mock(UserRepository.class);
        modelMapper = new ModelMapper();
        service = new UserServiceImpl(repository, modelMapper);
    }

    @Test
    void shouldCreateUserSuccessfully() {
        UserDTO dto = new UserDTO();
        dto.setName("John");
        dto.setEmail("john@example.com");
        dto.setPassword("123456");

        when(repository.save(any(User.class))).thenAnswer(invocation -> invocation.getArgument(0));

        UserDTO result = service.create(dto);
        assertEquals("John", result.getName());
    }
}
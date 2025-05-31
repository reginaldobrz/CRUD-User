package com.estudo.crud.service;

import com.estudo.crud.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO create(UserDTO dto);
    List<UserDTO> findAll();
    UserDTO findById(Long id);
    void delete(Long id);
}

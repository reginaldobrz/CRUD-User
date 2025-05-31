package com.estudo.crud.service.impl;

import com.estudo.crud.dto.UserDTO;
import com.estudo.crud.entity.User;
import com.estudo.crud.repository.UserRepository;
import com.estudo.crud.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public UserDTO create(UserDTO dto) {
        var entity = modelMapper.map(dto, User.class);
        return modelMapper.map(repository.save(entity), UserDTO.class);
    }

    @Override
    public List<UserDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO findById(Long id) {
        return repository.findById(id)
                .map(user -> modelMapper.map(user, UserDTO.class))
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

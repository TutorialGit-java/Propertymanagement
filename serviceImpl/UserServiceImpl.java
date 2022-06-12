package com.mycompany.propertymanagement.serviceImpl;

import com.mycompany.propertymanagement.converter.UserCOnvertor;
import com.mycompany.propertymanagement.dto.UserDTO;
import com.mycompany.propertymanagement.entity.UserEntity;
import com.mycompany.propertymanagement.repository.UserRepository;
import com.mycompany.propertymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserCOnvertor userCOnvertor;

    @Override
    public UserDTO rigister(UserDTO userDTO) {
        {
            Optional<UserEntity>use=userRepository.findByEmail(userDTO.getEmail());
            if(use.isPresent())
            {

            }
        }
        return null;
    }

    @Override
    public UserDTO userLOgin(String email, String password) {
        return null;
    }

    @Override
    public UserDTO userLogin(String email, String password) {
        return null;
    }
}

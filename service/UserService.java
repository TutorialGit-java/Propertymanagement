package com.mycompany.propertymanagement.service;

import com.mycompany.propertymanagement.dto.UserDTO;

public interface UserService {
    UserDTO rigister(UserDTO userDTO);
    UserDTO userLOgin(String email,String password);

    UserDTO userLogin(String email, String password);
}

package com.tundeadetunji.multipurpose.services;

import com.tundeadetunji.multipurpose.models.User;
import com.tundeadetunji.multipurpose.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired private UsersRepository repo;

    public List<User> listAllUsers(){
        return (List<User>) repo.findAll();
    }
}


















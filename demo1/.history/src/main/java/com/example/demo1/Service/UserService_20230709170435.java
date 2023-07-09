package com.example.demo1.Service;

import com.example.demo1.model.User;
import com.example.demo1.Repositories.UserRepositories;
import com.example.demo1.Exception.IdAlreadyTakenException;

import javax.transaction.Transactional;
import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.DatatypeConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{ 
    @Autowired UserRepositories userRepositories;
    public User getUserById(Loing id) { return userRepositories.findById(id).orElse(null); }

    public void deleteUserById(Long id) { userRepositories.deleteById(id); }

    public User updateUser(User user) { return userRepositories.save(user); }

    public List<User> searchUsers(Long id) { return userRepositories.searchUsers(id); }

    public User insertUser(User user){
        if (userRepositories.findById(user.getId()).isPresent())
        { throw new IdAlreadyTakenException("error 203");} 
        return userRepositories.save(user);
    }


}    
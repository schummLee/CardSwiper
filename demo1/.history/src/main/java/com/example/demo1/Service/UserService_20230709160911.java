package com.example.demo1.Service;

import com.educative.ecommerce.model.User;
import com.educative.ecommerce.Repositories.UserRepositories;

import javax.transaction.Transactional;
import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.DatatypeConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

public class UserService{ 
    @Autowired UserRepositories userRepositories;
    public User getUserById(Loing id) { return userRepositories.findById(id).orElse(null); }

    public void deleteUserById(Long id) { userRepository.deleteById(id); }

    public User updateUser(User user) { return userRepository.save(user); }

    public List<User> searchUsers(String keyword) { return userRepository.searchUsers(keyword); }

    
}    
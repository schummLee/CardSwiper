package com.example.demo1.Service;

import com.educative.ecommerce.model.User;
import com.educative.ecommerce.Repositories.UserRepositories;

import javax.transaction.Transactional;
import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.DatatypeConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User insertUser(User user) {
        if (userRepository.findById(user.getId()).isPresent()) {
            throw new IdAlreadyTakenException("Id " + user.getId() + " is already taken");
        }
        return userRepository.save(user);
    }
}


public class UserService{ 
    @Autowired UserRepositories userRepositories;
    public User getUserById(Loing id) { return userRepositories.findById(id).orElse(null); }

    public void deleteUserById(Long id) { userRepository.deleteById(id); }

    public User updateUser(User user) { return userRepository.save(user); }

    public List<User> searchUsers(Long id) { return userRepository.searchUsers(id); }

    public User insertUser(Long id ,String name ,Long cardId){
        if (userRepository.findById(user.getId()).isPresent()){ return userRepository.save(user);} 
        return userRepositories.insertUsers(id);
    }


}    
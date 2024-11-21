//package com.example.swing_trading_backend.service;
//
//import com.example.swing_trading_backend.dto.LoginRequest;
//import com.example.swing_trading_backend.entity.User;
//import com.example.swing_trading_backend.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    @Autowired  //inject the UserService dependency automatically.
//    private UserRepository userRepository;
//    User user = new User();
//
//    public void saveUser(LoginRequest loginRequest) {
////        User user = new User();
//        user.setEmail(loginRequest.getEmail());   //Sets the password field of the User entity with the password from loginRequest.
//        user.setPassword(loginRequest.getPassword()); // You may want to hash the password here before saving
//        userRepository.save(user);
//    }
//
////    public void updateUserCount(Integer count) {
////        user.setCount(count);
//////        userRepository.save();
////    }
//
//    public boolean validateUser(LoginRequest loginRequest) {
//        // Validate user credentials
//            String storedPassword = userDatabase.get(loginRequest.getEmail());
//            return storedPassword != null && storedPassword.equals(loginRequest.getPassword());
//    }
//}

package com.example.swing_trading_backend.service;

import com.example.swing_trading_backend.entity.User;
import com.example.swing_trading_backend.dto.LoginRequest;
import com.example.swing_trading_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Save user to the database
    public void saveUser(LoginRequest loginRequest) {
        User user = new User();
        user.setEmail(loginRequest.getEmail());
        user.setPassword(loginRequest.getPassword()); // Note: In real applications, hash the password
        userRepository.save(user);
    }

    // Validate user credentials
    public boolean validateUser(LoginRequest loginRequest) {
        User user = userRepository.findByEmail(loginRequest.getEmail());
        if (user != null) {
            return user.getPassword().equals(loginRequest.getPassword()); // Compare passwords (hash comparison in real apps)
        }
        return false;
    }}

//    public Long getUserIdByUsername(String username) {
//        // Query the database to find the user's ID
//        User user = userRepository.findByUsername(username);
//        if (user != null) {
//            return user.getId();
//        }
//        //throw new UsernameNotFoundException("User not found");
//
//
//}

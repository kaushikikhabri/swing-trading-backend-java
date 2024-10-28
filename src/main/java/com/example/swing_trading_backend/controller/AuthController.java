//package com.example.swing_trading_backend.controller;
//
//import com.example.swing_trading_backend.service.GoogleTokenVerifier;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Map;
//
//@RestController
//public class AuthController {
//
//    @PostMapping("/api/auth/google")
//    public ResponseEntity<String> authenticateWithGoogle(@RequestBody Map<String, String> payload) {
//        String token = payload.get("token");
//
//        if (GoogleTokenVerifier.verifyToken(token)) {
//            return ResponseEntity.ok("Token is valid");
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
//        }
//    }
//}

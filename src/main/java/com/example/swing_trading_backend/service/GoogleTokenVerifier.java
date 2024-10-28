//package com.example.swing_trading_backend.service;
//
//import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
//import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.json.jackson2.JacksonFactory;
//
//import java.util.Collections;
//
//public class GoogleTokenVerifier {
//
//    public static boolean verifyToken(String token) {
//        try {
//            GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(
//                    GoogleNetHttpTransport.newTrustedTransport(),
//                    JacksonFactory.getDefaultInstance()
//            ).setAudience(Collections.singletonList("YOUR_GOOGLE_CLIENT_ID"))
//                    .build();
//
//            GoogleIdToken idToken = verifier.verify(token);
//            return idToken != null;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//}

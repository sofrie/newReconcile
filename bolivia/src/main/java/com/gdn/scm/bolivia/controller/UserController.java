/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdn.scm.bolivia.controller;

import com.gdn.scm.bolivia.entity.Role;
import com.gdn.scm.bolivia.entity.User;
import com.gdn.scm.bolivia.request.UserRequest;
import com.gdn.scm.bolivia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
/**
 *
 * @author sofrie.zumaytis
 */

public class UserController {

//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private TokenStore tokenStore;
//
//    
//    @CrossOrigin
//    @PostMapping(value = "/login")
//    public String login(@RequestBody UserRequest user){
//        
//
//        return "User created";
//    }
//    
//
//    @CrossOrigin
//    @PostMapping(value = "/register")
//    public String register(@RequestBody UserRequest userRegistration){
//        if(!userRegistration.getPassword().equals(userRegistration.getPasswordConfirmation()))
//            return "Error the two passwords do not match";
//        else if(userService.getUser(userRegistration.getUsername()) != null)
//            return "Error this username already exists";
//
//        //Checking for non alphanumerical characters in the username.
//        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
//        if(pattern.matcher(userRegistration.getUsername()).find())
//            return "No special characters are allowed in the username";
//
////        userService.addUser(new User(userRegistration.getUsername(), userRegistration.getPassword(), Arrays.asList(new Role("USER"), new Role("ACTUATOR"))));
//        return "User created";
//    }
//
//    @CrossOrigin
//    @GetMapping(value = "/users")
//    public List<User> users(){
//        return userService.getAllUsers();
//    }
//
//    @CrossOrigin
//    @GetMapping(value = "/logouts")
//    public void logout(@RequestParam (value = "access_token") String accessToken){
//        tokenStore.removeAccessToken(tokenStore.readAccessToken(accessToken));
//    }
//
//    @CrossOrigin
//    @GetMapping(value ="/getUsername")
//    public String getUsername(){
//        return SecurityContextHolder.getContext().getAuthentication().getName();
//    }

}

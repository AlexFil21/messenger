package com.messenger.revolution.controllers;

import com.messenger.revolution.data.dto.UserDTO;
import com.messenger.revolution.data.entities.User;
import com.messenger.revolution.data.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity<UserDTO> user(@RequestBody User user){
        UserDTO dto = userService.newUser(user);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public  ResponseEntity<UserDTO> user(@AuthenticationPrincipal UserDetails userDetails){
        List<UserDTO> dto = userService.users();
        return new ResponseEntity(dto, HttpStatus.OK);
    }


}

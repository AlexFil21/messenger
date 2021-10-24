package com.messenger.revolution.data.services;

import com.messenger.revolution.data.dto.UserDTO;
import com.messenger.revolution.data.entities.User;
import com.messenger.revolution.data.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    public List<UserDTO> users(){
        return userRepo.findAllUsers().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public UserDTO newUser(User user){
        userRepo.save(user);
        return convertToDTO(user);
    }

    public UserDTO convertToDTO(User user){
            return new UserDTO(
                    user.getId(), user.getPhone(), user.getEmail(), user.getPassword(),
                    user.getFirstName(), user.getLastName(), user.getMiddleName(),
                    user.getIsActive(), user.getIsReported(), user.getIsBlocked(),
                    user.getPreferences(), user.getCreatedAt(), user.getUpdatedAt()
            );
    }

    public User getByLogin(String firstName) {
        return userRepo.findByUserName(firstName);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User u = getByLogin(s);
        if (Objects.isNull(u)) {
            throw new UsernameNotFoundException(String.format("User %s is not found", s));
        }

       return new org.springframework.security.core.userdetails.User(u.getFirstName(), u.getPassword(), new HashSet<>());
    }
}

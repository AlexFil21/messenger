package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    @Query(value = "select * from users", nativeQuery = true)
    List<User> findAllUsers();

    @Query("select u from User u where u.firstName=:name")
    User findByUserName(String name);
}

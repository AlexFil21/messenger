package com.messenger.data.repository;

import com.messenger.data.entities.UserContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserContactRepo extends CrudRepository<UserContact, Long> {
}

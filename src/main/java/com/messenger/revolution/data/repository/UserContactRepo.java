package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.UserContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserContactRepo extends CrudRepository<UserContact, Long> {
}

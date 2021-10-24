package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.UserVerification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserVerificationRepo extends CrudRepository<UserVerification, Long> {
}

package com.messenger.data.repository;

import com.messenger.data.entities.UserVerification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserVerificationRepo extends CrudRepository<UserVerification, Long> {
}

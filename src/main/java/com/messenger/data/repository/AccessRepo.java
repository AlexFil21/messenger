package com.messenger.data.repository;

import com.messenger.data.entities.Access;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRepo extends CrudRepository<Access, Long> {
}

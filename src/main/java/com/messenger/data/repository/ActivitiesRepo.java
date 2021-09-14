package com.messenger.data.repository;

import com.messenger.data.entities.Activities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivitiesRepo extends CrudRepository<Activities, Long> {
}

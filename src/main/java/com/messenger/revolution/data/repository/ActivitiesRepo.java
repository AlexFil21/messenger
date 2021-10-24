package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.Activities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivitiesRepo extends CrudRepository<Activities, Long> {
}

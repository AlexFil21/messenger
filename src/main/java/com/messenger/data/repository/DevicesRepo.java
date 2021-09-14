package com.messenger.data.repository;

import com.messenger.data.entities.Devices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicesRepo extends CrudRepository<Devices, Long> {
}

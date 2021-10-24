package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.Device;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicesRepo extends CrudRepository<Device, Long> {
}

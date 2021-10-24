package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.BlockList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockListRepo extends CrudRepository<BlockList, Long> {
}

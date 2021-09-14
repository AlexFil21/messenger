package com.messenger.data.repository;

import com.messenger.data.entities.BlockList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockListRepo extends CrudRepository<BlockList, Long> {
}

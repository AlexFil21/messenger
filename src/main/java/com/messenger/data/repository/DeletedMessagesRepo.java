package com.messenger.data.repository;

import com.messenger.data.entities.DeletedMessages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeletedMessagesRepo extends CrudRepository<DeletedMessages, Long> {
}

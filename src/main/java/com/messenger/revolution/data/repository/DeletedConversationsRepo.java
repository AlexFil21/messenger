package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.DeletedConversations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeletedConversationsRepo extends CrudRepository<DeletedConversations, Long> {
}

package com.messenger.data.repository;

import com.messenger.data.entities.Conversation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversationRepo  extends CrudRepository<Conversation, Long> {
}

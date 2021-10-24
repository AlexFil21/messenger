package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.Conversation;
import com.messenger.revolution.data.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConversationRepo  extends CrudRepository<Conversation, Long> {

    @Query("select c from Conversation c where c.id =:id")
    Conversation findConversationById(Long id);

    @Query(value="select * from conversation", nativeQuery=true)
    List<Conversation> findAllConversations();

    @Query("from Conversation conversation where conversation.creatorId.id=:id")
    List<Conversation> findByUserId(Long id);
}

package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepo extends CrudRepository<Message, Long> {

    @Query(value="select * from messages", nativeQuery=true)
    List<Message> getAllMessages();

}

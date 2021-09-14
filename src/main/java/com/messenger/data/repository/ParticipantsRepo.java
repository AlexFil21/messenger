package com.messenger.data.repository;

import com.messenger.data.entities.Participants;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantsRepo extends CrudRepository<Participants, Long> {
}

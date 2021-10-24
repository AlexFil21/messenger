package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.Attachments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttachmentsRepo extends CrudRepository<Attachments, Long> {
}

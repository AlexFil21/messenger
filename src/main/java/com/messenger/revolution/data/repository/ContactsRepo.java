package com.messenger.revolution.data.repository;

import com.messenger.revolution.data.entities.Contacts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepo extends CrudRepository<Contacts, Long> {
}

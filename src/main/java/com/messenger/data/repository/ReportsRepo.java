package com.messenger.data.repository;

import com.messenger.data.entities.Reports;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsRepo extends CrudRepository<Reports, Long> {
}

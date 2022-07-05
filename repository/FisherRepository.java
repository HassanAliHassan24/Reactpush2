package com.cruddapplication.crud.repository;

import com.cruddapplication.crud.model.Fisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FisherRepository extends JpaRepository<Fisher, Long> {
}

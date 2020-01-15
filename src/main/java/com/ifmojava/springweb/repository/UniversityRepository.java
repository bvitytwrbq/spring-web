package com.ifmojava.springweb.repository;

import com.ifmojava.springweb.entity.University;
import org.springframework.data.repository.CrudRepository;

public interface UniversityRepository
        extends CrudRepository<University, Integer> {
}

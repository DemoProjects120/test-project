package com.rootnext.testproject.repositories;

import com.rootnext.testproject.domains.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sanjoy on 7/29/15.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
}

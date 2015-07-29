package com.rootnext.testproject.repositories;

import com.rootnext.testproject.domains.Company;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by sanjoy on 7/29/15.
 */

public interface CompanyRepository extends CrudRepository<Company, Long> {
}

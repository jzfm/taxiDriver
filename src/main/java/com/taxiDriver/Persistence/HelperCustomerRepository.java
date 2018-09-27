package com.taxiDriver.Persistence;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create,Read,Update,Delete

import com.taxiDriver.Domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

interface HelperCustomerRepository extends CrudRepository<Customer,Integer> {

    @Transactional
    void deleteByEmail(String email);

    boolean existsByEmail(String email);
}

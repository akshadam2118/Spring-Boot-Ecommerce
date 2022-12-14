package org.ecommerce.repository;
import org.ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Address extends JpaRepository<Address, Integer> {

}


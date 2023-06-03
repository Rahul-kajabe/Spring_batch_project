package in.rahul.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahul.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}

/**
 * 
 */
package net.practicehabits.springjpah2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author tuyen
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	List<Customer> findByLastName(String lastName);
	
	Customer findById(long id);
}

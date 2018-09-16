/**
 * 
 */
package time_sheet.repositories;

import org.springframework.data.repository.CrudRepository;

import time_sheet.entities.Employee;

/**
 * @author binh9
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	Iterable <Employee>fillAll();
	Employee findOne(Integer iD);
}

package in.bala.employee.springbootcrudangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bala.employee.springbootcrudangular.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

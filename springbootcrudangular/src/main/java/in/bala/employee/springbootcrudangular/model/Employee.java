package in.bala.employee.springbootcrudangular.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//JPA Annotations

@Entity
@Table(name="employees")
public class Employee {
	
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="dept_name")
	private String deptName;
	
	@Column(name="email_id")
	private String emailId;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(long id, String firstName, String deptName, String emailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.deptName = deptName;
		this.emailId = emailId;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}

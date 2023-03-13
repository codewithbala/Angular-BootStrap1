package in.bala.employee.springbootcrudangular.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	//create a custom exception that triggers when a resource is not found
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
}

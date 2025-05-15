package com.tyss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyss.entity.Employee;
import com.tyss.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(Application.class, args);
		
		EmployeeService service = app.getBean(EmployeeService.class);
		
		//To save Employee
		Employee emp = new Employee("Tony Stark", "Tony@gamil.com", 70000d);
		
		emp.setEid(5);
		
		Employee savedEmp = service.saveEmp(emp);
		System.out.println("Employee is saved");
		System.out.println(savedEmp);
		
		
	}

}

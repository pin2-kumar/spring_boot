package com.firstapp.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstapp.Dto.EmployeeDto;
import com.firstapp.addressRepository.AddressRepository;
import com.firstapp.controller.entity.Address;

import com.firstapp.controller.entity.Employee;
import com.firstapp.repository.EmployeeRepository;
import com.firstapp.utils.EmailSender;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressRepository;
    
    @Autowired
    private EmailSender emailSender;
    
    
    

    public void saveEmployeeDetails(EmployeeDto employeeDto) {
        Employee emp = new Employee();
        BeanUtils.copyProperties(employeeDto, emp, "id");
//
//        System.out.println(emp.getFirstname());
//        System.out.println(emp.getLastname());
//        System.out.println(emp.getEmail());
//        System.out.println(emp.getMobile());

        Address address = new Address();
        BeanUtils.copyProperties(employeeDto, address);

//        System.out.println(address.getCity());
//        System.out.println(address.getState());
//        System.out.println(address.getPinCode());
//        System.out.println(address.getAddressLine());

        employeeRepository.save(emp);
        addressRepository.save(address);
    }

	public void register(String firstname, String lastname, String email, String mobile) {
	 
		Employee emp = new Employee();
		emp.setFirstname(firstname);
		emp.setLastname(lastname);
		emp.setEmail(email);
		emp.setMobile(mobile);
		employeeRepository.save(emp);
		
		
	}

	public List<Employee> getRegistrations() {
	    List<Employee> employee = employeeRepository.findAll();
	    return employee;
	}

	

	public void deleteRegistrationById(long id) {
		employeeRepository.deleteById(id);
		
		
	}

	public Employee getRegistrationById(long id) {
		Optional<Employee> employee=employeeRepository.findById(id);
		return employee.get();
	}

	public Employee updateRegistrationById(EmployeeDto employeeDto) {
		Employee emp = new Employee();
		
		BeanUtils.copyProperties(employeeDto,emp);
		employeeRepository.save(emp);
		
		return null;
	}
	
}


























package com.firstapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.firstapp.Dto.EmployeeDto;
import com.firstapp.controller.entity.Employee;
import com.firstapp.repository.EmployeeRepository;
import com.firstapp.sevice.EmployeeService;
import com.firstapp.utils.EmailSender;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmailSender emailSender;
	
	//Handler Methods - 
	@RequestMapping("/view")
		public String viewRegisterPage() {
			return "registration";//--> RequestDispatcher
		}
		
//		@RequestMapping("/saveReg")
//		public String getRegistrationData(Employee employee, Model model) {
//			employeeService.saveEmployeeditail(employee);
//			model.addAttribute("msg", "Record is saved");
//			return "registration";
//		}
	
	
	 @PostMapping("/saveReg")
	    public String getRegistrationData(@ModelAttribute EmployeeDto employeeDto, Model model){
		 try {
		        employeeService.saveEmployeeDetails(employeeDto);
		        
		        
		        emailSender.sendEmail(employeeDto.getEmail(), "Welcome!", "Thanks for registering with us.");
		        
		        model.addAttribute("msg", "Record is saved in database");
		    } catch (Exception e) {
		    	 e.printStackTrace();
		    	 
		       
		       
		    }
		    return "registration";
	    }
	 
	 @RequestMapping("/saveRegistration")
	 public  String getDataUsingRequestParam(
		 
		 @RequestParam String firstname,
		 @RequestParam String lastname ,
		 @RequestParam String email,
		 @RequestParam String mobile
		 ) {
//		 System.out.println(firstname);
//		 System.out.println(lastname);
//		 System.out.println(email);
//		 System.out.println(mobile);
		 
		 employeeService.register( firstname, lastname, email,mobile);
		 return "employee";
	 } 
		//Handler Methods - http://localhost:8080/viewRegistration
			@RequestMapping("/viewRegistration")
			public String viewRegister() {
				return "employee";//--> RequestDispatcher
			}
			

			//Handler Methods - http://localhost:8080/listRegistrations
				@RequestMapping("/listRegistrations")
				public String viewRegistrations(ModelMap model) {
					List<Employee> employees = employeeService.getRegistrations();
					model.addAttribute("employees",employees);
					return "list_registrations";//--> RequestDispatcher
				}
		
				
				@RequestMapping("/deleteRegistration")
				public String deleteRegistrationById(@RequestParam  long id, ModelMap model) {
					employeeService.deleteRegistrationById(id);
					List<Employee>employees = employeeService.getRegistrations();
					model.addAttribute("employees", employees); 

					return "list_registrations";				
					
				}
				@RequestMapping("/getRegistrationById")
				public String getRegistrationById(@RequestParam long id , ModelMap model) {
					Employee employee = employeeService.getRegistrationById(id);
					return "Update_registration"; 
				}
				
				
				@RequestMapping("/updateReg")
				public String UpdateRegistrationById(@ModelAttribute EmployeeDto employeeDto ,ModelMap model) {
					employeeService.saveEmployeeDetails(employeeDto); 
				    List<Employee> employees = employeeService.getRegistrations();
				    model.addAttribute("employees", employees);
				    return "list_registrations";
				}
				
				
	}































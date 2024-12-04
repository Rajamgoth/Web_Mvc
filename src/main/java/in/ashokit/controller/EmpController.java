package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmployeeService;

@Controller
public class EmpController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employee")
	public ModelAndView getEmployee() {
		ModelAndView mav=new ModelAndView();
		List<Employee> employee=service.getAllEmployee();
		mav.addObject("msg",employee);
		mav.setViewName("employeeView");
		
		return mav;
	}

}

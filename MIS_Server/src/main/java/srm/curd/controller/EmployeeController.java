package srm.curd.controller;


import java.time.LocalDate;
import java.util.List;

import javax.print.attribute.standard.MediaSize.ISO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import srm.curd.dto.Employeedto;
import srm.curd.model.Department;
import srm.curd.model.Employee;
import srm.curd.model.EmployeeServ;
import srm.curd.model.Login_model;
import srm.curd.model.Project;
import srm.curd.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/users")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	private Employee employee;

	/*** Creating a new Student ***/
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Employee create(@RequestBody Employee employee) {
		return employeeServiceImpl.create(employee);
	}

	/*** Retrieve a single Student ***/
	@RequestMapping(value = "/getby/{id}", produces = "application/json", method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") long id) {
		Employee employee = employeeServiceImpl.getEmployeeById(id);
		return employee;
	}

	/*** Retrieve all Parents ***/
	@RequestMapping(value = "/getall", produces = "application/json", method = RequestMethod.GET)
	public List getAllEmployees() {
		List employeeList = employeeServiceImpl.getAllEmployees();
		return employeeList;
	}

	/*** Update a Student ***/
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeServiceImpl.updateEmployee(employee);
	}

	/*** Delete a Student ***/
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")

	public void deleteEmployee(@PathVariable("id") long id) {

		employeeServiceImpl.deleteEmployee(id);

	}

	/*** Creating a new Student ***/
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getEmployeeBylogin(@RequestBody Login_model employee) {

		//System.out.println("uname : " + employee.getUsername());
		//System.out.println("password : " + employee.getPassword());
		String employees = employeeServiceImpl.getEmployeeBylogin(employee);

		//System.out.println("In controller: " + employees);
		return employees;
	}
	
	
	//Project
	/*** Creating a new Student ***/
	@RequestMapping(value = "/procreate", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Project create(@RequestBody Project employee) {
		return employeeServiceImpl.procreate(employee);
	}

	/*** Retrieve a single Student ***/
	@RequestMapping(value = "/proemployee/{projectid}", produces = "application/json", method = RequestMethod.GET)
	public Project getProjectById(@PathVariable("projectid") String projectid) {
		Project employee = employeeServiceImpl.progetProjectById(projectid);
		return employee;
	}

	/*** Retrieve all Parents ***/
	@RequestMapping(value = "/proemployees", produces = "application/json", method = RequestMethod.GET)
	public List getAllProjects() {
		List employeeList = employeeServiceImpl.progetAllProjects();
		return employeeList;
	}

	/*** Update a Student ***/
	@RequestMapping(value = "/proupdate", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public void updateProject(@RequestBody Project employee) {
		employeeServiceImpl.proupdateProject(employee);
	}

	/*** Delete a Student ***/
	@RequestMapping(value = "/prodelete/{projectid}", method = RequestMethod.DELETE, produces = "application/json")
	
	public void deleteProject(@PathVariable("projectid") String projectid) {
		
		employeeServiceImpl.prodeleteProject(projectid);
		
	}
	
	//Department
	/*** Creating a new Student ***/
	@RequestMapping(value = "/deptcreate", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Department deptcreate(@RequestBody Department employee) {
		return employeeServiceImpl.deptcreate(employee);
	}

	/*** Retrieve a single Student ***/
	@RequestMapping(value = "/deptemployee/{deptid}", produces = "application/json", method = RequestMethod.GET)
	public Department deptgetDepartmentById(@PathVariable("deptid") String deptid) {
		Department employee = employeeServiceImpl.deptgetDepartmentById(deptid);
		return employee;
	}

	/*** Retrieve all Parents ***/
	@RequestMapping(value = "/deptemployees", produces = "application/json", method = RequestMethod.GET)
	public List deptgetAllEmployees() {
		List employeeList = employeeServiceImpl.deptgetAllDepartments();
		return employeeList;
	}

	/*** Update a Student ***/
	@RequestMapping(value = "/deptupdate", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public void deptupdateDepartment(@RequestBody Department employee) {
		employeeServiceImpl.deptupdateDepartment(employee);
	}

	/*** Delete a Student ***/
	@RequestMapping(value = "/deptdelete/{deptid}", method = RequestMethod.DELETE, produces = "application/json")
	
	public void deptdeleteEmployee(@PathVariable("deptid") String deptid) {
		
		employeeServiceImpl.deptdeleteDepartment(deptid);
		
	}
	

	
	//Employee
	/*** Creating a new Student ***/
	@RequestMapping(value = "/empcreate", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public EmployeeServ empcreate(@RequestBody EmployeeServ employee) {
		return employeeServiceImpl.empcreate(employee);
	}

	/*** Retrieve a single Student ***/
	@RequestMapping(value = "/empemployee/{emplId}", produces = "application/json", method = RequestMethod.GET)
	public EmployeeServ empgetEmployeeById(@PathVariable("emplId") String emplId) {
		EmployeeServ employee = employeeServiceImpl.empgetEmployeeById(emplId);
		return employee;
	}

	/*** Retrieve all Parents ***/
	@RequestMapping(value = "/empemployees", produces = "application/json", method = RequestMethod.GET)
	public List empgetAllEmployees() {
		List employeeList = employeeServiceImpl.empgetAllEmployees();
		return employeeList;
	}

	/*** Update a Student ***/
	@RequestMapping(value = "/empupdate", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public void empupdateEmployee(@RequestBody EmployeeServ employee) {
		employeeServiceImpl.empupdateEmployee(employee);
	}

	/*** Delete a Student ***/
	@RequestMapping(value = "/empdelete/{emplId}", method = RequestMethod.DELETE, produces = "application/json")
	
	public void empdeleteEmployee(@PathVariable("emplId") String emplId) {
		
		employeeServiceImpl.empdeleteEmployee(emplId);
		
	}
	
	//Date Filter
	@Autowired
	EmployeeServiceImpl employeeServiceimpl;
	
	@RequestMapping(value = "/getbydate/{joineddate}", produces = "application/json", method = RequestMethod.GET)
	public List<Employeedto> getEmployeebydate(@PathVariable("joineddate") LocalDate joineddate) {
		System.out.println("getEmployeebydate");
		return employeeServiceimpl.getEmployeebydate(joineddate);
	}
	
	@RequestMapping(value = "/getbydate1/{resigneddate}", produces = "application/json", method = RequestMethod.GET)
	public List<Employeedto> getEmployeebydate1(@PathVariable("resigneddate") LocalDate resigneddate) {
		System.out.println("getEmployeebydate1");
		return employeeServiceimpl.getEmployeebydate1(resigneddate);
	}
	
	@RequestMapping(value = "/getactemp1", produces = "application/json", method = RequestMethod.GET)
	public List<Employeedto> getAllEmoployeeAct1() {
		System.out.println("getAllEmoployeeAct1");
		return employeeServiceimpl.getEmployeebyAct1();
	}
	
	@RequestMapping(value = "/getactemp2", produces = "application/json", method = RequestMethod.GET)
	public List<Employeedto> getAllEmoployeeAct2() {
		System.out.println("getAllEmoployeeAct2");
		return employeeServiceimpl.getEmployeebyAct2();
	}
}

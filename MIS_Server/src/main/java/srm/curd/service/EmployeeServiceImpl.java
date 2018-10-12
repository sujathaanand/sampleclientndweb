package srm.curd.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srm.curd.dao.EmployeeDao;
import srm.curd.dto.Employeedto;
import srm.curd.model.Department;
import srm.curd.model.Employee;
import srm.curd.model.EmployeeServ;
import srm.curd.model.Employeetable;
import srm.curd.model.Login_model;
import srm.curd.model.Project;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee create(Employee employee) {
		return employeeDao.create(employee);
	}

	@Transactional
	@Override
	public Employee getEmployeeById(long id) {
		return employeeDao.getEmployeeById(id);
	}

	@Transactional
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Transactional
	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	@Transactional
	@Override
	public void deleteEmployee(long id) {
		employeeDao.deleteEmployee(id);
	}

	@Override
	public String getEmployeeBylogin(Login_model employee) {
		// TODO Auto-generated method stub
		String status = employeeDao.getEmployeeBylogin(employee);
		// Employee loginDetails =
		// if (loginDetails != null) {
		// System.out.println("" + loginDetails.getRolename());
		// System.out.println("" + loginDetails.getUsername());
		// System.out.println("" + loginDetails.getPassword());
		//
		// status = loginDetails.getRolename();
		// return status;
		// }
		//
		// else {
		// status = "invalid login credentials";
		// System.out.println("invalid login credentials");
		// }

		// System.out.println("" +
		// employeeDao.getEmployeeBylogin(employee).getRolename());
		return status;

	}

	//Project
	@Override
	public Project procreate(Project employee) {
		return employeeDao.procreate(employee);		
	}
	@Transactional
	@Override
	public Project progetProjectById(String projectid) {
		return employeeDao.progetProjectById(projectid);
	}
	@Transactional
	@Override
	public List<Project> progetAllProjects() {
		return employeeDao.progetAllProjects();
	}
	@Transactional
	@Override
	public void proupdateProject(Project employee) {
		employeeDao.proupdateProject(employee);
	}
	@Transactional
	@Override
	public void prodeleteProject(String projectid) 
	{
		employeeDao.prodeleteProject(projectid);
	}

	//Department
	@Override
	public Department deptcreate(Department employee) {
		return employeeDao.deptcreate(employee);		
	}
	@Transactional
	@Override
	public Department deptgetDepartmentById(String deptid) {
		return employeeDao.deptgetDepartmentById(deptid);
	}
	@Transactional
	@Override
	public List<Department> deptgetAllDepartments() {
		return employeeDao.deptgetAllDepartments();
	}
	@Transactional
	@Override
	public void deptupdateDepartment(Department employee) {
		employeeDao.deptupdateDepartment(employee);
	}
	@Transactional
	@Override
	public void deptdeleteDepartment(String deptid) 
	{
		employeeDao.deptdeleteDepartment(deptid);
	}
	
	//Employee
	@Override
	public EmployeeServ empcreate(EmployeeServ employee) {
		return employeeDao.empcreate(employee);		
	}
	@Transactional
	@Override
	public EmployeeServ empgetEmployeeById(String emplId) {
		return employeeDao.empgetEmployeeById(emplId);
	}
	@Transactional
	@Override
	public List<EmployeeServ> empgetAllEmployees() {
		return employeeDao.empgetAllEmployees();
	}
	@Transactional
	@Override
	public void empupdateEmployee(EmployeeServ employee) {
		employeeDao.empupdateEmployee(employee);
	}
	@Transactional
	@Override
	public void empdeleteEmployee(String emplId) 
	{
		employeeDao.empdeleteEmployee(emplId);
	}
	
	//Date
	@Override
	public List<Employeedto> getEmployeebydate(LocalDate joineddate) {
		List<Employeedto> emplist = new ArrayList<Employeedto>();
		List<Employeetable> list = employeeDao.getEmployeebydate(joineddate);
		for (Employeetable employee : list) {
			Employeedto employeedto = Employeedto.convertToDTO(employee);
			emplist.add(employeedto);
		}
		return emplist;
	}
	
	@Override
	public List<Employeedto> getEmployeebydate1(LocalDate resigneddate) {
		List<Employeedto> emplist = new ArrayList<Employeedto>();
		List<Employeetable> list = employeeDao.getEmployeebydate1(resigneddate);
		for (Employeetable employee : list) {
			Employeedto employeedto = Employeedto.convertToDTO(employee);
			emplist.add(employeedto);
		}
		return emplist;
	}
	
	@Override
	public List<Employeedto> getEmployeebyAct1() {
		List<Employeedto> emplist = new ArrayList<Employeedto>();
		List<Employeetable> list = employeeDao.getEmployeebyAct1();
		for (Employeetable employee : list) {
			Employeedto employeedto = Employeedto.convertToDTO(employee);
			emplist.add(employeedto);
		}
		return emplist;
	}

	@Override
	public List<Employeedto> getEmployeebyAct2() {
		List<Employeedto> emplist = new ArrayList<Employeedto>();
		List<Employeetable> list = employeeDao.getEmployeebyAct2();
		for (Employeetable employee : list) {
			Employeedto employeedto = Employeedto.convertToDTO(employee);
			emplist.add(employeedto);
		}
		return emplist;
	}

}

package srm.curd.dao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import srm.curd.model.Department;
import srm.curd.model.Employee;
import srm.curd.model.EmployeeServ;
import srm.curd.model.Employeetable;
import srm.curd.model.Login_model;
import srm.curd.model.Project;

public interface EmployeeDao {

	public Employee create(Employee employee);

	public Employee getEmployeeById(long id);

	public List<Employee> getAllEmployees();

	public void updateEmployee(Employee employee);

	public void deleteEmployee(long id);

	public String getEmployeeBylogin(Login_model employee);

	/* public boolean checkLogin(String userName, String userPassword); */
	
	//Project
	public Project procreate(Project employee);

	public Project progetProjectById(String projectid);

	public List<Project> progetAllProjects();

	public void proupdateProject(Project employee);

	public void prodeleteProject(String projectid);

	//Department
	public Department deptcreate(Department employee);

	public Department deptgetDepartmentById(String deptid);

	public List<Department> deptgetAllDepartments();

	public void deptupdateDepartment(Department employee);

	public void deptdeleteDepartment(String deptid);
	
	
	//Employee
	public EmployeeServ empcreate(EmployeeServ employee);

	public EmployeeServ empgetEmployeeById(String emplId);

	public List<EmployeeServ> empgetAllEmployees();

	public void empupdateEmployee(EmployeeServ employee);

	public void empdeleteEmployee(String emplId);
	
	//Date
	public List<Employeetable> getEmployeebydate(LocalDate joineddate);
	  
	public List<Employeetable> getEmployeebydate1(LocalDate resigneddate); 
	
	public List<Employeetable> getEmployeebyAct1();
	
	public List<Employeetable> getEmployeebyAct2();

}

package srm.curd.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import srm.curd.model.Department;
import srm.curd.model.Employee;
import srm.curd.model.EmployeeServ;
import srm.curd.model.Employeetable;
import srm.curd.model.Login_model;
import srm.curd.model.Project;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	private EntityManager entityManager;
	// @Autowired
	// private SessionFactory sessionFactory;

	@Override
	public Employee create(Employee employee) {
		// entityManager.persist(parent);
		return entityManager.merge(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
		System.out.println("get employee");
		return entityManager.find(Employee.class, id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("all Employee");
		return entityManager.createQuery("select e from Employee e").getResultList();
	}

	@Override
	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);
	}

	@Override
	public void deleteEmployee(long id) {
		Employee e = entityManager.find(Employee.class, id);
		entityManager.remove(e);
	}

	@Override
	public String getEmployeeBylogin(Login_model employee) {
		System.out.println("employee: " + employee.getUsername());
		System.out.println("employee: " + employee.getPassword());

		String status = null;
		try {

			Query query1 = (Query) entityManager.createQuery("Select e from Employee e where username='"
					+ employee.getUsername() + "' and password='" + employee.getPassword() + "'");
			Employee e = (Employee) query1.getSingleResult();
			if (e != null) {
				System.out.println(e.getRolename());
				status = e.getRolename();
				// return status;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println();
			status = "Invalid credentials";
			// return status;
		}

		return status;

	}

	// Project
	@Override
	public Project procreate(Project employee) {
		// entityManager.persist(parent);
		return entityManager.merge(employee);
	}

	@Override
	public Project progetProjectById(String projectid) {
		System.out.println("get employee");
		return entityManager.find(Project.class, projectid);
	}

	@Override
	public List<Project> progetAllProjects() {
		System.out.println("all Employee");
		return entityManager.createQuery("select e from Project e").getResultList();
	}

	@Override
	public void proupdateProject(Project employee) {
		entityManager.merge(employee);
	}

	@Override
	public void prodeleteProject(String projectid) {
		Project e = entityManager.find(Project.class, projectid);
		entityManager.remove(e);
	}

	// Department
	@Override
	public Department deptcreate(Department employee) {
		// entityManager.persist(parent);
		return entityManager.merge(employee);
	}

	@Override
	public Department deptgetDepartmentById(String deptid) {
		System.out.println("get employee");
		return entityManager.find(Department.class, deptid);
	}

	@Override
	public List<Department> deptgetAllDepartments() {
		System.out.println("all Employee");
		return entityManager.createQuery("select e from Department e").getResultList();
	}

	@Override
	public void deptupdateDepartment(Department employee) {
		entityManager.merge(employee);
	}

	@Override
	public void deptdeleteDepartment(String deptid) {
		Department e = entityManager.find(Department.class, deptid);
		entityManager.remove(e);
	}

	// Employee
	@Override
	public EmployeeServ empcreate(EmployeeServ employee) {
		// entityManager.persist(parent);
		return entityManager.merge(employee);
	}

	@Override
	public EmployeeServ empgetEmployeeById(String emplId) {
		System.out.println("get employee");
		return entityManager.find(EmployeeServ.class, emplId);
	}

	@Override
	public List<EmployeeServ> empgetAllEmployees() {
		System.out.println("all Employee");
		return entityManager.createQuery("select e from EmployeeServ e").getResultList();
	}

	@Override
	public void empupdateEmployee(EmployeeServ employee) {
		entityManager.merge(employee);
	}

	@Override
	public void empdeleteEmployee(String emplId) {
		EmployeeServ e = entityManager.find(EmployeeServ.class, emplId);
		entityManager.remove(e);
	}

	// Date
	@SuppressWarnings("unchecked")
	public List<Employeetable> getEmployeebydate(LocalDate joineddate) {

		return (List<Employeetable>) entityManager.createQuery(
				"select s from Employeetable s where s.joineddate='" + joineddate + "' and s.activeflag=" + 1 + "")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Employeetable> getEmployeebydate1(LocalDate resigeddate) {

		return (List<Employeetable>) entityManager.createQuery(
				"select s from Employeetable s where s.joineddate='" + resigeddate + "' and s.activeflag=" + 2 + "")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Employeetable> getEmployeebyAct1() {
		System.out.println("getEmployeebyAct1");
		return (List<Employeetable>) entityManager
				.createQuery("select s from Employeetable s where s.activeflag=" + 1 + "").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Employeetable> getEmployeebyAct2() {

		return (List<Employeetable>) entityManager
				.createQuery("select s from Employeetable s where s.activeflag=" + 2 + "").getResultList();
	}
}

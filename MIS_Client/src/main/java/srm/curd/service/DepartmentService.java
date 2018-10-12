package srm.curd.service;

import java.io.IOException;
import java.util.List;

import srm.curd.model.Department;

public interface DepartmentService {
	
	public Department deptcreate(Department dud) throws IOException;
	public List<Department> deptgetUserDetails();
	public Department deptgetUser();	
	public void deptuserdetailDelete(String deptid);
	public void deptgetUpdateDetails(Department sud);
	public List<Department> deptuserdetailUpdate1(String deptid);

}

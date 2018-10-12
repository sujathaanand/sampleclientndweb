package srm.curd.service;

import java.io.IOException;
import java.util.List;

import srm.curd.model.EmployeeClient;

public interface EmployeeClientService {
	
	public EmployeeClient empcreate(EmployeeClient ud) throws IOException;
	public List<EmployeeClient> empgetEmployeeClient();
	public EmployeeClient empgetUser();	
	public void empuserdetailDelete(String emplId);
	public void empgetUpdateDetails(EmployeeClient ud);
	public List<EmployeeClient> empuserdetailUpdate1(String emplId);
	
	
}

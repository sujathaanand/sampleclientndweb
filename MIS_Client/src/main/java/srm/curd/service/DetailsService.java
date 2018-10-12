package srm.curd.service;
 
import java.util.List;

import srm.curd.model.Employeedto; 

public interface DetailsService { 
	
	public List<Employeedto> getAllEmployeesActive1();
	
	public List<Employeedto> getAllEmployeesActive2();
	  
	public List<Employeedto> getAllEmployeesbyjoin2(String joineddate);

	public List<Employeedto> getAllEmployeesbyjoin1(String joineddate);
 
	
	
}

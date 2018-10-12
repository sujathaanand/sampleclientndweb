package srm.curd.service;

import java.io.IOException;
import java.util.List;

import srm.curd.model.Project;

public interface ProjectService {
	
	public Project procreate(Project pud) throws IOException;
	public List<Project> progetProject();
	public Project progetUser();	
	public void prouserdetailDelete(String projectid);
	public void progetUpdateDetails(Project pud);
	public List<Project> prouserdetailUpdate1(String projectid);

}

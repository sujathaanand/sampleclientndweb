package srm.curd.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import srm.curd.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

	//@Autowired
	//private RestTemplate restTemplate = new RestTemplate();
	
	ObjectMapper pom = new ObjectMapper();
	
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	String url="http://localhost:9090/MIS_Log_Server/users";
	
	public Project procreate(Project pud) throws IOException {
		//String userObject = om.writeValueAsString(ud);
		String ur = url + "/procreate";
		Project us = restTemplate().postForObject(ur, pud, Project.class);
		System.out.println(us.toString());
		//UserDetails user = om.readValue(us,UserDetails.class);
		return us;
	}

	public List<Project> progetProject() {
		System.out.println("Service Implementation");
		String ur = url + "/proemployees";
		List<Project> list = new ArrayList<Project>();
		Project[] forNow = restTemplate().getForObject(ur, Project[].class);
		list= Arrays.asList(forNow);
		return list;
	}

	public Project progetUser() {
		Project s =  restTemplate().getForEntity(url+"/proupdate", Project.class).getBody();
		return s;
	}

	public void prouserdetailDelete(String projectid) {
		 System.out.println(url+"/prodelete"+projectid);
         restTemplate().delete(url+"/prodelete/"+projectid);
		
	}
	
	public void progetUpdateDetails(Project ud) 
	{
	System.out.println(ud.toString());
		//restTemplate().put(url +"/update",ud);
		System.out.println("Given Data"+ud.toString());
		String ur = url + "/proupdate";
		restTemplate().put(ur,ud);;
		//System.out.println(us.toString());
		//UserDetails user = om.readValue(us,UserDetails.class);
	

	}

	public List<Project> prouserdetailUpdate1(String projectid) {
		List<Project> list = new ArrayList<Project>();
		Project forNow = restTemplate().getForObject(url+"/proemployee/"+projectid, Project.class);
		list= Arrays.asList(forNow);
		
	
		return list;
		
	}
}

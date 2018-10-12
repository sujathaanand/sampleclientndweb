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

import srm.curd.model.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	//@Autowired
	//private RestTemplate restTemplate = new RestTemplate();
	
	ObjectMapper som = new ObjectMapper();
	
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	String url="http://localhost:9090/MIS_Log_Server/users";
	
	@Override
	public Department deptcreate(Department dud) throws IOException {
		//String userObject = om.writeValueAsString(ud);
		String ur = url + "/deptcreate";
		Department us = restTemplate().postForObject(ur, dud, Department.class);
		System.out.println(us.toString());
		//UserDetails user = om.readValue(us,UserDetails.class);
		return us;
	}

	@Override
	public List<Department> deptgetUserDetails() {
		String ur = url + "/deptemployees";
		List<Department> list = new ArrayList<Department>();
		Department[] forNow = restTemplate().getForObject(ur, Department[].class);
		list= Arrays.asList(forNow);
		return list;
	}

	@Override
	public Department deptgetUser() {
		Department s =  restTemplate().getForEntity(url+"/deptupdate", Department.class).getBody();
		return s;
	}

	@Override
	public void deptuserdetailDelete(String deptid) {
		 System.out.println(url+"/deptdelete"+deptid);
         restTemplate().delete(url+"/deptdelete/"+deptid);
		
	}
	
	@Override
	public void deptgetUpdateDetails(Department dud) 
	{
	System.out.println(dud.toString());
		//restTemplate().put(url +"/update",ud);
		System.out.println("Given Data"+dud.toString());
		String ur = url + "/deptupdate";
		restTemplate().put(ur,dud);
		//System.out.println(us.toString());
		//UserDetails user = om.readValue(us,UserDetails.class);
	

	}

	@Override
	public List<Department> deptuserdetailUpdate1(String deptid) {
		List<Department> list = new ArrayList<Department>();
		Department forNow = restTemplate().getForObject(url+"/deptemployee/"+deptid, Department.class);
		list= Arrays.asList(forNow);
		
	
		return list;
		
	}
}

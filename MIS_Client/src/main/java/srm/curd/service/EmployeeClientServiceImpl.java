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

import srm.curd.model.EmployeeClient;

@Service
public class EmployeeClientServiceImpl implements EmployeeClientService {

	//@Autowired
	//private RestTemplate restTemplate = new RestTemplate();
	
	ObjectMapper om = new ObjectMapper();
	
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	String url="http://localhost:9090/MIS_Log_Server/users";
	
	@Override
	public EmployeeClient empcreate(EmployeeClient ud) throws IOException {
		//String userObject = om.writeValueAsString(ud);
		String ur = url + "/empcreate";
		EmployeeClient us = restTemplate().postForObject(ur, ud, EmployeeClient.class);
		System.out.println(us.toString());
		//UserDetails user = om.readValue(us,UserDetails.class);
		return us;
	}

	@Override
	public List<EmployeeClient> empgetEmployeeClient() {
		String ur = url + "/empemployees";
		List<EmployeeClient> list = new ArrayList<EmployeeClient>();
		EmployeeClient[] forNow = restTemplate().getForObject(ur, EmployeeClient[].class);
		list= Arrays.asList(forNow);
		return list;
	}

	@Override
	public EmployeeClient empgetUser() {
		EmployeeClient s =  restTemplate().getForEntity(url+"/4", EmployeeClient.class).getBody();
		return s;
	}

	@Override
	public void empuserdetailDelete(String emplId) {
		 System.out.println(url+"/empdelete"+emplId);
         restTemplate().delete(url+"/empdelete/"+emplId);
		
	}
	
	@Override
	public void empgetUpdateDetails(EmployeeClient ud) 
	{
	System.out.println(ud.toString());
		//restTemplate().put(url +"/update",ud);
		System.out.println("Given Data"+ud.toString());
		String ur = url + "/empupdate";
		restTemplate().put(ur,ud);;
		//System.out.println(us.toString());
		//UserDetails user = om.readValue(us,UserDetails.class);
	

	}

	@Override
	public List<EmployeeClient> empuserdetailUpdate1(String emplId) {
		List<EmployeeClient> list = new ArrayList<EmployeeClient>();
		EmployeeClient forNow = restTemplate().getForObject(url+"/empemployee/"+emplId, EmployeeClient.class);
		list= Arrays.asList(forNow);
		
	
		return list;
		
	}

}

package srm.curd.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import srm.curd.model.Employeedto;

@Service
public class DetailsServiceImpl implements DetailsService {

	// @Autowired
	// private RestTemplate restTemplate = new RestTemplate();

	ObjectMapper om = new ObjectMapper();

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	String url = "http://localhost:9090/MIS_Log_Server/users";

	@Override
	public List<Employeedto> getAllEmployeesActive1() {
		System.out.println("getAllEmployeesActive1");
		List<Employeedto> list = new ArrayList<Employeedto>();
		System.out.println("URL: " + url+"/getactemp1");
		Employeedto[] forNow = restTemplate().getForObject(url + "/getactemp1", Employeedto[].class);
		list = Arrays.asList(forNow);
		return list;
	}

	@Override
	public List<Employeedto> getAllEmployeesActive2() {
		System.out.println("getAllEmployeesActive2");
		List<Employeedto> list = new ArrayList<Employeedto>();
		System.out.println("URL: " + url+"/getactemp2");
		Employeedto[] forNow = restTemplate().getForObject(url + "/getactemp2", Employeedto[].class);
		list = Arrays.asList(forNow);
		return list;
	}

	@Override
	public List<Employeedto> getAllEmployeesbyjoin1(String joineddate) {
		System.out.println("1LIST IS PRINTING*//////****");
		List<Employeedto> list = new ArrayList<Employeedto>();
		Employeedto[] forNow = restTemplate().getForObject(url + "/getbydate/" + joineddate, Employeedto[].class);
		System.out.println("2LIST IS PRINTING*//////****");
		list = Arrays.asList(forNow);
		System.out.println("LIST IS PRINTING*//////****" + list.toString());
		return list;
	}

	@Override
	public List<Employeedto> getAllEmployeesbyjoin2(String joineddate) {
		System.out.println("1LIST IS PRINTING*//////****");
		List<Employeedto> list = new ArrayList<Employeedto>();
		Employeedto[] forNow = restTemplate().getForObject(url + "/getbydate1/" + joineddate, Employeedto[].class);
		System.out.println("2LIST IS PRINTING*//////****");
		list = Arrays.asList(forNow);
		System.out.println("LIST IS PRINTING*//////****" + list.toString());
		return list;
	}

}

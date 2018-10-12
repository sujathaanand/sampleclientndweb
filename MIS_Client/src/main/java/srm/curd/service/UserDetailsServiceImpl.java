package srm.curd.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import srm.curd.model.Login_model;
import srm.curd.model.UserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	// @Autowired
	// private RestTemplate restTemplate = new RestTemplate();

	ObjectMapper om = new ObjectMapper();

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	String url = "http://localhost:9090/MIS_Log_Server/users";
	              

	@Override
	public UserDetails create(UserDetails ud) {
		String ur = url + "/create";
		System.out.println("parent object" + ud.toString());
		UserDetails us = restTemplate().postForObject(ur, ud, UserDetails.class);
		System.out.println(us.toString());
		return us;
	}

	@Override
	public List<UserDetails> getUserDetails() {
		List<UserDetails> list = new ArrayList<UserDetails>();
		UserDetails[] forNow = restTemplate().getForObject(url, UserDetails[].class);
		list = Arrays.asList(forNow);

		return list;
	}

	@Override
	public UserDetails getUser() {
		UserDetails s = restTemplate().getForEntity(url + "/4", UserDetails.class).getBody();
		return s;
	}

	@Override
	public void userdetailDelete(long id) {
		System.out.println(url + "/" + id);
		restTemplate().delete(url + "/" + id);

	}

	@Override
	public  String login(Login_model ud) {
		// TODO Auto-generated method stub
		//System.out.println("I am here1");
		String ur = url + "/login";
		//System.out.println("parent object : "+ud);
		String us = restTemplate().postForObject(ur, ud, String.class);
		//System.out.println("I am here2");
		System.out.println(us);
		return us;
		
	}

}

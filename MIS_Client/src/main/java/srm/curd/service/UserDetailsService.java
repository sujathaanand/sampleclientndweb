package srm.curd.service;

import java.io.IOException;
import java.util.List;

import srm.curd.model.Employeedto;
import srm.curd.model.Login_model;
import srm.curd.model.UserDetails;

public interface UserDetailsService {
	
	public UserDetails create(UserDetails ud) throws IOException;
	public List<UserDetails> getUserDetails();
	public UserDetails getUser();
	
	public void userdetailDelete(long id);
	
	public  String login(Login_model ud)throws IOException;
	
}

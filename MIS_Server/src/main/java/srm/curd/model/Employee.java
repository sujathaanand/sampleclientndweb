package srm.curd.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user_registration")

public class Employee implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	 
	

	@Column(name="Username")
	private String username;

	@Column(name="password")
	private String password;

	@Column(name="passwordconfirm")
	private String passwordconfirm;
	
	@Column(name="created_time")
	private String time;
	
	@Column(name="rolename")
	private String rolename;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", passwordconfirm="
				+ passwordconfirm + ", time=" + time + ", rolename=" + rolename + "]";
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the passwordconfirm
	 */
	public String getPasswordconfirm() {
		return passwordconfirm;
	}


	/**
	 * @param passwordconfirm the passwordconfirm to set
	 */
	public void setPasswordconfirm(String passwordconfirm) {
		this.passwordconfirm = passwordconfirm;
	}


	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}


	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}


	/**
	 * @return the rolename
	 */
	public String getRolename() {
		return rolename;
	}


	/**
	 * @param rolename the rolename to set
	 */
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
}


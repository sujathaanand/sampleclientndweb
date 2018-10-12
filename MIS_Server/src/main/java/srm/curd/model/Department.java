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
@Table(name = "dept_table")

public class Department implements Serializable{
	
	
	@Id
	@Column(name="deptid")
	private String deptid;	
	 
	@Column(name="empid")
	private String empid;

	@Column(name="deptname")
	private String deptname;	

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	@Override
	public String toString() {
		return "Project [empid=" + empid + ", deptname=" + deptname + ", deptid=" + deptid + "]";
	}

	public Department(String empid, String deptname, String deptid) {
		super();
		this.empid = empid;
		this.deptname = deptname;
		this.deptid = deptid;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}
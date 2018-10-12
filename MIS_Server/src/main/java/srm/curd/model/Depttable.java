package srm.curd.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "admDepttable")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Depttable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private int deptid;
	@Column
	private String deptname;
	
	
	public Depttable() {
		super();
	}

	public Depttable(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	@Override
	public String toString() {
		return "Depttable [deptid=" + deptid + ", deptname=" + deptname +  "]";
	}
	
	
	
	
	

	

}

package srm.curd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "admprojecttable")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Projecttable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private int projectid;
	@Column
	private String projectname;
	@Column
	private String utilpercent;
	@Column
	private String remarks;
	@Column
	private String billable;
	
	


	public Projecttable() {
		super();
	}


	


	public Projecttable(int projectid, String projectname, String utilpercent, String remarks, String billable) {
		super();
		this.projectid = projectid;
		this.projectname = projectname;
		this.utilpercent = utilpercent;
		this.remarks = remarks;
		this.billable = billable;
	}





	public int getProjectid() {
		return projectid;
	}


	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}


	public String getProjectname() {
		return projectname;
	}


	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}


	public String getUtilpercent() {
		return utilpercent;
	}


	public void setUtilpercent(String utilpercent) {
		this.utilpercent = utilpercent;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	

	public String getBillable() {
		return billable;
	}





	public void setBillable(String billable) {
		this.billable = billable;
	}





	@Override
	public String toString() {
		return "Projecttable [projectid=" + projectid + ", projectname=" + projectname + ", utilpercent=" + utilpercent
				+ ", remarks=" + remarks + ", billable=" + billable + "]";
	}
	 
}

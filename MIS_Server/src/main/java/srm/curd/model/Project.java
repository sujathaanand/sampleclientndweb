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
@Table(name = "projtbl")

public class Project implements Serializable{
	
	@Id
	@Column(name="Project_Id")
	private String projectid;
	
	@Column(name="Project_Name")
	private String projectName;
	
	@Column(name="Employee_Id")
	private String emplId;

	@Column(name="Billing")
	private String billing;

	@Column(name="Utilized")
	private String utilizedper;
	
	@Column(name="Remarks")
	private String remarks;

	public String getProjectid() {
		return projectid;
	}

	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getEmplId() {
		return emplId;
	}

	public void setEmplId(String emplId) {
		this.emplId = emplId;
	}

	public String getBilling() {
		return billing;
	}

	public void setBilling(String billing) {
		this.billing = billing;
	}

	public String getUtilizedper() {
		return utilizedper;
	}

	public void setUtilizedper(String utilizedper) {
		this.utilizedper = utilizedper;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", projectName=" + projectName + ", emplId=" + emplId + ", billing="
				+ billing + ", utilizedper=" + utilizedper + ", remarks=" + remarks + "]";
	}

	public Project(String projectid, String projectName, String emplId, String billing, String utilizedper,
			String remarks) {
		super();
		this.projectid = projectid;
		this.projectName = projectName;
		this.emplId = emplId;
		this.billing = billing;
		this.utilizedper = utilizedper;
		this.remarks = remarks;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
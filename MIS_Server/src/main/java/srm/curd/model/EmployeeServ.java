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
@Table(name = "Employee_table")

public class EmployeeServ implements Serializable{
	
	
	@Id
	@Column(name="Employee_Id")
	private String emplId;

	@Column(name="Employee_Name")
	private String emplName;

	@Column(name="Description")
	private String description;

	@Column(name="Joined_Date")
	private String joinedDate;
	
	@Column(name="Resigned_Date")
	private String resignedDate;
	
	@Column(name="Active_Flag")
	private String activeFlag;

	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", emplName=" + emplName + ", description=" + description
				+ ", joinedDate=" + joinedDate + ", resignedDate=" + resignedDate + ", activeFlag=" + activeFlag + "]";
	}

	public String getEmplId() {
		return emplId;
	}

	public void setEmplId(String emplId) {
		this.emplId = emplId;
	}

	public String getEmplName() {
		return emplName;
	}

	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getResignedDate() {
		return resignedDate;
	}

	public void setResignedDate(String resignedDate) {
		this.resignedDate = resignedDate;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public EmployeeServ(long id, String emplId, String emplName, String description, String joinedDate, String resignedDate,
			String activeFlag) {
		super();
		this.emplId = emplId;
		this.emplName = emplName;
		this.description = description;
		this.joinedDate = joinedDate;
		this.resignedDate = resignedDate;
		this.activeFlag = activeFlag;
	}

	public EmployeeServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
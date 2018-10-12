package srm.curd.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "admemptable")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Employeetable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private int empid;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "IST", locale = "en_IN")
	private LocalDate joineddate;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "IST", locale = "en_IN")
	private LocalDate resigneddate;
	@Column
	private int activeflag;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = Depttable.class)
	@JoinColumn(name = "deptid", referencedColumnName = "deptid", nullable = false, updatable = false)
	private Depttable depttable;
	
	@OneToMany(fetch = FetchType.EAGER, targetEntity = Projecttable.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "empid", referencedColumnName = "empid", nullable = false, updatable = false)
	private Set<Projecttable> projecttable;

	

	public Employeetable() {
		super();
	}

	

	public Employeetable(int empid, String name, String description, LocalDate joineddate, LocalDate resigneddate,
			int activeflag, Depttable depttable, Set<Projecttable> projecttable) {
		super();
		this.empid = empid;
		this.name = name;
		this.description = description;
		this.joineddate = joineddate;
		this.resigneddate = resigneddate;
		this.activeflag = activeflag;
		this.depttable = depttable;
		this.projecttable = projecttable;
	}



	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getJoineddate() {
		return joineddate;
	}

	public void setJoineddate(LocalDate joineddate) {
		this.joineddate = joineddate;
	}

	public LocalDate getResigneddate() {
		return resigneddate;
	}

	public void setResigneddate(LocalDate resigneddate) {
		this.resigneddate = resigneddate;
	}

	public Set<Projecttable> getProjecttable() {
		return projecttable;
	}

	public void setProjecttable(Set<Projecttable> projecttable) {
		this.projecttable = projecttable;
	}

	public Depttable getDepttable() {
		return depttable;
	}

	public void setDepttable(Depttable depttable) {
		this.depttable = depttable;
	}

	
	
	public int getActiveflag() {
		return activeflag;
	}



	public void setActiveflag(int activeflag) {
		this.activeflag = activeflag;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", description=" + description + ", joineddate="
				+ joineddate + ", resigneddate=" + resigneddate + ", activeflag=" + activeflag + ", depttable="
				+ depttable + ", projecttable=" + projecttable + "]";
	}



	

}

package srm.curd.dto;

import java.time.LocalDate;
import java.util.Set;

import srm.curd.model.Employeetable;
import srm.curd.model.Projecttable;

public class Employeedto {

	
	private int sid;
	private String sname;
	private LocalDate sjoineddate;
	private LocalDate sresigneddate;
	private String sdescription;
	private int sactiveflag;
	private String sdeptname;
	private Set<Projecttable>  projecttable;
	
	
	
	public int getSid() {
		return sid;
	}




	public void setSid(int sid) {
		this.sid = sid;
	}




	public String getSname() {
		return sname;
	}




	public void setSname(String sname) {
		this.sname = sname;
	}




	public LocalDate getSjoineddate() {
		return sjoineddate;
	}




	public void setSjoineddate(LocalDate sjoineddate) {
		this.sjoineddate = sjoineddate;
	}




	public LocalDate getSresigneddate() {
		return sresigneddate;
	}




	public void setSresigneddate(LocalDate sresigneddate) {
		this.sresigneddate = sresigneddate;
	}




	public String getSdeptname() {
		return sdeptname;
	}




	public void setSdeptname(String sdeptname) {
		this.sdeptname = sdeptname;
	}




	public Set<Projecttable> getProjecttable() {
		return projecttable;
	}




	public void setProjecttable(Set<Projecttable> projecttable) {
		this.projecttable = projecttable;
	}

	
	


	public String getSdescription() {
		return sdescription;
	}




	public void setSdescription(String sdescription) {
		this.sdescription = sdescription;
	}




	public int getSactiveflag() {
		return sactiveflag;
	}




	public void setSactiveflag(int sactiveflag) {
		this.sactiveflag = sactiveflag;
	}




	public static Employeedto convertToDTO(Employeetable employee) {
	Employeedto employeedto =new Employeedto();
	employeedto.setSid(employee.getEmpid());
	employeedto.setSname(employee.getName());
	employeedto.setSjoineddate(employee.getJoineddate());
	employeedto.setSresigneddate(employee.getResigneddate());
	employeedto.setSdescription(employee.getDescription());
	employeedto.setSactiveflag(employee.getActiveflag());
	employeedto.setSdeptname(employee.getDepttable().getDeptname());
	employeedto.setProjecttable(employee.getProjecttable());
	
	return employeedto;
	

}
}

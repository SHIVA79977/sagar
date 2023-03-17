package hybernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.cfg.Configuration;

import com.fasterxml.classmate.AnnotationConfiguration;

@Entity 
@Table ( name="patient")
public class Patientpojo {
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int page;
	private String pcondition;
	
	
	public Patientpojo(int pid, String pname, int page, String pcondition) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.pcondition = pcondition;
	}
	public Patientpojo() {
		
	}
	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", page=" + page + ", pcondition=" + pcondition;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPcondition() {
		return pcondition;
	}
	public void setPcondition(String pcondition) {
		this.pcondition = pcondition;
	}
	
	public static void main(String[] args) {
		
		
		Configuration c= new AnnotationConfiguration().configure("hibernate.cgf.xml");
		
	}
	

}

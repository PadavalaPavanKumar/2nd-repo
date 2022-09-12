package JDBC;

public class InsertValues {
	
	private String id;
	private String name;
	private String project;
	private String domain;
	private int salary;
	private int experience;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getProject() {
		return project;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDomain() {
		return domain;
	}
	public int getSalary() {
		return salary;
	}  
	public int getExperience() {
		return experience;
	}
	

}

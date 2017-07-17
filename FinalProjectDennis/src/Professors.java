
public class Professors extends Users {

	private String department;

	public Professors(String name, String id, String year, String department) {
		super(name, id, year);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}

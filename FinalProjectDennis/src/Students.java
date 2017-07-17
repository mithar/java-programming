
public class Students extends Users {

	private String major;

	public Students(String name, String id, String year, String major) {
		super(name, id, year);
		this.major = major;
		// TODO Auto-generated constructor stub
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}

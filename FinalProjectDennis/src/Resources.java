import java.time.LocalDateTime;

public class Resources {
	
	
	// initializing variables for resources
	private String title;
	private String year;
	private String id;
	private String borrower;
	private LocalDateTime date;
	private String dateBorrowed;
	private String dueDate;
	private boolean isBorrowed;
	
	//contructor
	public Resources(String title, String year, String id, LocalDateTime date,String borrower, boolean isBorrowed)
	{
		
		date = LocalDateTime.now();
		this.date = date;
		this.title = title;
		this.year = year;
		this.id = id;
		this.borrower = borrower;
		this.isBorrowed = isBorrowed;
	}
	
	//second constructor
	public Resources(String title, String year, String id)
	{
		this.title = title;
		this.year = year;
		this.id = id;
	}
	
	
	//getters and setters for fields 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
}

import java.time.LocalDateTime;

public class Books extends Resources {
	private String author;
	private String publication;
	private int timesBorrowed;

	public Books(String title, String author, String year,LocalDateTime date, String id, String publication, String borrower,
			boolean isBorrowed, int timesBorrowed) {
		super(title, year, id,date, borrower, isBorrowed);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.publication = publication;
		this.setTimesBorrowed(timesBorrowed);
	}

	public Books(String title, String author, String year, String id, String publication) {
		super(title, year, id);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.publication = publication;
	}

	/*
	 * GETTERS AND SETTERS YOOOO
	 */
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getTimesBorrowed() {
		return timesBorrowed;
	}

	public void setTimesBorrowed(int timesBorrowed) {
		this.timesBorrowed = timesBorrowed;
	}
}
public class Users {
	
	//fields for the Users 
	private String name;
	private String id;
	private String year;
	private int maxBooks;
	
	//constructor for users
	public Users(String name, String id, int maxBooks)
	{
		this.setId(id);
		this.name = name;
		this.setMaxBooks(maxBooks);
	}
	
	
	public Users(String name, String id,String year)
	{
		this.setId(id);
		this.name = name;
		this.year = year;
	}



	//getters and setters for the the fields
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}

	
	
	public int addBook(int book)
	{
		book++;
		return book;
	}
	
	public int removeBook(int book)
	{
		book--;
		return book;
	}


	public int getMaxBooks() {
		return maxBooks;
	}


	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
}

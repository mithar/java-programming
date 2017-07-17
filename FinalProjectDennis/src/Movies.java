import java.time.LocalDateTime;

public class Movies extends Resources implements Checkable {

	private String director;
	private String productionCompany;

	public Movies(String title, String year, String id,LocalDateTime date, String director, String productionCompany, String borrower,
			boolean isBorrowed) {
		super(title, year, id, date, borrower, isBorrowed);
		this.director = director;
		this.productionCompany = productionCompany;

		// TODO Auto-generated constructor stub
	}

	public Movies(String title, String director, String year, String id, String productionCompany) {
		super(title, year, id);
		this.director = director;
		this.productionCompany = productionCompany;

		// TODO Auto-generated constructor stub
	}

	public String getProductionCompany() {
		return productionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}

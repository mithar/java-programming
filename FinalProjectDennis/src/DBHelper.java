
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class DBHelper {

	public DBHelper() {
	}

	public static void readInFile(ArrayList<Resources> resource, ArrayList<Users> user) throws FileNotFoundException {
		// Create strings for all the stuff
		//
		File movieFile = new File("MOVIES.TXT");
		Scanner scan = new Scanner(movieFile);

		while (scan.hasNextLine()) {

			String title, year, id, director, productionCompany, borrower;
			LocalDateTime date = null;
			boolean isBorrowed = false;
			title = scan.nextLine();
			year = scan.nextLine();
			id = scan.nextLine();
			director = scan.nextLine();
			// borrower = scan.nextLine();
			productionCompany = scan.nextLine();
			borrower = scan.nextLine();
			// isBorrowed = scan.nextBoolean();
			resource.add(new Movies(title, year, id,date , director, productionCompany, borrower, isBorrowed));
		}
		scan.close();
		

		File bookFile = new File("BOOKS.TXT");
		scan = new Scanner(bookFile);

		while (scan.hasNextLine()) {
			String title, year, id, author, productionCompany, borrower;
			int timesBorrowed;
			boolean isBorrowed = false;
			title = scan.nextLine();
			year = scan.nextLine();
			id = scan.nextLine();
			author = scan.nextLine();
			borrower = scan.nextLine();
			productionCompany = scan.nextLine();
			isBorrowed = scan.nextBoolean();
			timesBorrowed = scan.nextInt();
			// resource.add(new Books(title,year, id, author, productionCompany,
			// borrower, isBorrowed, timesBorrowed));
			resource.add(new Books(title, year, id, author, productionCompany));
		}
		scan.close();
	

		File studentFile = new File("STUDENTS.txt");
		scan = new Scanner(studentFile);
		while (scan.hasNextLine()) {
			String name, id, year, major;
			name = scan.nextLine();
			id = scan.nextLine();
			year = scan.nextLine();
			major = scan.nextLine();
			user.add(new Students(name, id, year, major));
		}
		scan.close();
	

		File professorFile = new File("PROFESSORS.txt");
		scan = new Scanner(professorFile);

		while (scan.hasNextLine()) {
			String name, id, year, department;
			name = scan.nextLine();
			id = scan.nextLine();
			year = scan.nextLine();
			department = scan.nextLine();
			user.add(new Students(name, id, year, department));
		}
		scan.close();
		
	}

	public static void checkIn(ArrayList<Users> user) {
		String title, id;
	}

	public static void writeInFile(ArrayList<Resources> resource, ArrayList<Users> user) throws IOException {

		PrintWriter movieFile = new PrintWriter("MOVIES.TXT");
		// Setting Strings to the movie.gets so that they can be sorted out
		// later

		for (int i = 0; i < resource.size(); i++) {
			if (resource.get(i) instanceof Movies) {
				movieFile.println(resource.get(i).getTitle());
				movieFile.println(resource.get(i).getYear());
				movieFile.println(resource.get(i).getId());
				movieFile.println(((Movies) resource.get(i)).getDirector());
				movieFile.println(((Movies) resource.get(i)).getProductionCompany());
				movieFile.println(resource.get(i).getBorrower());
				// movieFile.print(resource.get(i).getDueDate());
				// movieFile.print(((Movies) resource.get(i)).getDueDate());
			}

		}

		movieFile.close();
		movieFile.close();

		PrintWriter bookFile = new PrintWriter("BOOKS.TXT");
		// Setting Strings to the movie.gets so that they can be sorted out
		// later

		for (int i = 0; i < resource.size(); i++) {
			if (resource.get(i) instanceof Books) {
				bookFile.println(resource.get(i).getTitle());
				bookFile.println(resource.get(i).getYear());
				bookFile.println(resource.get(i).getId());
				bookFile.println(((Books) resource.get(i)).getAuthor());
				bookFile.println(((Books) resource.get(i)).getPublication());
				bookFile.println(((Books) resource.get(i)).getTimesBorrowed());
			}

		}

		bookFile.close();
		bookFile.close();

		PrintWriter studentFile = new PrintWriter("STUDENTS.TXT");
		// Setting Strings to the movie.gets so that they can be sorted out
		// later

		for (int i = 0; i < user.size(); i++) {
			if (user.get(i) instanceof Students) {
				studentFile.println(user.get(i).getId());
				studentFile.println(user.get(i).getName());
				studentFile.println(user.get(i).getYear());
				studentFile.println(((Students) user.get(i)).getMajor());
			}
		}
		studentFile.close();
		studentFile.close();

		PrintWriter professorFile = new PrintWriter("PROFESSORS.TXT");
		// Setting Strings to the movie.gets so that they can be sorted out
		// later

		for (int i = 0; i < user.size(); i++) {
			if (user.get(i) instanceof Professors) {
				professorFile.println(user.get(i).getId());
				professorFile.println(user.get(i).getName());
				professorFile.println(user.get(i).getYear());
				professorFile.println(((Professors) user.get(i)).getDepartment());
			}
		}
		professorFile.close();
		professorFile.close();
	}

}
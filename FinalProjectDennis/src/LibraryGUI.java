
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class LibraryGUI extends JFrame{

	private static final long serialVersionUID = 1L;
	public static int WIDTH = 700;
	public static int HEIGHT = 500;
	//Library lib = new Library();
	
	/*public static void main(String[] args) throws IOException {
		new LibraryGUI();
		
		DBHelper help = new DBHelper();
		help.writeInMovieFile("poo", "3005", "testing");
		help.writeInMovieFile("lol","terrible facebooks memes", "pronz");
		help.writeInBookFile("HuckleBerry Finn", "3443234","Samuel Clemens", "1884");
		help.findMovieFile();
		//DBHelper help = new DBHelper();
		//help.writeInBookFile("HuckleBerry Finn", "3443234","Samuel Clemens", "1884");
		//help.writeStudentFile("lol", 1, "comp sci", "sophomore");	
	}*/

	CheckInPanel checkInPanel;
	AddUserPanel addUserPanel;
	AddResourcePanel addResourcePanel;
	JTabbedPane tabbedPane;
	Library library;
	
	public LibraryGUI() throws IOException
	{
		
		JButton close = new JButton("Close");
		
		super.add(close);
		library = new Library();
		DBHelper.readInFile(library.getResource(),library.getUser());
		
		
		
	    addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
            	try {
					DBHelper.writeInFile(library.getResource(),library.getUser());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                e.getWindow().dispose();
            }
        });
		
		library.getResource();
		super.setTitle("Handy Dandy Librarian Tool");
		super.setSize(WIDTH, HEIGHT);
		initializeTabbedPane(library);
		super.add(close);
		super.add(tabbedPane);
		super.pack();
		super.setVisible(true);
	}
	
	private void initializeTabbedPane(Library library)
	{
		tabbedPane = new JTabbedPane();

		checkInPanel = new CheckInPanel();
		tabbedPane.addTab("Check In", null, checkInPanel,
                "Check in a resource");

		addUserPanel = new AddUserPanel(library);
		tabbedPane.addTab("Add New User", null, addUserPanel,
                "Add new student or professor");
		
		addResourcePanel = new AddResourcePanel(library);
		tabbedPane.addTab("Add Resource", null, addResourcePanel,
				"Add a new Movie or Book!");
	}

}
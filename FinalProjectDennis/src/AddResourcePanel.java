

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class AddResourcePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	JPanel addBookPanel, addMoviePanel;
	JPanel bookBtnPanel, movieBtnPanel;
	JButton submitBookBtn, submitMovieBtn;
	
	JLabel bookTitleLabel, bookAuthorLabel, bookPubLabel, bookISBNLabel, bookYLabel;
	JTextField bookTitleTF, bookAuthorTF, bookPubTF, bookIdTF,bookYTF ;
	
	JLabel movieTitleLabel, movieDirectorLabel, movieProdLabel, movieIdLabel, movieYLabel;
	JTextField movieTitleTF, movieDirectorTF, movieProdTF, movieIdTF, movieYTF;

	public AddResourcePanel(Library library) {
		super.setLayout(new GridLayout(1, 2));
		initializeBookPanel(library);
		initializeMoviePanel(library);
		super.add(addBookPanel);
		super.add(addMoviePanel);
	}
	
	private void initializeBookPanel(Library library)
	{
		addBookPanel = new JPanel(new GridLayout(9,1));		
		addBookPanel.setSize(LibraryGUI.WIDTH/2,100);
		TitledBorder border = BorderFactory.createTitledBorder("Add New Book");
		border.setTitleJustification(TitledBorder.CENTER);
		addBookPanel.setBorder(border);
		
		bookTitleLabel = new JLabel("Title:");
		bookAuthorLabel = new JLabel("Author:");
		bookPubLabel = new JLabel("Year:");		
		bookISBNLabel = new JLabel("ISBN:");
		bookYLabel = new JLabel("Publication:");
		bookTitleTF = new JTextField();
		bookTitleTF.setColumns(50);
		bookAuthorTF = new JTextField();
		bookAuthorTF.setColumns(50);
		bookPubTF = new JTextField();
		bookPubTF.setColumns(50);
		bookIdTF = new JTextField();
		bookIdTF.setColumns(50);
		bookYTF = new JTextField();
		bookYTF.setColumns(50);

		submitBookBtn = new JButton("Submit");
		
		submitBookBtn.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				library.getResource().add(new Movies(movieTitleTF.getText().toString(),
						bookAuthorTF.getText().toString(),
						bookYTF.getText().toString(),
						bookIdTF.getText().toString(),
						bookPubTF.getText().toString()));
				clearBooks();
			}
	
		});
		
		addBookPanel.add(bookTitleLabel);
		addBookPanel.add(bookTitleTF);
		addBookPanel.add(bookAuthorLabel);
		addBookPanel.add(bookAuthorTF);
		addBookPanel.add(bookPubLabel);
		addBookPanel.add(bookPubTF);
		addBookPanel.add(bookISBNLabel);
		addBookPanel.add(bookIdTF);
		addBookPanel.add(bookYLabel);
		addBookPanel.add(bookYTF);

		bookBtnPanel = new JPanel();
		bookBtnPanel.add(submitBookBtn);
		addBookPanel.add(bookBtnPanel);

	}

	
	private void initializeMoviePanel(Library library)
	{
		addMoviePanel = new JPanel(new GridLayout(9,1));		
		addMoviePanel.setSize(LibraryGUI.WIDTH/2,100);
		TitledBorder border = BorderFactory.createTitledBorder("Add New Movie");
		border.setTitleJustification(TitledBorder.CENTER);
		addMoviePanel.setBorder(border);
		
		movieTitleLabel = new JLabel("Title:");
		movieDirectorLabel = new JLabel("Director:");
		movieProdLabel = new JLabel("Year:");		
		movieIdLabel = new JLabel("Id:");
		movieYLabel = new JLabel("Production Company:");
		movieTitleTF = new JTextField();
		movieTitleTF.setColumns(50);
		movieDirectorTF = new JTextField();
		movieDirectorTF.setColumns(50);
		movieProdTF = new JTextField();
		movieProdTF.setColumns(50);
		movieIdTF = new JTextField();
		movieIdTF.setColumns(50);
		movieYTF = new JTextField();
		movieYTF.setColumns(50);

		submitMovieBtn = new JButton("Submit");
		
		submitMovieBtn.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						library.getResource().add(new Movies(movieTitleTF.getText().toString(),
						movieDirectorTF.getText().toString(),
						movieYTF.getText().toString(),
						movieIdTF.getText().toString(),
						movieProdTF.getText().toString()));
						
						clearMovies();
					}
			
				});
				
		
		addMoviePanel.add(movieTitleLabel);
		addMoviePanel.add(movieTitleTF);
		addMoviePanel.add(movieDirectorLabel);
		addMoviePanel.add(movieDirectorTF);
		addMoviePanel.add(movieProdLabel);
		addMoviePanel.add(movieProdTF);
		addMoviePanel.add(movieIdLabel);
		addMoviePanel.add(movieIdTF);
		addMoviePanel.add(movieYLabel);
		addMoviePanel.add(movieYTF);

	
		movieBtnPanel = new JPanel();
		movieBtnPanel.add(submitMovieBtn);
		addMoviePanel.add(movieBtnPanel);
	}
	
	public void clearMovies()
	{
		movieTitleTF.setText("");
		movieDirectorTF.setText("");
		movieProdTF.setText("");
		movieIdTF.setText("");
		movieYTF.setText("");
	}
	
	public void clearBooks()
	{
		bookTitleTF.setText("");
		bookAuthorTF.setText("");
		bookPubTF.setText("");
		bookIdTF.setText("");
		bookYTF.setText("");
	}
}

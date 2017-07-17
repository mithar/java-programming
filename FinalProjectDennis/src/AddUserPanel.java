
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class AddUserPanel extends JPanel {

	JPanel addStudentPanel, addProfPanel;
	JPanel profBtnPanel, studentBtnPanel;
	JButton submitProfBtn, submitStudentBtn;
	JLabel studentIdLabel, studentNameLabel, studentMajorLabel, studentYrLabel; 
	JTextField studentIdTF, studentNameTF, studentMajorTF, studentYrTF; 
	JLabel profIdLabel, profNameLabel, profDeptLabel, profYrLabel; 
	JTextField profIdTF, profNameTF, profDeptTF, profYrTF; 
	
	
	public AddUserPanel(Library library)
	{
		super.setLayout(new GridLayout(1,2));
		initializeStudentPanel(library);
		initializeProfessorPanel(library);
		super.add(addStudentPanel);
		super.add(addProfPanel);
	}
	
	
	private void initializeStudentPanel(Library library)
	{
		addStudentPanel = new JPanel(new GridLayout(9,1));		
		addStudentPanel.setSize(LibraryGUI.WIDTH/2,100);
		TitledBorder border = BorderFactory.createTitledBorder("Add New Student");
		border.setTitleJustification(TitledBorder.CENTER);
		addStudentPanel.setBorder(border);
		
		studentNameLabel = new JLabel("Name:");
		studentIdLabel = new JLabel("Student Id:");
		studentMajorLabel = new JLabel("Major:");		
		studentYrLabel = new JLabel("Year Entered:");
		
		studentNameTF = new JTextField();
		studentNameTF.setColumns(50);
		studentIdTF = new JTextField();
		studentIdTF.setColumns(50);
		studentMajorTF = new JTextField();
		studentMajorTF.setColumns(50);
		studentYrTF = new JTextField();
		studentYrTF.setColumns(50);

		submitStudentBtn = new JButton("Submit");
		
		submitStudentBtn.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				library.getUser().add(new Students(studentNameTF.getText().toString()
						,studentIdTF.getText().toString()
						,studentMajorTF.getText().toString()
						,studentYrTF.getText().toString()));
				clearStudent();
				
			}
			
		}); 
		
		addStudentPanel.add(studentNameLabel);
		addStudentPanel.add(studentNameTF);
		addStudentPanel.add(studentIdLabel);
		addStudentPanel.add(studentIdTF);
		addStudentPanel.add(studentMajorLabel);
		addStudentPanel.add(studentMajorTF);
		addStudentPanel.add(studentYrLabel);
		addStudentPanel.add(studentYrTF);

	
		studentBtnPanel = new JPanel();
		studentBtnPanel.add(submitStudentBtn);
		addStudentPanel.add(studentBtnPanel);

	}

	
	private void initializeProfessorPanel(Library library)
	{
		addProfPanel = new JPanel(new GridLayout(9,1));		
		addProfPanel.setSize(LibraryGUI.WIDTH/2,100);
		TitledBorder border = BorderFactory.createTitledBorder("Add New Professor");
		border.setTitleJustification(TitledBorder.CENTER);
		addProfPanel.setBorder(border);
		
		profNameLabel = new JLabel("Name:");
		profIdLabel = new JLabel("Faculty Id:");
		profDeptLabel = new JLabel("Department:");		
		profYrLabel = new JLabel("Year Entered:");
		
		profNameTF = new JTextField();
		profNameTF.setColumns(50);
		profIdTF = new JTextField();
		profIdTF.setColumns(50);
		profDeptTF = new JTextField();
		profDeptTF.setColumns(50);
		profYrTF = new JTextField();
		profYrTF.setColumns(50);

		submitProfBtn = new JButton("Submit");
		
		submitProfBtn.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent e) {
				
				library.getUser().add(new Professors(profNameTF.getText().toString(),
				profIdTF.getText().toString(),
				profDeptTF.getText().toString(),
				profYrTF.getText().toString()));
				clearProf();
			}
		});
		
		addProfPanel.add(profNameLabel);
		addProfPanel.add(profNameTF);
		addProfPanel.add(profIdLabel);
		addProfPanel.add(profIdTF);
		addProfPanel.add(profDeptLabel);
		addProfPanel.add(profDeptTF);
		addProfPanel.add(profYrLabel);
		addProfPanel.add(profYrTF);

	
		profBtnPanel = new JPanel();
		profBtnPanel.add(submitProfBtn);
		addProfPanel.add(profBtnPanel);
	}
	
	private void clearProf()
	{
		profNameTF.setText("");
		profIdTF.setText("");
		profDeptTF.setText("");
		profYrTF.setText("");
	}
	
	private void clearStudent()
	{
		studentNameTF.setText("");
		studentIdTF.setText("");
		studentMajorTF.setText("");
		studentYrTF.setText("");
	}
	
	
}

	

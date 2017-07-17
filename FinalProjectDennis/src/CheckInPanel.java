
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class CheckInPanel extends JSplitPane {

	JSplitPane userInfoPanel;
	JPanel userCheckOutsPanel;
	JPanel initialInputPanel;
	UserInfoPanel userInfoDisplayPanel;

	JLabel userNameLabel;
	JTextField userNameTF;

	JLabel userIdLabel;
	JTextField userIdTF;

	JRadioButton studentRB;
	JRadioButton facultyRB;

	JPanel radioPanel;
	ButtonGroup userTypeBG;
	JButton findUserBtn;
	JPanel buttonPanel;
	JButton checkInBtn;
	JPanel checkInBtnPanel;
	
	

	public CheckInPanel() {
		super(JSplitPane.VERTICAL_SPLIT);
		initializeUserInfoPanel();
		userCheckOutsPanel = new JPanel();
		super.setDividerLocation((int) LibraryGUI.HEIGHT / 2);
		super.setTopComponent(userInfoPanel);
		super.setBottomComponent(userCheckOutsPanel);

	}

	public void initializeUserInfoPanel() {
		userInfoPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		userInfoPanel.setDividerLocation(500);
		initialInputPanel = new JPanel(new GridLayout(6, 1));

		userNameLabel = new JLabel("Name:");
		userNameTF = new JTextField();
		userNameTF.setColumns(50);
		userIdLabel = new JLabel("ID:");
		userIdTF = new JTextField();
		userIdTF.setColumns(50);
		studentRB = new JRadioButton("Student", true);
		facultyRB = new JRadioButton("Faculty");
		userTypeBG = new ButtonGroup();
		userTypeBG.add(studentRB);
		userTypeBG.add(facultyRB);
		findUserBtn = new JButton("Find User");

		buttonPanel = new JPanel();
		buttonPanel.add(findUserBtn);
		checkInBtn = new JButton("Check In");
		checkInBtn.setEnabled(false);
		buttonPanel.add(checkInBtn);
		radioPanel = new JPanel();
		radioPanel.add(studentRB);
		radioPanel.add(facultyRB);

		findUserBtn.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent e) {
				
				clear();
			}
		});

		initialInputPanel.add(userNameLabel);
		initialInputPanel.add(userNameTF);
		initialInputPanel.add(userIdLabel);
		initialInputPanel.add(userIdTF);
		initialInputPanel.add(radioPanel);
		initialInputPanel.add(buttonPanel);

		userInfoPanel.setLeftComponent(initialInputPanel);
		userInfoDisplayPanel = new UserInfoPanel();
		userInfoPanel.setRightComponent(userInfoDisplayPanel);
	}

	private class UserInfoPanel extends JPanel {
		JLabel idLabel, nameLabel, deptLabel, yrLabel;
		JTextField idTF, nameTF, deptTF, yrTF;

		public UserInfoPanel() {
			super(new GridLayout(8, 1, 5, 5));
			initializeUserInfo();
		}

		public void initializeUserInfo() {
			String name = "";
			String id = "";
			String year = "";
			String dept = "";

			nameLabel = new JLabel("Name:");
			idLabel = new JLabel("Student Id:");
			deptLabel = new JLabel("Major:");
			yrLabel = new JLabel("Year Entered:");

			nameTF = new JTextField();
			nameTF.setText(name);
			nameTF.setColumns(50);
			nameTF.setEditable(false);
			idTF = new JTextField();
			nameTF.setText(id);
			idTF.setColumns(50);
			idTF.setEditable(false);
			deptTF = new JTextField();
			deptTF.setText(dept);
			deptTF.setEditable(false);
			deptTF.setColumns(50);
			yrTF = new JTextField();
			yrTF.setText(year);
			yrTF.setEditable(false);
			yrTF.setColumns(50);

			add(nameLabel);
			add(nameTF);
			add(idLabel);
			add(idTF);
			add(deptLabel);
			add(deptTF);
			add(yrLabel);
			add(yrTF);
		}
	}

	private void clear() {
		userNameTF.setText("");
		userIdTF.setText("");
	}
}
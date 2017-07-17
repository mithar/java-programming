package GUIBagelCalculator;

import javax.swing.*;

@SuppressWarnings("serial")
public class GreetingPanel extends JPanel {

	JLabel greeting;

	public GreetingPanel() {
		greeting = new JLabel("Welcome to Dennis-eru\'s Bagel apartment");
		super.add(greeting);
	}
}

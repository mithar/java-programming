package GUIBagelCalculator;
import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class BagelPanel extends JPanel{

	private JRadioButton whiteRB;
	private JRadioButton wheatRB;
	private ButtonGroup bagelBG;
	
	public BagelPanel()
	{
		super.setBorder(BorderFactory.createTitledBorder("Bagels"));
		super.setLayout(new GridLayout(2,1));
		// true makes the radio button selected upon the opening of the panel
		whiteRB = new JRadioButton("White" , true);
		wheatRB = new JRadioButton("Wheat");
		
		bagelBG = new ButtonGroup();
		bagelBG.add(whiteRB);
		bagelBG.add(wheatRB);
		super.add(whiteRB);
		super.add(wheatRB);
		
	}
	
}

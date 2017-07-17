package GUIBagelCalculator;

import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
public class ToppingsPanel extends JPanel{
	
	private JCheckBox creamCheeseCB;
	private JCheckBox butterCB;
	private JCheckBox peachCB;
	private JCheckBox blueBerryCB;


public ToppingsPanel()
{
	super.setBorder(BorderFactory.createTitledBorder("Toppings"));
	super.setLayout(new GridLayout(4,1));
	creamCheeseCB = new JCheckBox("CreamCheese");
	butterCB = new JCheckBox("Butter");
	peachCB = new JCheckBox("Peach");
	blueBerryCB = new JCheckBox("Blueberry");
	
	super.add(creamCheeseCB);
	super.add(butterCB);
	super.add(peachCB);
	super.add(blueBerryCB);
}

}

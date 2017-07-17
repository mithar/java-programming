package GUIBagelCalculator;
import java.awt.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class CoffeePanel extends JPanel{
	
	private JRadioButton noCoffeeRB;
	private JRadioButton regularCoffeeRB;
	private JRadioButton decafCoffeeRB;
	private JRadioButton cappuccinoRB;
	private ButtonGroup coffeeBG;

	public CoffeePanel() {
		super.setBorder(BorderFactory.createTitledBorder("Coffee"));
		super.setLayout(new GridLayout(4,1));
		noCoffeeRB = new JRadioButton("None");
		regularCoffeeRB = new JRadioButton("Regular", true);
		decafCoffeeRB = new JRadioButton("Decaf Coffee");
		cappuccinoRB = new JRadioButton("Cappuccino");
		
		//Adds the buttons to the button group
		coffeeBG = new ButtonGroup();
		coffeeBG.add(noCoffeeRB);
		coffeeBG.add(regularCoffeeRB);
		coffeeBG.add(decafCoffeeRB);
		coffeeBG.add(cappuccinoRB);
		
		//adds the buttons to the layout
		super.add(noCoffeeRB);
		super.add(regularCoffeeRB);
		super.add(decafCoffeeRB);
		super.add(cappuccinoRB);
	}

}

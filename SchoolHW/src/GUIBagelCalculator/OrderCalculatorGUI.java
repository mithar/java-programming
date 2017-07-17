package GUIBagelCalculator;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class OrderCalculatorGUI extends JFrame{
	
	public static void main(String[] args)
	{
		new OrderCalculatorGUI();
	}
	
	
	private BagelPanel bagels;
	private ToppingsPanel toppings;
	private CoffeePanel coffee;
	private GreetingPanel banner;
	private JButton calculateBtn;
	private JPanel calculatePanel;
	
	public OrderCalculatorGUI()
	{
		super.setTitle("Order Calculator");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		bagels = new BagelPanel();
		toppings = new ToppingsPanel();
		coffee = new CoffeePanel();
		banner = new GreetingPanel();	
		calculateBtn = new JButton("Calculate");
		calculatePanel = new JPanel();
		calculatePanel.add(calculateBtn);
		
		super.add(banner, BorderLayout.NORTH);
		super.add(bagels, BorderLayout.WEST);
		super.add(toppings, BorderLayout.CENTER);
		super.add(coffee, BorderLayout.EAST);
		super.add(calculatePanel,BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
		
		
	}


}

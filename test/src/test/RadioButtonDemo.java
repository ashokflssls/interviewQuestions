package test;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonDemo extends JFrame{

	JTextField t1;
	JRadioButton r1, r2;
	JButton button;
	JLabel label1;
	
	public RadioButtonDemo() {

		t1 = new JTextField(15);
		r1= new JRadioButton("Male");
		r2= new JRadioButton("Female");
		button = new JButton("OK");
		label1 = new JLabel("Greeting");
		
		ButtonGroup bg  = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
	
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		add(t1);
		add(r1);
		add(r2);
		
		add(button);
		add(label1);
			
		
		button.addActionListener(ae -> {
			
			String name = t1.getText();
			if(r1.isSelected()) {
				name = "Mr."+ name;
			}
			else 
				name = "Mrs."+name;
			label1.setText(name);
		});
		
		
	}
	
	public static void main(String[] args) {
		RadioButtonDemo r = new RadioButtonDemo();
		
	}
	
	
}

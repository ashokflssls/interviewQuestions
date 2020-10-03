
package test;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CheckBoxDemo extends JFrame {

	JTextField t1;
	JRadioButton r1, r2;
	JButton button;
	JCheckBox c1, c2;

	JLabel label1;

	public CheckBoxDemo() {

		t1 = new JTextField(15);
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		button = new JButton("OK");
		label1 = new JLabel("Greeting");
		c1 = new JCheckBox("Dancing");
		c2 = new JCheckBox("Singer");

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		
		add(t1);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		
		c1.addItemListener(new ItemListener() {
			
			
			public void itemStateChanged(ItemEvent e) {

				System.out.println("hello ... check in console...");
				//label1.setText("its selected");
				
			}
		});

		add(button);
		add(label1);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button.addActionListener(ae -> {

			String name = t1.getText();
			if (r1.isSelected()) {
				name = "Mr." + name;
			} else
				name = "Mrs." + name;

			if (c1.isSelected())
				name = name + " Dancer";

			if (c2.isSelected())
				name = name + " Singer";

			label1.setText(name);
		});

	}

	public static void main(String[] args) {

		CheckBoxDemo cd = new CheckBoxDemo();

	}

}

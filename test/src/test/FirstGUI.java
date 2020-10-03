package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FirstGUI extends JFrame {

	JTextField t1;
	JTextField t2;
	JButton add;
	JButton sub;
	JLabel Result;

	/*
	 * @Override public void actionPerformed(ActionEvent e) {
	 * 
	 * int v1 = Integer.parseInt(t1.getText());
	 * 
	 * int v2 = Integer.parseInt(t2.getText());
	 * 
	 * int result = v1 + v2; Result.setText(result + "");
	 * 
	 * }
	 */

	public FirstGUI() {

		setSize(800, 600);
		setVisible(true);
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		add = new JButton("Add");
		sub = new JButton("Sub");

		Result = new JLabel("Result");
		setLayout(new FlowLayout());

		add(t1);
		add(t2);
		add(add);
		add(sub);
		add(Result);

		add.addActionListener(ae ->

		{
			int v1 = Integer.parseInt(t1.getText());

			int v2 = Integer.parseInt(t2.getText());

			int result = v1 + v2;
			Result.setText(result + "");

		});
		
		sub.addActionListener(ae ->

		{
			int v1 = Integer.parseInt(t1.getText());

			int v2 = Integer.parseInt(t2.getText());

			int result = v1 - v2;
			Result.setText(result + "");

		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

	public static void main(String[] args) {

		new FirstGUI();

	}

}

package test;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseDemo extends JFrame{

	
	
	public MouseDemo() {
		
		addMouseListener(new MouseAdapter() {
			
			public void mousePressed(java.awt.event.MouseEvent e) {
				
				int x = e.getX();
				int y = e.getY();
				System.out.println(x +" " + y);
				
			};
			
		} );

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	
	
	

	public static void main(String[] args) {
		MouseDemo md = new MouseDemo();
	}
}

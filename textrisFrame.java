import java.awt.*;

import javax.swing.*;

public class textrisFrame extends JFrame{
	
	MyPanel panel;
	
	textrisFrame(){
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();

		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}  
}

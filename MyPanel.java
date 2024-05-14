import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel{

	final int panelWidth = 705;
	final int panelHeight = 805;
	Timer timer;
	int xVelocity = 1;
	int yVelocity = 1;
	int x = 5;
	int y = 5;

	Color darkGrey = new Color(20, 20, 20); // Color white
	Color darkerGrey = new Color(10, 10, 10);
	MyPanel(){
		this.setPreferredSize(new Dimension(panelWidth,panelHeight));
		this.setBackground(Color.black);
	}
	
	public void paint(Graphics g) {
		
		super.paint(g); // paint background
		g.setColor(darkerGrey);
		for (int j = 0; j < (panelHeight/25); j++) {

			for (int i = 0; i < (panelWidth/25); i++) {
				g.fillRect(x, y, 20, 20);
				x+=25;
				if (g.getColor()== darkGrey){
					g.setColor(darkerGrey);
				}else{
					g.setColor(darkGrey);
				}
				}	
				y += 25;
				x = 5;
				if (g.getColor()== darkGrey){
					g.setColor(darkerGrey);
				}else{
					g.setColor(darkGrey);
				}
		}

		}

}

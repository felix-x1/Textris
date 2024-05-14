import javax.swing.JFrame;
import javax.swing.JPanel;
import javafx.embed.swing.JFXPanel;
import java.awt.Graphics;
public class textrisGridtest extends JPanel{


  public void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      g.setColor(java.awt.Color.PINK);
      g.fillRect(0, 0, 25, 25);
  }
  public static void main(String[] args) throws Exception {
    textrisGridtest a = new textrisGridtest();
    JFrame jf = new JFrame();

    jf.setTitle("grapefruit");
    jf.setSize(700,850);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.add(a);
    jf.setLocationRelativeTo(null);

}

} 


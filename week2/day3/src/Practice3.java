import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Practice3 extends JPanel {
  public void mainDraw(Graphics g) {

    super.paintComponent(g);
    this.setBackground(Color.LIGHT_GRAY);

    g.setColor(Color.BLUE);
    g.drawLine(1,50,2,3);



  }

}



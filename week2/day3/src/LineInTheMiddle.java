import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {
  public static void mainDraw(Graphics graphics){
      graphics.setColor(Color.RED);
      graphics.drawLine(300,140,0, 140);
      graphics.setColor(Color.GREEN);
      graphics.drawLine(150,300,150,0);





    // draw a red horizontal line to the canvas' middle.
    // draw a green vertical line to the canvas' middle.


  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
  public static void mainDraw(Graphics graphics) {
  int size = 200;
  int x= WIDTH/2 - size/2;
  int y = HEIGHT/2 - size/2;
  int five = 5;
  drawCircle(x,y,size,graphics, five);


  }
  public static void drawCircle(int x,int y,int size, Graphics graphics,int five){
    graphics.
  }

  public static void recursive(int x,int y,int size, Graphics graphics){
    drawCircle(x,y,size,graphics);

    if (size > 3){

      recursive(x, y, size, graphics);
    }

  }












  // Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

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

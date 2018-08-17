import javax.swing.*;
import java.awt.*;

import static java.awt.Color.WHITE;
import static java.awt.Color.white;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HomePracticaFractal {
  public static void mainDraw(Graphics graphics) {
    int size = 500;
    int x = 1;
    int y = 1;
    graphics.setColor(Color.WHITE);
    graphics.fillRect(x,y,WIDTH,HEIGHT);
    drawFractal(x,y, size, graphics);
  }
  public static void draw( int x,int y, int size, Graphics graphics){
    graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255), 255));
    graphics.drawRect(x , y, size, size);

  }
  public static void drawFractal(int x, int y, int size, Graphics graphics){
      draw(x,y, size, graphics);


      if ( size > 5){
        drawFractal(x + size / 3, y ,size / 3, graphics);
        drawFractal(x , y + size /3 ,size / 3, graphics);
        drawFractal(x + size * 1/3 , y + size *2/3 ,size / 3, graphics);
        drawFractal(x + size * 2/3 , y + size *1/3 ,size / 3, graphics);
      }
  }








  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) throws InterruptedException {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    while (true) {
      jFrame.repaint();
      Thread.sleep(100);
    }
  }

static class ImagePanel extends JPanel {
  @Override
  protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);
    mainDraw(graphics);
  }
}
}
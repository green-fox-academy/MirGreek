import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class ToTheCenter {


  public static class Drawing {
    public static void mainDraw(Graphics graphics) {
      // Create a line drawing function that takes 2 parameters:
      // The x and y coordinates of the line's starting point
      // and draws a line from that point to the center of the canvas.
      // Draw 3 lines with that function. Use loop for that.
      int x = 50;
      int y = 120;
      graphicFunction(graphics, x,y);

    }

    public static void graphicFunction(Graphics graphics, int x, int y){
      for (int i = 0; i <3 ; i++) {
        graphics.drawLine( WIDTH/2,HEIGHT/2,x,y);
        x+= 30;
        y+=30;
      }



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
}

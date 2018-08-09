
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StrarryNight {

    public static void mainDraw(Graphics graphics) {
      // Draw the night sky:
      //  - The background should be black
      //  - The stars can be small squares
      //  - The stars should have random positions on the canvas
      //  - The stars should have random color (some shade of grey)
      graphics.fillRect(0,0,WIDTH,HEIGHT);
      graphics.setColor(Color.BLACK);
      //String[] myColors = {"GREY","YELLOW","WHITE","RED"};
      int j =0;
      for (int i = 1; i <1000 ; i++) {
          int randomNx = (int) (Math.random() * (WIDTH - 0)) + 0;
          int randomNy = (int) (Math.random() * (HEIGHT - 0)) + 0;
         graphics.draw3DRect(randomNx,randomNy,2,2,true);
          graphics.setColor(new Color(((int) Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));

      }






    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
      JFrame jFrame = new JFrame("Drawing");
      jFrame.setSize(new Dimension(WIDTH, HEIGHT));
      jFrame.setBackground(Color.BLACK);
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


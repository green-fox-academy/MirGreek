import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ProjectHexagon {

    public static void mainDraw(Graphics graphics) {
      int upperpoint[] = {WIDTH/2};
      int xpoints[] = {WIDTH/2, 145, 25};
      int ypoints[] = {WIDTH/2, 25, 145};
      int npoints = 3;

      graphics.drawPolygon(xpoints, ypoints, npoints);
    }

 static void DrawItForMe (int xpoints,int ypoints, int npoints){

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




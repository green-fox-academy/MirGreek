import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HomePracticaFractal {
  public static void mainDraw(Graphics graphics) {
    int x = WIDTH/3;
    int y = HEIGHT/3;
    int width = WIDTH/3;
    int height = HEIGHT/3;
    int size = 600;

    graphics.drawRect(size/3,size/3,width, height); //középső
    //graphics.drawRect(size/3,0,width, height); //felső
    //graphics.drawRect(0,size/3,width, height); //bal
    //graphics.drawRect(size/3,(size/3)*2,width, height); //alsó
    //graphics.drawRect((size/3)*2,size/3,width, height); //jobb

    draw(size, width, height,graphics);
  }
  public static void draw( int size, int width, int height, Graphics graphics){

      graphics.drawRect(size / 3, 0, width, height); //felső
      graphics.drawRect(0, size / 3, width, height); //bal
      graphics.drawRect(size / 3, (size / 3) * 2, width, height); //alsó
      graphics.drawRect((size / 3) * 2, size / 3, width, height); //jobb

    if (size > 5) {
     draw(size/3, width/3, height, graphics);
      //draw(size/3, width/2, height, graphics);
      //draw(size/3, width/2, height, graphics);
      //draw(size/3, width, height, graphics);
    }
  }









  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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
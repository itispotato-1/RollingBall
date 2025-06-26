package Lib;
import java.awt.*;
import javax.swing.JPanel;

public class RollingBall extends JPanel {
    public void paintComponent(Graphics g){
        int w= getWidth()/2,h = getWidth()/2;
        g.setColor(Color.BLACK);
        g.fillArc(w-50, h-50, 100, 100, 0, 180);
        g.drawArc(w-50, h-50, 100, 100, 180, 180);
    }
}

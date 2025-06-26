package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RollingBall extends JPanel implements ActionListener{
    int ang = 0;
    int MoveForward = 0,x,y;
    public RollingBall(){
        Timer t1 = new Timer(50,this);
        t1.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        x= MoveForward-50+getWidth()/2;
        y = getHeight()/2;
        g.setColor(Color.BLACK);
        g.fillArc(x, y-50, 100, 100, ang, 180);
        g.drawArc(x, y-50, 100, 100, ang+180, 180);
        
    }
    public void actionPerformed(ActionEvent e) {
        ang +=5;
        MoveForward -=5;
        if(x <= -100){MoveForward = getWidth()/2+50;}
        repaint();
    }
}


import java.awt.*;
import java.applet.*;

public class main extends Applet {

    public void paint(Graphics g) {
        for (int x=0;x<=1000;x+=10)
            g.drawLine(x,0,x,800);
        for (int y=0;y<=800;y+=10)
            g.drawLine(0,y,1000,y);
        g.setColor(Color.black);
        g.fillRect(400, 400, 10, 10);
    }
}
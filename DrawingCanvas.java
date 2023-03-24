import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent {

    private int width;
    private int height;
    private Tree t1;
    private Cloud c1;

    public DrawingCanvas(int w,int h)
    {
        width=w;
        height=h;
        t1=new Tree(200,500,400);
        c1 = new Cloud(100, 200, 200, Color.BLUE);
    }

    protected void paintComponent(Graphics g)
    {
    Graphics2D g2d= (Graphics2D) g;

    RenderingHints rh= new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setRenderingHints(rh);
    t1.DrawTree(g2d);
    c1.DrawCloud(g2d);
    }
}

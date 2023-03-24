import java.awt.*;
import java.awt.geom.*;
public class Tree {
    private double x;
    private double y;
    private double size;
    public Tree(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void DrawTree(Graphics2D g2d) {
        Rectangle2D.Double e1 = new Rectangle2D.Double(x,y,size*.3,size*1.2);
        Ellipse2D.Double e2 = new Ellipse2D.Double(x-size*0.25,y-size*.25,size*.8,size*.8);
        g2d.setColor(new Color(102,51,0));
        g2d.fill(e1);
        g2d.setColor(Color.GREEN);
        g2d.fill(e2);
    }
}

import java.awt.*;
public class Circle extends Shape {
    private int radius; 

    public Circle(int x, int y, Color fc, Color lc, int radius) {
        super(x, y, fc, lc);
        this.radius = radius;
    }

    public void draw(Graphics2D brush) {
    //use brush?
        brush.setColor(this.getFillColor());
        brush.fillOval(this.getX(),this.getY(),this.getRadius()*2, this.getRadius()*2);
        brush.setColor(this.getLineColor());
        brush.drawOval(this.getX(),this.getY(),this.getRadius()*2, this.getRadius()*2);
    } 
         
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

}

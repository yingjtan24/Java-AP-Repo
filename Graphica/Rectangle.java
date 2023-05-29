import java.awt.*;
public class Rectangle extends Shape {
    private int width; 
    private int height;

    public Rectangle(int x, int y, Color fc, Color lc, int width, int height) {
        super(x, y, fc, lc);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D brush) {
        brush.setColor(this.getFillColor());
        brush.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        brush.setColor(this.getLineColor());
        brush.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
         
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    } 

}



    



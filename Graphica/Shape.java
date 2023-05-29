import java.awt.*;

public abstract class Shape {
    private int x;
    private int y;
    private Color fillColor;
    private Color lineColor;

    public Shape(int x, int y, Color fillColor, Color lineColor) {
        this.x = x;
        this.y = y;
        this.fillColor = fillColor; 
        this.lineColor = lineColor;
    }

//what does abstract mean?
    public abstract void draw(Graphics2D brush);

    public int getX() {
        return this.x;
    }
     
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getFillColor() {
        return this.fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getLineColor() {
        return this.lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

}
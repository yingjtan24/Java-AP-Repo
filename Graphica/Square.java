import java.awt.Color;
public class Square extends Rectangle {
    private int side;

    public Square(int x, int y, Color fc, Color lc, int side) {
        super(x, y, fc, lc, side, side);
    } 

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}



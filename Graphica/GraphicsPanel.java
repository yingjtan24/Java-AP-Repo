import java.awt.*;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel {

    Graphics2D g2; 
    public GraphicsPanel() {
        this(null);  // Call the other constructor, with parameter null.
    }

    public GraphicsPanel(String messageString) {
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);  // Call the paintComponent method from the 
                                  // superclass, JPanel.  This simply fills the 
                                  // entire panel with the background color, black.
        
        g2 = (Graphics2D) g; 
        //Graphics2D g2 = (Graphics2D)g;  // (To make the text smoother.)
       
        int width = getWidth();
        int height = getHeight();
        int rows = 10; 
        int cols = 10;
        //rectGrid(10,10);
        borderPattern(10,10);

        //Square s = new Square(10,10, Color.ORANGE, Color.BLUE); 
        //Rectangle r = new Rectangle(50, 100, Color.ORANGE, Color.BLUE, 200,400);
        //r.draw(g2);
        //^^ how does this work?

        /* for (int i = 0; i<10; i++) {
            for (int j=0; j<10; j++) {
                Rectangle obj = new Rectangle(i*60, j*50, Color.BLUE, Color.WHITE, 50,50);
                obj.draw(g2);
            }
        */
        } 
        //createGrid(g2); 
    
    
        private void rectGrid(int rows, int cols){

            Rectangle[][] rGrid = new Rectangle[rows][cols]; 
            for(int row = 0; row < rGrid.length; row++) {
                for(int col = 0; col < rGrid[0].length; col++) {
                    rGrid[row][col] = new Rectangle(row*60, col*60, Color.BLUE, Color.WHITE, 50, 50);
                }
            } 
            drawPatterns(rGrid);
        }

        private void borderPattern(int rows,int cols) {
            Rectangle[][] rGrid = new Rectangle[rows][cols]; 
            for(int row = 0; row < rGrid.length; row++) {
                for(int col = 0; col < rGrid[0].length; col++) {
                    if (row==0 || col==0) {
                    rGrid[row][col] = new Rectangle(row*60, col*60, Color.BLUE, Color.WHITE, 50, 50);
                    } else {
                    rGrid[row][col] = new Rectangle(row*60, col*60, Color.ORANGE, Color.WHITE, 50, 50);
                    }
                }

            }
        drawPatterns(rGrid);
        }
    
        private void myPattern(int rows, int cols) {
            Rectangle[][] rGrid = new Rectangle[rows][cols];
            for (int row = 0; row <grid.length; row++){
                for (int col = 0; col < grid[0].length; col ++){
                    if (row == col || row == (rows-1)-col) {
                        grid[row][col] = new Rectangle(50+row*60, 50+ col*60, Color.BLUE, Color.WHITE, 50, 50);
                    }else {
                        grid[row][col] = new Rectangle(50+row*60, 50+ col*60, Color.RED, Color.WHITE, 50, 50);
                    }
                }
            }
        drawPatterns(rGrid);
        }

        /*Circle[][] cGrid = new Circle[rows][cols]; 
        for(int row = 0; row < cGrid.length; row++) {
            for(int col = 0; col < cGrid[0].length; col++) {
                cGrid[row][col] = new Rectangle(row*60, col*60, Color.BLUE, Color.WHITE, 50, 50);
            }
        } */
        //drawPatterns(cGrid);

         // end 

        private void drawPatterns(Shape[][] grid) {
            for(int row = 0; row < grid.length; row++) {
                for(int col = 0; col < grid[0].length; col++) {
                    grid[row][col].draw(g2);
                }
            }
        }
    } // end paintComponent()

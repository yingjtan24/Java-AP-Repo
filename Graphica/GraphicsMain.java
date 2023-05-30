import javax.swing.JFrame;

public class GraphicsMain {
    
    public static void main(String[] args) {
        JFrame window = new JFrame("Java Graphics!");
        GraphicsPanel content = new GraphicsPanel();
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120,70);
        window.setSize(1000,800);
        window.setVisible(true);
    } 

}
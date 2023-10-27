import javax.swing.JFrame;

public class SteroidsFrame extends JFrame{
    SteroidsFrame(){
        this.add(new SteroidsMode());
        this.setTitle("Snake: Zen Mode");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
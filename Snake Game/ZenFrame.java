import javax.swing.JFrame;

public class ZenFrame extends JFrame{
    ZenFrame(){
        this.add(new ZenMode());
        this.setTitle("Snake: Zen Mode");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
import javax.swing.JFrame;

public class FastFrame extends JFrame{
    FastFrame(){
        this.add(new FastMode());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

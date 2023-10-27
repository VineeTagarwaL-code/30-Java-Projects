import javax.swing.JFrame;

public class ClassicFrame extends JFrame{
    ClassicFrame(){
        this.add(new ClassicMode());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

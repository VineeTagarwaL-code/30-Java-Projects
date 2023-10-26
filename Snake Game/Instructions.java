import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Instructions{
    Instructions(){
        //make a frame, panel and label
        JFrame instructions = new JFrame("Instructions");
        instructions.setSize(1200, 650);
        instructions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon logo = new ImageIcon("logo.png");
        instructions.setIconImage(logo.getImage());
        instructions.setResizable(false);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
        
        //make a JLabel ins to display the instructions for snake game 
        JLabel ins1 = new JLabel("Welcome to Snake!");
        ins1.setForeground(Color.WHITE);
        ins1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        ins1.setBounds(100, 50, 1200, 50);
        panel.add(ins1);

        JLabel ins2 = new JLabel("The objective of the game is to eat as many apples as possible.");
        ins2.setForeground(Color.WHITE);
        ins2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        ins2.setBounds(100, 100, 1200, 50);
        panel.add(ins2);

        JLabel ins3 = new JLabel("You can move the snake by using the arrow keys or the W,A,S,D keys.");
        ins3.setForeground(Color.WHITE);
        ins3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        ins3.setBounds(100, 150, 1200, 50);
        panel.add(ins3);

        JLabel ins4 = new JLabel("The snake will die if it runs into itself or the walls.");
        ins4.setForeground(Color.WHITE);
        ins4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        ins4.setBounds(100, 200, 1200, 50);
        panel.add(ins4);

        //make a JLabel cont to display the controls for snake game
        JLabel cont1 = new JLabel("Controls:");
        cont1.setForeground(Color.WHITE);
        cont1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        cont1.setBounds(100, 250, 1200, 50);
        panel.add(cont1);

        JLabel cont2 = new JLabel("W/UP arrow key: Move Up");
        cont2.setForeground(Color.WHITE);
        cont2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        cont2.setBounds(100, 300, 1200, 50);
        panel.add(cont2);

        JLabel cont3 = new JLabel("A/LEFT arrow key: Move Left");
        cont3.setForeground(Color.WHITE);
        cont3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        cont3.setBounds(100, 350, 1200, 50);
        panel.add(cont3);

        JLabel cont4 = new JLabel("S/DOWN arrow key: Move Down");
        cont4.setForeground(Color.WHITE);
        cont4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        cont4.setBounds(100, 400, 1200, 50);
        panel.add(cont4);

        JLabel cont5 = new JLabel("D/RIGHT arrow key: Move Right");
        cont5.setForeground(Color.WHITE);
        cont5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        cont5.setBounds(100, 450, 1200, 50);
        panel.add(cont5);

        JButton back = new JButton("Back");
        back.setBounds(550, 500, 100, 50);
        back.setBackground(Color.GREEN);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        back.setFocusable(false);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.main(null);
                instructions.dispose();
            }
        });
        panel.add(back);

        instructions.add(panel);
        instructions.setVisible(true);
        instructions.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Instructions();
    }
}
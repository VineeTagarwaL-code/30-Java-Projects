import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome {
    //make a welcome frame for the snake game 
    public static void main(String[] args) {
        JFrame welcome = new JFrame("Snake");
        welcome.setSize(700, 700);
        welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon logo = new ImageIcon("logo.png");
        welcome.setIconImage(logo.getImage());
        welcome.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);

        JLabel title = new JLabel("Welcome to Snake!");
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        title.setForeground(Color.WHITE);
        title.setBounds(100, 100, 700, 100);
        panel.add(title);

        JButton cont = new JButton("Continue");
        cont.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        cont.setBounds(250, 300, 200, 100);
        cont.setForeground(Color.WHITE);
        cont.setBackground(Color.GREEN);
        cont.setBorder(BorderFactory.createEtchedBorder());
        cont.setFocusable(false);
        cont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.main(args);
                welcome.dispose();
            }
        });
        panel.add(cont);

        JButton exit = new JButton("Exit");
        exit.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        exit.setBounds(250, 500, 200, 100);
        exit.setForeground(Color.WHITE);
        exit.setBackground(Color.GREEN);
        exit.setBorder(BorderFactory.createEtchedBorder());
        exit.setFocusable(false);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                welcome.dispose();
            }
        });
        panel.add(exit);

        welcome.add(panel);
        welcome.setVisible(true);
        welcome.setFocusable(true);
        welcome.setLocationRelativeTo(null);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu{
    public JFrame menu;
    public JButton modes;
    public JButton exit;
    public JButton instructions;
    public JButton settings;
    public JPanel panel;
    public JLabel modesdesc;
    Menu(){
        menu = new JFrame("Menu");
        menu.setSize(700,700);
        ImageIcon logo = new ImageIcon("logo.png");
        menu.setIconImage(logo.getImage());
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        panel.setBounds(0,0,700,700);
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));

        modes = new JButton("Modes");
        modes.setBackground(Color.GREEN);
        modes.setForeground(Color.WHITE);
        modes.setFont(new Font("Comic Sans MS", Font.PLAIN,30));
        modes.setBorder(BorderFactory.createEtchedBorder());
        modes.setBounds(250,50,200,100);
        modes.setFocusable(false);
        modes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Modes.main(null);
                menu.dispose();
            }
        });
        panel.add(modes);

        instructions = new JButton("Instructions");
        instructions.setBackground(Color.GREEN);
        instructions.setForeground(Color.WHITE);
        instructions.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        instructions.setBorder(BorderFactory.createEtchedBorder());
        instructions.setBounds(250,200,200,100);
        instructions.setFocusable(false);
        instructions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Instructions.main(null);
                menu.dispose();
            }
        });
        panel.add(instructions);

        settings = new JButton("Settings");
        settings.setBackground(Color.GREEN);
        settings.setForeground(Color.WHITE);
        settings.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        settings.setBorder(BorderFactory.createEtchedBorder());
        settings.setBounds(250,350,200,100);
        settings.setFocusable(false);
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Settings.main(null);
                menu.dispose();
            }
        });
        panel.add(settings);

        exit = new JButton("Exit");
        exit.setBackground(Color.GREEN);
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        exit.setBorder(BorderFactory.createEtchedBorder());
        exit.setBounds(250,500,200,100);
        exit.setFocusable(false);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.dispose();;
            }
        });
        panel.add(exit);

        menu.add(panel);
        menu.setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}

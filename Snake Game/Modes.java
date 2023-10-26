import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modes {
    //make a frame to hold the buttons of the modes
    //make a button for each mode
    //there should be not more than 3 buttons in the same y coordinates 

    JFrame frame = new JFrame("Modes");
    JPanel panel = new JPanel();
    JButton classic = new JButton("Classic");
    JButton zen = new JButton("Zen");
    JButton fast = new JButton("Fast");
    JButton back = new JButton("Back");
    JButton exit = new JButton("Exit");
    JButton classicinfo = new JButton("?");
    JButton zeninfo = new JButton("?");
    JButton fastinfo = new JButton("?");

    public Modes() {
        frame.setSize(1000, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon logo = new ImageIcon("logo.png");
        frame.setIconImage(logo.getImage());
        frame.setVisible(true);

        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, 0, 1000, 650);
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        
        classic.setBackground(Color.GREEN);
        classic.setForeground(Color.WHITE);
        classic.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        classic.setBorder(BorderFactory.createEtchedBorder());
        classic.setBounds(100, 150, 200, 100);
        classic.setFocusable(false);
        classic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SnakeGameClassic.main(null);
                frame.dispose();
            }
        });
        panel.add(classic);

        zen.setBackground(Color.GREEN);
        zen.setForeground(Color.WHITE);
        zen.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        zen.setBorder(BorderFactory.createEtchedBorder());
        zen.setBounds(590, 150, 200, 100);
        zen.setFocusable(false);
        zen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SnakeGameZen.main(null);
                frame.dispose();
            }
        });
        panel.add(zen);

        fast.setBackground(Color.GREEN);
        fast.setForeground(Color.WHITE);
        fast.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        fast.setBorder(BorderFactory.createEtchedBorder());
        fast.setBounds(100, 260, 200, 100);
        fast.setFocusable(false);
        fast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SnakeGameFast.main(null);
                frame.dispose();
            }
        });
        panel.add(fast);    

        back.setBackground(Color.GREEN);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        back.setBorder(BorderFactory.createEtchedBorder());
        back.setBounds(250, 400, 200, 100);
        back.setFocusable(false);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                frame.dispose();
            }
        });
        panel.add(back);

        exit.setBackground(Color.GREEN);
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        exit.setBorder(BorderFactory.createEtchedBorder());
        exit.setBounds(460, 400, 200, 100);
        exit.setFocusable(false);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        panel.add(exit);

        classicinfo.setBackground(Color.GREEN);
        classicinfo.setForeground(Color.WHITE);
        classicinfo.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        classicinfo.setBorder(BorderFactory.createEtchedBorder());
        classicinfo.setBounds(310, 150, 100, 100);
        classicinfo.setFocusable(false);
        classicinfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClassicInfoFrame.main(null);
                frame.dispose();
            }
        });
        panel.add(classicinfo);

        zeninfo.setBackground(Color.GREEN);
        zeninfo.setForeground(Color.WHITE);
        zeninfo.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        zeninfo.setBorder(BorderFactory.createEtchedBorder());
        zeninfo.setBounds(800, 150, 100, 100);
        zeninfo.setFocusable(false);
        zeninfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ZenInfoFrame.main(null);
                frame.dispose();
            }
        });
        panel.add(zeninfo);

        fastinfo.setBackground(Color.GREEN);
        fastinfo.setForeground(Color.WHITE);
        fastinfo.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        fastinfo.setBorder(BorderFactory.createEtchedBorder());
        fastinfo.setBounds(310, 260, 100, 100);
        fastinfo.setFocusable(false);
        fastinfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FastInfoFrame.main(null);
                frame.dispose();
            }
        });
        panel.add(fastinfo);

        frame.add(panel);
    }
    public static void main(String[] args) {
        new Modes();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings {
    static JFrame settings;
    JToggleButton grid;
    JToggleButton bgmode;
    JButton back;
    JLabel SnakeColour;
    JRadioButton colour1;
    JRadioButton colour2;
    JRadioButton colour3;
    JRadioButton colour4;
    JRadioButton colour5;
    JRadioButton colour6;
    static boolean gridmode=false;
    static boolean bg=true;
    static boolean c1=false;
    static boolean c2=false;
    static boolean c3=false;
    static boolean c4=false;
    static boolean c5=false;
    static boolean c6=false;
    public static void main(String[] args) {
        settings = new JFrame("Settings");
        settings.setSize(1100,650);
        ImageIcon logo = new ImageIcon("logo.png");
        settings.setIconImage(logo.getImage());
        settings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        settings.setLocationRelativeTo(null);
        settings.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        panel.setBounds(0,0,1100,650);
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));

        JToggleButton grid = new JToggleButton("Grid");
        grid.setBackground(Color.GREEN);
        grid.setForeground(Color.WHITE);
        grid.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        grid.setBorder(BorderFactory.createEtchedBorder());
        grid.setBounds(450,50,200,100);
        grid.setFocusable(false);
        grid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid.isSelected()){
                    grid.setText("Show Grid");
                    gridmode = false;
                }
                else{
                    grid.setText("Hide Grid");
                    gridmode = true;
                }
            }
        });
        panel.add(grid);

        JToggleButton bgmode = new JToggleButton("Background");
        bgmode.setBackground(Color.GREEN);
        bgmode.setForeground(Color.WHITE);
        bgmode.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        bgmode.setBorder(BorderFactory.createEtchedBorder());
        bgmode.setBounds(450,200,200,100);
        bgmode.setFocusable(false);
        bgmode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bgmode.isSelected()){
                    bgmode.setText("Dark mode");
                    bg = false;
                }
                else{
                    bgmode.setText("Light Mode");
                    bg = true;
                }
            }
        });
        panel.add(bgmode);

        JLabel SnakeColour = new JLabel("Choose the colour of your snake:");
        SnakeColour.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        SnakeColour.setForeground(Color.WHITE);
        SnakeColour.setBounds(325,300,600,50);
        panel.add(SnakeColour);

        JRadioButton colour1 = new JRadioButton("Green");
        colour1.setBackground(Color.BLACK);
        colour1.setForeground(Color.GREEN);
        colour1.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        colour1.setBorder(BorderFactory.createEtchedBorder());
        colour1.setBounds(300,350,200,50);
        colour1.setFocusable(false);
        colour1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(colour1.isSelected()){
                    colour1.setText("Green");
                    c1 = true;
                }
            }
        });
        JRadioButton colour2 = new JRadioButton("Blue");
        colour2.setBackground(Color.BLACK);
        colour2.setForeground(Color.BLUE);
        colour2.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        colour2.setBorder(BorderFactory.createEtchedBorder());
        colour2.setBounds(525,350,200,50);
        colour2.setFocusable(false);
        colour2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(colour2.isSelected()){
                    colour2.setText("Blue");
                    c2 = true;
                }
            }
        });
        JRadioButton colour3 = new JRadioButton("Red");
        colour3.setBackground(Color.BLACK);
        colour3.setForeground(Color.RED);
        colour3.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        colour3.setBorder(BorderFactory.createEtchedBorder());
        colour3.setBounds(725,350,200,50);
        colour3.setFocusable(false);
        colour3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(colour3.isSelected()){
                    colour3.setText("Red");
                    c3 = true;
                }
            }
        });
        JRadioButton colour4 = new JRadioButton("Yellow");
        colour4.setBackground(Color.BLACK);
        colour4.setForeground(Color.YELLOW);
        colour4.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        colour4.setBorder(BorderFactory.createEtchedBorder());
        colour4.setBounds(300,400,200,50);
        colour4.setFocusable(false);
        colour4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(colour4.isSelected()){
                    colour4.setText("Yellow");
                    c4 = true;
                }
            }
        });
        JRadioButton colour5 = new JRadioButton("Orange");
        colour5.setBackground(Color.BLACK);
        colour5.setForeground(Color.ORANGE);
        colour5.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        colour5.setBorder(BorderFactory.createEtchedBorder());
        colour5.setBounds(525,400,200,50);
        colour5.setFocusable(false);
        colour5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(colour5.isSelected()){
                    colour5.setText("Orange");
                    c5 = true;
                }
            }
        });
        JRadioButton colour6 = new JRadioButton("Rainbow");
        colour6.setBackground(Color.BLACK);
        colour6.setForeground(Color.MAGENTA);
        colour6.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        colour6.setBorder(BorderFactory.createEtchedBorder());
        colour6.setBounds(725,400,200,50);
        colour6.setFocusable(false);
        colour6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(colour6.isSelected()){
                    colour6.setText("Rainbow");
                    c6 = true;
                }
            }
        });
        ButtonGroup colourGroup = new ButtonGroup();
        colourGroup.add(colour1);
        colourGroup.add(colour2);
        colourGroup.add(colour3);
        colourGroup.add(colour4);
        colourGroup.add(colour5);
        colourGroup.add(colour6);
        panel.add(colour1);
        panel.add(colour2);
        panel.add(colour3);
        panel.add(colour4);
        panel.add(colour5);
        panel.add(colour6);

        JButton back = new JButton("Back");
        back.setBackground(Color.GREEN);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        back.setBorder(BorderFactory.createEtchedBorder());
        back.setBounds(450,500,200,100);
        back.setFocusable(false);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.main(null);
                settings.dispose();
            }
        });
        panel.add(back);

        settings.add(panel);
        settings.setVisible(true);
    }
}

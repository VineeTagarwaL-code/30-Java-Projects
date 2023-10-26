import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Random;

import javax.swing.JPanel;

public class ZenMode extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 1280;
    static final int SCREEN_HEIGHT = 650;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 110;
    Image head_down = new ImageIcon("head_down.png").getImage();
    Image head1=head_down.getScaledInstance(UNIT_SIZE, UNIT_SIZE, Image.SCALE_FAST);
    Image head_left = new ImageIcon("head_left.png").getImage();
    Image head2=head_left.getScaledInstance(UNIT_SIZE, UNIT_SIZE, Image.SCALE_FAST);
    Image head_right = new ImageIcon("head_right.png").getImage();
    Image head3=head_right.getScaledInstance(UNIT_SIZE, UNIT_SIZE, Image.SCALE_FAST);
    Image head_up = new ImageIcon("head_up.png").getImage();
    Image head4=head_up.getScaledInstance(UNIT_SIZE, UNIT_SIZE, Image.SCALE_FAST);
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 2;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    ZenMode(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        if(Settings.bg==true){
            this.setBackground(Color.BLACK);
        }
        if(Settings.bg==false){
            this.setBackground(Color.WHITE);
        }
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    public void startGame(){
        newApple();
        running=true;
        timer = new Timer(DELAY, this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        if(running){
            if(Settings.gridmode==true){
                for(int i=0; i<(int)(SCREEN_HEIGHT/UNIT_SIZE); i++){
                    g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
                }
                for(int i=0; i<(int)(SCREEN_WIDTH/UNIT_SIZE); i++){
                    g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
                }
            }
            /*g.setColor(Color.RED);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);*/
            Image apple=new ImageIcon("apple.png").getImage();
            g.drawImage(apple, appleX, appleY, this);

            for(int i=0; i<bodyParts; i++){
                if(i==0){
                    if(direction=='R'){
                        g.drawImage(head3, x[i], y[i], this);
                    }
                    else if(direction=='L'){
                        g.drawImage(head2, x[i], y[i], this);
                    }
                    else if(direction=='U'){
                        g.drawImage(head4, x[i], y[i], this);
                    }
                    else if(direction=='D'){
                        g.drawImage(head1, x[i], y[i], this);
                    }
                    // g.setColor(Color.GREEN);
                    // g.fill3DRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE, true);
                    // g.fillRoundRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE, 15, 15);
                    // g.drawImage(head1, x[i], y[i], this);
                }
                else{
                    if(Settings.c1==true){
                        g.setColor(Color.GREEN);
                        g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    }
                    else
                    if(Settings.c2==true){
                        g.setColor(Color.BLUE);
                        g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    }
                    else
                    if(Settings.c3==true){
                        g.setColor(Color.RED);
                        g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    }
                    else
                    if(Settings.c4==true){
                        g.setColor(Color.YELLOW);
                        g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    }
                    else
                    if(Settings.c5==true){
                        g.setColor(Color.ORANGE);
                        g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    }
                    else
                    if(Settings.c6==true){
                        g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
                        g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    }
                    else
                    {
                        g.setColor(Color.GREEN);
                        g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    }
                }
            }
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: "+applesEaten,(SCREEN_WIDTH-metrics.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
        }
        else{
            gameOver(g);
        }
    }
    public void newApple(){
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }
    public void move(){
        for(int i=bodyParts; i>0; i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        switch(direction){
            case 'U':
                y[0] -= UNIT_SIZE;
                break;
            case 'D':
                y[0] += UNIT_SIZE;
                break;
            case 'L':
                x[0] -= UNIT_SIZE;
                break;
            case 'R':
                x[0] += UNIT_SIZE;
                break;    
        }
    }
    public void checkApple(){
        if((x[0]==appleX) && (y[0]==appleY)){
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }
    public void checkCollisions(){
        //checks if head collides with body
        for(int i=bodyParts; i>0; i--){
            if((x[0]==x[i])&&(y[0]==y[i])){
                running = false;
            }
        }
        //checks if head touches left border
        if(x[0]<0){
            x[0]=SCREEN_WIDTH-UNIT_SIZE;
        }
        //checks if head touches right border
        if(x[0]>SCREEN_WIDTH-UNIT_SIZE){
            x[0]=0;
        }
        //checks if head touches top border
        if(y[0]<0){
            y[0]=SCREEN_HEIGHT-UNIT_SIZE;
        }
        //checks if head touches bottom border
        if(y[0]>SCREEN_HEIGHT-UNIT_SIZE){
            y[0]=0;
        }

        if(!running){
            timer.stop();
        }
    }
    public void gameOver(Graphics g){
        //Score
        g.setColor(Color.RED);
        g.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: "+applesEaten,(SCREEN_WIDTH-metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
        //Game Over Text
        g.setColor(Color.RED);
        g.setFont(new Font("Comic Sans MS", Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over",(SCREEN_WIDTH-metrics2.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(running){
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                if(direction!='R'){
                    direction = 'L';
                }
                break;
                case KeyEvent.VK_RIGHT:
                if(direction!='L'){
                    direction = 'R';
                }
                break;
                case KeyEvent.VK_UP:
                if(direction!='D'){
                    direction = 'U';
                }
                break;
                case KeyEvent.VK_DOWN:
                if(direction!='U'){
                    direction = 'D';
                }
                break;
                case KeyEvent.VK_A:
                if(direction!='R'){
                    direction = 'L';
                }
                break;
                case KeyEvent.VK_D:
                if(direction!='L'){
                    direction = 'R';
                }
                break;
                case KeyEvent.VK_W:
                if(direction!='D'){
                    direction = 'U';
                }
                break;
                case KeyEvent.VK_S:
                if(direction!='U'){
                    direction = 'D';
                }
                break;
            }
        }
    }
}    
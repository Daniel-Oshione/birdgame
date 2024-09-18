import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class bird extends JPanel implements ActionListener, KeyListener {
    int width = 1080;
    int height = 1080;

    //images part
    Image flappybgImg;
    Image flappybirdImg;
    Image pipeUpImg;
    Image pipeDownImg;

    //bird
    int birbX = width/8;
    int birbY = height/2;

    int birbWidth = 94;
    int birbHeight = 74;
    
    class BirbChar{
        int x = birbX;
        int y = birbY;
        int width = birbWidth;
        int height = birbHeight;
        Image img;

        BirbChar(Image img){
            this.img = img;
        }
    }
    //birb logic
    BirbChar birbChar;
    int velocityY = 0;
    int gravity = 1;


    Timer loopGame;

    bird(){
        setPreferredSize(new Dimension(width,height));
        // setBackground(Color.pink);

        //these two lines make the key event work for the birbclass
        setFocusable(true);
        addKeyListener(this);

        //import images
        flappybgImg = new ImageIcon("./flappybg.jpg").getImage();
        flappybirdImg = new ImageIcon("./chicken.png").getImage();
        pipeUpImg = new ImageIcon("./toppipe.png").getImage();
        pipeDownImg = new ImageIcon("./bottompipe.png").getImage();

        //birb
        birbChar = new BirbChar(flappybirdImg);

        //game timer
        loopGame = new Timer(1000/60, this);
        loopGame.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        System.out.println("sup");
        //background
        g.drawImage(flappybgImg, 0, 0, width, height, null);

        // brib
        g.drawImage(birbChar.img, birbChar.x, birbChar.y, birbChar.width, birbChar.height, null );
    }

    //birb movement
    public void move(){
        //birb
        velocityY += gravity;
        birbChar.y += velocityY;
        //to avoid moving outside screen
        birbChar.y = Math.max(birbChar.y, 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }



    @Override
    // to click on any key
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){
            velocityY = -15;
        }
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            velocityY = -15;
        }
    }
    @Override
    //to type in any key
    public void keyTyped(KeyEvent e) {}

    @Override
    // to listen for when pressed key is reeased
    public void keyReleased(KeyEvent e) {}
}

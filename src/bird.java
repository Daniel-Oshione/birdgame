import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class bird extends JPanel{
    int width = 1080;
    int height = 1080;

    //images part
    Image flappybgImg;
    Image flappybirdImg;
    Image pipeUpImg;
    Image pipeDownImg;


    bird(){
        setPreferredSize(new Dimension(width,height));
        // setBackground(Color.pink);

        //import images
        flappybgImg = new ImageIcon(getClass().getResource("./flappybg.png")).getImage();
        flappybirdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        pipeUpImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        pipeDownImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
    }

    
}

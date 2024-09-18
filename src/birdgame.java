import javax.swing.*;

public class birdgame{
    public static void main (String[] args){
     int width = 1080;
     int height = 1080;
     
     JFrame frame = new JFrame("Bird Game");
     frame.setSize(width, height);
     frame.setLocationRelativeTo(null);
     frame.setResizable(false);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     bird bird = new bird();
     frame.add(bird);
    //  frame.pack();
     frame.setVisible(true);
    }
}
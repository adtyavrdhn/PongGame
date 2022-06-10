
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame
{

  // instance of panel
  GamePanel panel;
  GameFrame()
  {
      // super("Ping Pong");
      panel = new GamePanel();
      // Setting sttributes of thr frame of our game
      this.add(panel); // adding our panel into the frame
      this.setTitle("Ping Pong Game: Aditya Vardhan"); // title on the frame
      this.setResizable(false); // we don't want people to resize the frame because we are using hard coded pixelated values
      this.setBackground(Color.CYAN);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X button -> close
      this.pack(); // this will make our frame adjust according to the size of the panel recieved into the frame
      this.setVisible(true); // makes the frame actually visible
      this.setLocationRelativeTo(null); // method to actually render the frame in the middle of the screen instead of the top left corner by default

  }  
}

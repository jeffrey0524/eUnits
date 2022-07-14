package game;

   import javax.swing.*;

import Final.object;

import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   
    public class MousePanel extends JPanel
   {
      private static final int FRAME = 800;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Timer t; 
      private Timer txt;

		//constructor   
       public MousePanel()
      {
    	   myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
           myBuffer = myImage.getGraphics();
           myBuffer.setColor(BACKGROUND);
           myBuffer.fillRect(0, 0, FRAME,FRAME);
           
           int xPos = (int)(Math.random()*(FRAME-100) + 50);
           int yPos = (int)(Math.random()*(FRAME-100)+ 50);
           object ob = new object();
           
           t = new Timer(5, new Listener());
           txt = new Timer(10, new Listenertxt());
           t.start();
           
           addMouseListener(new Mouse());
      }
       public void paintComponent(Graphics g)
      {
    	   g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       private class Listener implements ActionListener{
          public void actionPerformed(ActionEvent e){
        	  myBuffer.setColor(BACKGROUND);
              myBuffer.fillRect(0, 0, FRAME,FRAME);
              
              myBuffer.setColor(Color.black);
              myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
              myBuffer.drawString(" " , FRAME - 150, 25);
              
              repaint();
          }
      } 
       
       private class Listenertxt implements ActionListener{
           public void actionPerformed(ActionEvent e){
         	   
               myBuffer.setColor(Color.black);
               myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
               myBuffer.drawString(" " , FRAME - 150, 25);
               
               repaint();
           }
       } 
       
       private void collide(){
        
		}
      
       
       private class Mouse extends MouseAdapter{
       		public void mouseClicked(MouseEvent e) {
       			
       		}
       }
   }
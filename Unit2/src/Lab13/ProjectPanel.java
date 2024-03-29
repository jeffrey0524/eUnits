package Lab13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
 public class ProjectPanel extends JPanel
{
//constants
   private static final int FRAME = 400;   
   private static final Color BACKGROUND = new Color(204, 204, 204);
//fields
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Timer t1;
   private Timer t2;
   private int xPos, yPos;
   
    public ProjectPanel(){
    	xPos=50;
    	
      myImage =  new BufferedImage(700, 500, BufferedImage.TYPE_INT_RGB);
      myBuffer = (Graphics2D)myImage.getGraphics();
     
      t1 = new Timer(100, new Listener());
      t1.start();
      t2 = new Timer(4000, new Listener2());
   }
    
    public void paintComponent(Graphics g){
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
    
    private class Listener implements ActionListener{
       public void actionPerformed(ActionEvent e){
    	   ImageIcon thomas = new ImageIcon("src\\Lab02\\tj.jpg");
    	   //int xPoints[]= {xPos,xPos,xPos+50,xPos,xPos-50,xPos,xPos,xPos-50,xPos,xPos+50};
    	   //int yPoints[]= {yPos,yPos-500,yPos-500,yPos-500,yPos-500,yPos-500,yPos-500,yPos-500,yPos-500,yPos};
    	   myBuffer.setColor(Color.blue);
    	   myBuffer.fillRect(0, 0, 700, 360);
    	   myBuffer.drawImage(thomas.getImage(), xPos-45, 50,100, 125, null);
    	   
    	   myBuffer.fillRect(xPos-65, 150, 130, 70);
    	   myBuffer.setColor(Color.gray);
    	   myBuffer.fillRect(0, 360, 700, 500);
    	   myBuffer.setColor(Color.green);
    	   myBuffer.fillRect(xPos-20, yPos+150, 50, 200);
    	   myBuffer.fillRect(xPos-50, yPos+300, 50, 100);
    	   myBuffer.fillRect(xPos+10, yPos+300, 50, 100);
    	   myBuffer.setColor(Color.green.darker());
    	   myBuffer.fillRect(xPos+3, yPos+80, 10, 10);
    	   myBuffer.fillRect(xPos+23, yPos+80, 10, 10);
    	   myBuffer.fillRect(xPos+17, yPos+90, 10, 20);
    	   myBuffer.fillRect(xPos+7, yPos+100, 10, 20);
    	   myBuffer.fillRect(xPos+27, yPos+100, 10, 20);

    	   //myBuffer.drawPolyline(xPoints, yPoints, 10);
    	   if(xPos==200) {
    		   myBuffer.setColor(Color.BLACK);
    		   myBuffer.setFont(new Font("Monospaced",Font.PLAIN,20));
    		   myBuffer.drawString("怎樣使麻雀安靜下來?", 325, 100);
    		   myBuffer.drawOval(290, 65, 275, 60);
    		   t1.stop();
    		   t2.start();
    	   }else {
    		   xPos=xPos +5;
    	   }
         repaint();
      }
   }
    
    private class Listener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
     	  t2.stop();
     	 //myBuffer.setColor(Color.BLACK);
		   myBuffer.setFont(new Font("Monospaced",Font.BOLD | Font.ITALIC,30));
		   myBuffer.drawString("壓它一下!因為鴨雀無聲", 325, 250);
          repaint();
       }
    }
}
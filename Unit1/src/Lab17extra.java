	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
    public class Lab17extra
   {
       
       public static void main(String[] args)
      {

         Object[] maps = {"maze1","maze2","maze3" ,"maze4"};
         String filename = (String) JOptionPane.showInputDialog(null, "What robot world??",
             null, JOptionPane.QUESTION_MESSAGE, new ImageIcon(), maps, maps[0]);

         Display.openWorld("maps/"+filename+".map");
         Display.setSize(8, 8);
         Display.setSpeed(10);
         
         MazeEscaper2 p1 = new Republican2();
         MazeEscaper2 p2 = new Democrat2();
//         MazeEscaper2 p3 = new Independent();

         
         Thread t1 = new Thread(p1);
         Thread t2 = new Thread(p2);
//         Thread t3 = new Thread(p3);
      
         t1.start();
         t2.start();
//         t3.start();

      }
   }

	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.16.2003

   import edu.fcps.karel2.Display;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
	
    public class Lab18
   {
       public static void main(String[] args)
      {
    	   Object[] maps = {"map1","map2","map3"};
           String filename = (String) JOptionPane.showInputDialog(null, "What robot world??",
               null, JOptionPane.QUESTION_MESSAGE, new ImageIcon(), maps, maps[0]);
           
//         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/"+filename+".map");
         Display.setSize(8, 8);
         Display.setSpeed(10);
      
         Pirate karel = new Pirate();
         int totalBeepers = 0;
         int numOfBeepers = 0;
         while(numOfBeepers != 5)
         {
            karel.approachPile();
            numOfBeepers = karel.numOfBeepersInPile();
            totalBeepers += numOfBeepers;
            if(numOfBeepers != 5)
            {
               karel.turnAppropriately(numOfBeepers);
            }
         }
         System.out.println("Total beepers: " + totalBeepers);
      }
   }
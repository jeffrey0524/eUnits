  
   import edu.fcps.karel2.Display;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
    public class Lab07
   {
       public static void main(String[] args) 
      {
    	 Object[] maps = {"mountain1","mountain2","mountain3","hill1","hill2","hill3","step1","step2","step3"};
         String filename = (String)JOptionPane.showInputDialog(null, "What robot world??", 
        		 null, JOptionPane.QUESTION_MESSAGE,new ImageIcon(), maps, maps[0]);
         
         Object[] robottype = {"Climber","HillClimber","StepClimber"};
         String type = (String)JOptionPane.showInputDialog(null, "What type of climber?", 
        		 null, JOptionPane.QUESTION_MESSAGE,new ImageIcon(), robottype, robottype[0]);
         
         Object[] xpos = {"8","10","12"};
         String avenue =  (String)JOptionPane.showInputDialog(null, "What x-coordinate?", 
        		 null, JOptionPane.QUESTION_MESSAGE,new ImageIcon(), xpos, xpos[0]);
         
         int x = Integer.parseInt(avenue);
      
         Display.openWorld("maps/"+filename+".map");
         Display.setSize(17, 15);
         Display.setSpeed(10);
      
         if(type.equals("Climber"))
         {
            Mountain.explore( new Climber(x) );
         }
         else if(type.equals("HillClimber"))
         {
            Mountain.explore( new HillClimber(x) );
         }
         else if(type.equals("StepClimber"))
         {
            Mountain.explore( new StepClimber(x) );
         }
         else
         {
            System.out.println("Invalid robot type.");
         }
      }
   }
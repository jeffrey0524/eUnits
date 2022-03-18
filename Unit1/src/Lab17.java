	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
    public class Lab17
   {
       public static void escape_the_maze(MazeEscaper arg)
      {
         arg.walkDownCurrentSegment(); //you are not at the end at the start
         while(!arg.nextToABeeper()){
            arg.turnToTheNextSegment();
            arg.walkDownCurrentSegment();
         }
      }
       public static void main(String[] args)
      {

         Object[] maps = {"maze1","maze2","maze3" ,"maze4"};
         String filename = (String) JOptionPane.showInputDialog(null, "What robot world??",
             null, JOptionPane.QUESTION_MESSAGE, new ImageIcon(), maps, maps[0]);

//       String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/"+filename+".map");
         Display.setSize(8, 8);
         Display.setSpeed(10);
//		 escape_the_maze( new Democrat() );
         escape_the_maze( new Republican() );
//		 escape_the_maze( new Independent() );
      }
   }

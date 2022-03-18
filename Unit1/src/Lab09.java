import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Lab09 {

    public static void main(String[] args) {
    	Object[] maps = {"pile1","pile2","pile3"};
   	 	String filename = (String)JOptionPane.showInputDialog(null, "What robot world??", 
       		 null, JOptionPane.QUESTION_MESSAGE,new ImageIcon(), maps, maps[0]);
   	 	
        Display.openWorld("maps/" + filename + ".map");
        Display.setSize(10, 10);
        Display.setSpeed(10);
        
        Athlete player1 = new Athlete(1, 1, Display.EAST, 0);
        for (int k = 1 ; k < 10 ; k++) {
        	int count = player1.getBeepers();
        	while(player1.nextToABeeper()) {
        		player1.pickBeeper();
        	}
        	player1.putn(count);
        	player1.move();
        }
    }
}
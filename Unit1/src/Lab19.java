import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] maps = {"path1","path2","path3"};
        String filename = (String) JOptionPane.showInputDialog(null, "What robot world??",
            null, JOptionPane.QUESTION_MESSAGE, new ImageIcon(), maps, maps[0]);
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(10,10);
      Display.setSpeed(10);
   
      Dorothy p1 = new Dorothy(2,2);
      
      while(p1.findPath()) {
    	  p1.fllowPath();
      }
	}

}

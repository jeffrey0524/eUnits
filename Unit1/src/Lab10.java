import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Lab10 {
    public static void followWallsRight(Athlete arg) {
        while (!arg.nextToABeeper()) {
            if (arg.rightIsClear()) {
                arg.turnright();
                arg.move();
            }
            else if (arg.frontIsClear()) {
                arg.move();
            }
            else if (!arg.frontIsClear() && !arg.rightIsClear()) {
                arg.turnLeft();
            }
        }
    }
    public static void main(String[] args) {

        Object[] maps = {"maze1","maze2","maze3"};
        String filename = (String) JOptionPane.showInputDialog(null, "What robot world??",
          null, JOptionPane.QUESTION_MESSAGE, new ImageIcon(), maps, maps[0]);

        Display.openWorld("maps/" + filename + ".map");
        Display.setSize(10, 10);
        Display.setSpeed(10);

        Athlete player1 = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
        followWallsRight(player1);
    }
}
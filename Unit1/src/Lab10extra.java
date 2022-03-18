import edu.fcps.karel2.Display;
//import edu.fcps.karel2.Robot;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Lab10extra {
    public static void followWallsRight(Athlete arg , int big) {
        while (arg.getX()<=big ) {
        	//檢測迴圈
        	if(arg.nextToABeeper()&&arg.getX()<=big) {
        
        		int x = arg.getX();
        		int y = arg.getY();
        		arg.turnAround();
        		arg.move();
        		while(arg.nextToABeeper()&&arg.getX()<=big) {
        			arg.pickBeeper();
        			if (arg.leftIsClear()) {
        				arg.turnLeft();
        				arg.move();    
        			}
        			else if (arg.frontIsClear()) {
        				arg.move();
        			}
        			else if (arg.rightIsClear()) {
        				arg.turnRight();
            			arg.move();
            		} 
        			else{
        				arg.turnAround();
        				arg.move();
        			}
        			if(arg.getX()==x && arg.getY()==y) {
        				arg.move();
        				break;
        			}
        		}
        	}
//靠又行走
            if (arg.rightIsClear()) {
                arg.turnright();
                arg.putAndMove();
            }
            else if (arg.frontIsClear()) {
                arg.putAndMove();
            }
            else if (arg.leftIsClear()) {
                arg.turnLeft();
                arg.putAndMove();
            }
            else{
//走回頭路
                arg.turnAround();
                arg.move();
                while(arg.nextToABeeper()&&arg.getX()<=big) {
            		arg.pickBeeper();
            		if (arg.rightIsClear()) {
                        arg.turnright();
                        arg.move();
                    }
                    else if (arg.frontIsClear()) {
                        arg.move();
                    }
                    else if (arg.leftIsClear()) {
                        arg.turnLeft();
                        arg.move();                
                    }
                    else{
                        arg.turnAround();
                        arg.move();
                    }
            	}
//發現新路，放回beeper
                arg.turnAround();
                arg.move();
                arg.putBeeper();
                arg.turnAround();
                arg.move();
            }
        }
    }
    public static void followWallsRightextra(Athlete arg , int big) {
    	while (arg.getX()<=big ) {
    /*		if(arg.frontIsClear()&&arg.rightIsClear() || arg.frontIsClear()&&arg.leftIsClear() || arg.leftIsClear()&&arg.rightIsClear()) {
    			int x = arg.getX();
    			int y = arg.getY();
    			while(arg.nextToABeeper()&&arg.getX()<=big) {
    				arg.pickBeeper();
    				if (arg.leftIsClear()) {
    					arg.turnLeft();
    		        	arg.move();    
    				}
    				else if (arg.frontIsClear()) {
    					arg.move();
    				}
    				else if (arg.rightIsClear()) {
    					arg.turnRight();
    					arg.move();
    				}
    				else{
    					arg.turnAround();
    					arg.move();
    				}	
    				if(arg.getX()==x && arg.getY()==y) {
    					arg.move();
    					break;
    				}
    			}
    		}*/
    		if (arg.rightIsClear()) {
    			arg.turnright();
    			arg.putAndMove();
    		}
    		else if (arg.frontIsClear()) {
    			arg.putAndMove();
    		}
    		else if (arg.leftIsClear()) {
    			arg.turnLeft();
    			arg.putAndMove();
    		}
    		else{
    			arg.turnAround();
    			arg.move();
    			while(arg.nextToABeeper()&&arg.getX()<=big) {
    				arg.pickBeeper();
    				if (arg.rightIsClear()) {
    					arg.turnright();
    					arg.move();
    				}
    				else if (arg.frontIsClear()) {
    					arg.move();
    				}
    				else if (arg.leftIsClear()) {
    					arg.turnLeft();
    					arg.move();                
    				}
    				else{
    					arg.turnAround();
    					arg.move();
    				}
    			}
    			arg.turnAround();
    			arg.move();
    			arg.putBeeper();
    			arg.turnAround();
    			arg.move();
    		}
    	}
    }
    public static void followWallsRightuper(Athlete arg , int big) {
        while (arg.getY()<=big ) {
        	//檢測迴圈
        	if(arg.nextToABeeper()&&arg.getX()<=big) {
        		int x = arg.getX();
        		int y = arg.getY();
        		arg.turnAround();
        		arg.move();
        		while(arg.nextToABeeper()&&arg.getY()<=big) {
        			arg.pickBeeper();
        			if (arg.leftIsClear()) {
        				arg.turnLeft();
        				arg.move();    
        			}
        			else if (arg.frontIsClear()) {
        				arg.move();
        			}
        			else if (arg.rightIsClear()) {
        				arg.turnRight();
            			arg.move();
            		}
        			else{
        				arg.turnAround();
        				arg.move();
        			}	
        			if(arg.getX()==x && arg.getY()==y) {
        				arg.move();
        				break;
        			}
        		}
        	}
//靠又行走
            if (arg.rightIsClear()) {
                arg.turnright();
                arg.putAndMove();
            }
            else if (arg.frontIsClear()) {
                arg.putAndMove();
            }
            else if (arg.leftIsClear()) {
                arg.turnLeft();
                arg.putAndMove();
            }
            else{
//走回頭路
                arg.turnAround();
                arg.move();
                while(arg.nextToABeeper()&&arg.getY()<=big) {
            		arg.pickBeeper();
            		if (arg.rightIsClear()) {
                        arg.turnright();
                        arg.move();
                    }
                    else if (arg.frontIsClear()) {
                        arg.move();
                    }
                    else if (arg.leftIsClear()) {
                        arg.turnLeft();
                        arg.move();                
                    }
                    else{
                        arg.turnAround();
                        arg.move();
                    }
            	}
//發現新路，放回beeper
                arg.turnAround();
                arg.move();
                arg.putBeeper();
                arg.turnAround();
                arg.move();
            }
        }
    }
    public static void main(String[] args) {

        Object[] maps = {"maze1","maze2","maze3","maze9","maze10","maze11","maze1r","maze2r","maze3r"};
        String filename = (String) JOptionPane.showInputDialog(null, "What robot world??",
          null, JOptionPane.QUESTION_MESSAGE, new ImageIcon(), maps, maps[0]);

        Display.openWorld("maps/" + filename + ".map");
        Display.setSize(10, 10);
        Display.setSpeed(10);

        Athlete player1 = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
        if (filename=="maze1"||filename=="maze2"||filename=="maze3") {
        	followWallsRight(player1,6);
        }else if (filename=="maze9"||filename=="maze10"||filename=="maze11") {
        	followWallsRightextra(player1,9);
        }else if (filename=="maze1r"||filename=="maze2r"||filename=="maze3r") {
        	followWallsRightuper(player1,6);
        }else {
        	System.out.println("ERROR,How did you did that?");
        }
    }
}
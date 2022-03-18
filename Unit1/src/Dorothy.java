import edu.fcps.karel2.Display;

public class Dorothy extends Athlete {

	public Dorothy() {
		// TODO Auto-generated constructor stub
	}

	public Dorothy(int x, int y) {
		super(x, y,Display.EAST,0);
		// TODO Auto-generated constructor stub
	}

	public boolean findPath() {
		if(nextToABeeper() && !frontIsClear()) { //前有牆 所以站在beeper上
			//找左邊
			turnleft();
			move();
			if(nextToABeeper()) {
				return true;
			}
			turnAround();
			move();
			//找右邊
			move();
			if(nextToABeeper()) {
				return true;
			}
			turnAround();
			move();
			turnRight();
		}else { 
			//初始判斷
			if(nextToABeeper()) {
				return true;
			}
			//前無牆 無beeper 
			turnAround();
			move();
			//回定位找左邊
			turnright();
			move();
			if(nextToABeeper()) {
				return true;
			}
			//左邊無 回頭找右邊
			turnAround();
			move();
			move();
			if(nextToABeeper()) {
				return true;
			}
			turnAround();
			move();
			turnRight();
		}
		return false;
	}
	 public void fllowPath() {
		 //停在路徑最後一個beeper 沒撞牆就回頭 撞牆就不動
		 while(nextToABeeper() && frontIsClear()) {
			 move();
		 }
	 }
}

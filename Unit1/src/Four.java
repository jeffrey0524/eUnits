import edu.fcps.Digit;

public class Four extends Digit {

	public Four(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public void display() {
		segment1_Off();
		segment2_On();
		segment3_On();
		segment4_Off();
		segment5_Off();
		segment6_On();
		segment7_On();
	}
}

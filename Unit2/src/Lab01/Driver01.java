package Lab01;
import javax.swing.JFrame;

public class Driver01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab00");
		frame.setSize(400,400);//�����j�p
		frame.setLocation(250,250);//�����}�Ҧ�m
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel01());
		frame.setVisible(true);
	}
}
package Lab01;
import javax.swing.JFrame;

public class Driver01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab01");//標題
		frame.setSize(400,400);//視窗大小
		frame.setLocation(250,250);//視窗開啟位置
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel01());
		frame.setVisible(true);
	}
}
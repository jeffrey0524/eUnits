package Lab02;

import javax.swing.JFrame;
public class Driver02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab02");//標題
		frame.setSize(350,400);//視窗大小
		frame.setLocation(250,250);//視窗開啟位置
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//關掉視窗時要幹嘛
		frame.setContentPane(new Panel02());
		frame.setVisible(true);
	}
}
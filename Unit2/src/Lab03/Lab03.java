package Lab03;

import javax.swing.JFrame;

public class Lab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Lab03");//標題
		frame.setSize(400,400);//視窗大小
		frame.setLocation(250,250);//視窗開啟位置
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//關掉視窗時要幹嘛
		frame.setContentPane(new Panel03());
		frame.setVisible(true);
	}

}

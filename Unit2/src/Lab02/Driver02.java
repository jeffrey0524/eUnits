package Lab02;

import javax.swing.JFrame;
public class Driver02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab02");//���D
		frame.setSize(350,400);//�����j�p
		frame.setLocation(250,250);//�����}�Ҧ�m
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���������ɭn�F��
		frame.setContentPane(new Panel02());
		frame.setVisible(true);
	}
}
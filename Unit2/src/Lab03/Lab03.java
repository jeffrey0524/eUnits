package Lab03;

import javax.swing.JFrame;

public class Lab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Lab03");//���D
		frame.setSize(400,400);//�����j�p
		frame.setLocation(250,250);//�����}�Ҧ�m
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���������ɭn�F��
		frame.setContentPane(new Panel03());
		frame.setVisible(true);
	}

}

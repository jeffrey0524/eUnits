package Final;

import javax.swing.JFrame;

public class Snake {

    //�D�禡
    public static void main(String[] args) {
     //�Ыؤ@�ӷs�� JFrame
        JFrame frame = new JFrame("�g�Y�D");
        frame.add(new Panel());
        //�����ϥΪ̦ۤv�վ�����j�p
        frame.setResizable(false);
        //pack()��k�O�n�q��frame�N��ؤo�]�w���i�H�N�䤺���Ҧ�������]�_�Ӫ��j�p
        frame.pack();
        //�]�w null �������X�{�b��������
        frame.setLocationRelativeTo(null);
        //�]�w�ϥΪ��I���������������s�ɵ{�����檺�ާ@
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //�]�w�����i���A�@�w�n�]�w���F��
        frame.setVisible(true);
    }
}
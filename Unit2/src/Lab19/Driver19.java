package Lab19;

   //Torbert, e-mail: smtorbert@fcps.edu
	//version 6.17.2003

   import javax.swing.JFrame;
    public class Driver19
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Lab19");
         frame.setSize(400, 400);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new PrizePanel2());
         frame.setVisible(true);
      }
   }
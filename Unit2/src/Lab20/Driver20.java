package Lab20;

   //Torbert, e-mail: smtorbert@fcps.edu
	//version 6.17.2003

   import javax.swing.JFrame;
    public class Driver20
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Lab20");
         frame.setSize(800, 800);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new PrizePanel());
         frame.setVisible(true);
      }
   }
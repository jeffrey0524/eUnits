import edu.fcps.karel2.Display;

//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003

    public class Lab15
   {
       public static void main(String[] args)
      {
         Display.setSpeed(9);

         Dancer weismuller = new squaredancer(2);
         Dancer fraser = new linedancer(4);
         Dancer spitz = new breakdancer(6);
         Dancer phelps = new waltzer(8);
         Thread t1 = new Thread( weismuller );
         Thread t2 = new Thread( fraser );
         Thread t3 = new Thread( spitz );
         Thread t4 = new Thread( phelps );
         t1.start();
         t2.start();
         t3.start();
         t4.start();
      }
   }
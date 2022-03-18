   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.16.2003
	//updated 5.13.2009 mlbillington@fcps.edu

   public abstract class MazeEscaper2 extends Athlete  implements Runnable
   {
	   
      public MazeEscaper2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MazeEscaper2(int x, int y, int dir, int beepers) {
		super(x, y, dir, beepers);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void walkDownCurrentSegment();
      public abstract void turnToTheNextSegment();
      
      public void escape_the_maze()
      {
         walkDownCurrentSegment(); //you are not at the end at the start
         while(!nextToABeeper()){
            turnToTheNextSegment();
            walkDownCurrentSegment();
         }
      }
      
      public void run() {
      	  escape_the_maze();
        }
   }
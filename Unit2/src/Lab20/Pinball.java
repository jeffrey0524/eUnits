package Lab20;

import java.awt.Color;

import Lab14.Ball;
import Lab14.Polkadot;

public class Pinball extends Spot {
	private double dx;
	private double dy;
	private int rightEdge;
	private int bottomEdge;
	
	public Pinball() {
		super(200,200,10,Color.black);
		dx= Math.random() * 12 - 6;
		dy= Math.random() * 12 - 6;
	}
	 public Pinball(double x, double y, double dia, Color c){
        super(x, y, dia, c);
        dx = Math.random()* 12 - 6;
        dy = Math.random() * 12 - 6;
     }
	 
	//modifier methods 
     public void setdx(double x){
       dx = x;
    }
     public void setdy(double y){
       dy = y;
    }
     public void setbound(int a,int b){
    	 rightEdge = a;
    	 bottomEdge = b;
      }
     
   //accessor methods
     public double getdx()             
    {
       return dx;
    }
     public double getdy()
    {
       return dy;
    }
     
   //instance methods
     public void tick(){
    	 if(dx>50) {
    		 dx=dx*0.5;
    	 }
    	 if(dy>50) {
    		 dy=dy*0.5;
    	 }
       setX(getX()+ dx);                    // x = x + dx
      // check for left & right edge bounces
       if(getX() >= rightEdge - getRadius())     //hits the right edge
       {
          setX(rightEdge - getRadius());
          dx = dx * -1 * littlerandom(); 
          dy = dy * littlerandom();
       }
       else if(getX() <= getRadius())     //hits the right edge
       {
          setX(getRadius());
          dx = dx * -1 * littlerandom(); 
          dy = dy * littlerandom();
       }
       
       setY(getY()+ dy); 
       if (getY() >= bottomEdge - getRadius()){
      	 setY(bottomEdge - getRadius());
           dy = dy *-1 * littlerandom(); 
           dx = dx * littlerandom();
       }
       else if(getY() <=getRadius())     //hits the right edge
       {
          setY(getRadius());
          dy = dy * -1 * littlerandom(); 
          dx = dx * littlerandom();
       }
    }
     
     public double littlerandom()
     {
        return (Math.random()*2+0.5);
     }
     
	public boolean intersect(Prize p) {
		double dist = distance(getX(), getY(), p.getX(), p.getY());     
		return (dist < p.getRadius() + getRadius());
	}
	private double distance(double x1, double y1, double x2, double y2)
    {
       return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
     

}

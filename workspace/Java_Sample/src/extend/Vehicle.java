package extend;

public class Vehicle {
	  
	  protected int speed = 3;
	  
	  public int getSpeed(){
	    return speed;
	  }
	  public void setSpeed(int speed){
	    this.speed = speed;
	  }
	  
	  public void printspd() {
			System.out.println("Vehicle.java =>"+speed);
		}
}

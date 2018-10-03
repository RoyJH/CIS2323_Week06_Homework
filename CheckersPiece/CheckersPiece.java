package CheckersPiece;
import Board.*;

public class CheckersPiece{
	//Object Atrributes
	private int xPos;
	private int yPos;
	private String color;
	private String captured;
	private Boolean capture;
	//private Boolean cap;
	
	//Object Methods
	public void setPosition(int x, int y){
		xPos = x;
		yPos = y;
	}
	public int getx(){
		return xPos;
	}
	public int gety(){
		return yPos;
	}
	public void setColor(String c){
		color = c;
	}
	public String getColor(){
		return color;
	}
	public void setCaptive(Boolean cap){
		if (cap==true){
			captured="captured";
		}else{
			captured="free";
		}
	}
	public Boolean getCaptive(){
		return capture;
	}
	// public void setCaptured(String p){
		// if (capture==true){
			// p="True";
		// }else{
			// p="False";
		// }
	// }
	// public String getCaptured(){
		// return captured;
	// }
	// public Boolean getCaptive(){
		// return capture;
	// }
	public void printInfo(){
			System.out.println("The piece is " + captured + "\n"
			+ "its color is " + color + "\n"
			+ "and is located at " + xPos + ", " + yPos);
		}
}

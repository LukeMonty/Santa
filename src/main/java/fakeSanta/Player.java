package fakeSanta;

public class Player extends ObjectOnTile {

	private int xCoordinate;
	private int yCoordinate;
	private String displayPlayer;
	
	public Player(int xCo, int yCo) {
		this.xCoordinate = xCo;
		this.yCoordinate = yCo;
		this.displayPlayer = "P";
		
	}
	
	public String getPlayer() {
		return this.displayPlayer;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	@Override
	public String toString() {
		return "x";
	}
	
}

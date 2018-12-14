package fakeSanta;

public class Grotto extends ObjectOnTile {
	
	private int xCoordinate;
	private int yCoordinate;
	
	public Grotto(int yCo, int xCo) {
		this.xCoordinate = xCo;
		this.yCoordinate = yCo;
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

	
}

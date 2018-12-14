package fakeSanta;

public class Tile {
	
	public String display;
	private boolean hasObject = false;
	
	
	public boolean hasObject() {
		return hasObject;
	}


	public void setHasObject(boolean hasObject) {
		this.hasObject = hasObject;
	}


	@Override
	public String toString() {	
		return this.display;
	}

}

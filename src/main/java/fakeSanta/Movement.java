package fakeSanta;

public class Movement {
	

	//Player player = new Player(0,0);
	
	public void checkInput(String input, Player player) {
		if (input.equals("N")) {
			moveNorth(player);
		}
		else if (input.equals("S")) {
			moveSouth(player);
		}
		else if (input.equals("E")) {
			moveEast(player);
		}
		else if (input.equals("W")) {
			moveWest(player);
		}
	}
	
	public void moveNorth(Player player) {
		player.setxCoordinate(player.getxCoordinate() - 1);
	}
	public void moveSouth(Player player) {
		player.setxCoordinate(player.getxCoordinate() + 1);
	}
	public void moveEast(Player player) {
		player.setyCoordinate(player.getyCoordinate() + 1);
	}
	
	public void moveWest(Player player) {
		player.setyCoordinate(player.getyCoordinate() - 1);
	}
	
}

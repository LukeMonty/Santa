package fakeSanta;

import java.util.Random;

public class TerrainMap {

	private Tile[][] map = new Tile[10][10];

	public void generateMap() {

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				map[i][j] = new Tile();
				map[i][j].display = "0";
//				System.out.print(map[i][j] + "" + i + j +"]");
				// System.out.print(map[i][j].display+" ");
			}
			System.out.println();
		}
	}

	public void clearPlayer(Player player) {
		int tempX = player.getxCoordinate();
		int tempY = player.getyCoordinate();

		map[tempX][tempY].display = "0";

	}

	public void placeGrotto(Grotto grotto) {
		int tempX = grotto.getxCoordinate();
		int tempY = grotto.getyCoordinate();

		map[tempX][tempY].display = "G";

		map[tempX][tempY].setHasObject(true);

	}

	public void placePlayer(Player player) {
		int tempX = player.getxCoordinate();
		int tempY = player.getyCoordinate();

		map[tempX][tempY].display = "P";

		map[tempX][tempY].setHasObject(true);

	}

	public void printMap() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {

				System.out.print(map[i][j].display + " ");

				if (map[i][j].hasObject() == true) {
					map[i][j].toString();
				}

			}
			System.out.println();
		}

	}

}

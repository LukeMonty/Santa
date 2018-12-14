package fakeSanta;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		TerrainMap m = new TerrainMap();
		m.generateMap();

		//Scanner s = new Scanner(System.in);
		int xCo = 4;
		int yCo = 5;
		int gxCo = 2;
		int gyCo = 3;
		Player player = new Player(xCo, yCo);
		Grotto grotto = new Grotto(gxCo, gyCo);
		Movement move = new Movement();
		Window frame = new Window();
		
		
		m.placeGrotto(grotto);
		m.placePlayer(player);
		frame.displayJFrame(player, move, m);
		
		//while (xCo==4) {
			//System.out.println("Move? N,S,E,W!");
			
			//m.clearPlayer(player);
			//move.checkInput(s.nextLine(), player);
			
			//if(player.getxCoordinate() == grotto.getxCoordinate() && player.getyCoordinate() == grotto.getyCoordinate()) {
				
			//}
			//m.placePlayer(player);
			
			//updateMovement();
			
			//m.printMap();
			//}
	}
}

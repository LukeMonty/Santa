package fakeSanta;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Window {
	JFrame frame;

	public void framed(Player player) {
		// schedule this for the event dispatch thread (edt)
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// displayJFrame();
			}
		});
	}

	void displayJFrame(final Player player, final Movement move, final TerrainMap m) {
		frame = new JFrame("Fake Santa");

		// create our jbutton
		JButton showDialogButton = new JButton("North");
		JButton showDialogButton1 = new JButton("South");
		JButton showDialogButton2 = new JButton("East");
		JButton showDialogButton3 = new JButton("West");
		JButton showDialogButton4 = new JButton("Yes");
		JButton showDialogButton5 = new JButton("No");
		
		final JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("System", Font.ITALIC, 16));
		textArea.setEditable(false);
		textArea.setText(m.printMap().toString());
		
		
		// add the listener to the jbutton to handle the "pressed" event
		showDialogButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.clearPlayer(player);
				move.moveNorth(player);
				m.placePlayer(player);
				//m.printMap();
				textArea.setText(m.printMap().toString());
			}
		});

		showDialogButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.clearPlayer(player);
				move.moveSouth(player);
				m.placePlayer(player);
				//m.printMap();
				textArea.setText(m.printMap().toString());
			}
		});

		showDialogButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.clearPlayer(player);
				move.moveEast(player);
				m.placePlayer(player);
				//m.printMap();
				textArea.setText(m.printMap().toString());
			}
		});

		showDialogButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.clearPlayer(player);
				move.moveWest(player);
				m.placePlayer(player);
				//m.printMap();
				textArea.setText(m.printMap().toString());
			}
		});

		showDialogButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//yes
			}
		});
		
		showDialogButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//no
			}
		});
		
		
		// put the button on the frame
		frame.getContentPane().setLayout(new FlowLayout());
		frame.add(textArea);
		frame.add(showDialogButton);
		frame.add(showDialogButton1);
		frame.add(showDialogButton2);
		frame.add(showDialogButton3);
		frame.add(showDialogButton4);
		frame.add(showDialogButton5);


		// set up the jframe, then display it
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(100, 500));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
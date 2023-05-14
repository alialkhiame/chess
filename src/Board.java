import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board {
	static List<Spot> board = new ArrayList<>();
	private static JLabel[] labels = new JLabel[64];
	private static JFrame frame = new JFrame("chess");
	private static JPanel panel = new JPanel(new GridLayout(8, 8));
	private JLabel currentLabel;
	private JLabel droppedLabel;
	private static Spot into;
	private static Spot from;
	private static int boardCalled = 0;
	private int iq;
	private static Spot clickedSpot;

	public Board() {
		if (boardCalled == 0) {
			intallboard();
			boardCalled++;
		}

		for (int i = 0; i < 64; i++) {
			panel.add(board.get(i).getLabel());

			board.get(i).getLabel().addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					JLabel currentLabel = (JLabel) e.getSource();

					for (Spot spot : board) {
						if (spot.getLabel().equals(currentLabel)) {

							clickedSpot = spot; // assign clicked Spot
							break;
						}
					}
				}

				@Override
				public void mouseReleased(MouseEvent ew) {
					if (clickedSpot != null) {
						JLabel releasedLabel = (JLabel) ew.getSource();
						for (Spot spot : board) {

							if (spot.getLabel().equals(releasedLabel)) {

								Spot releasedSpot = spot;
								if (!clickedSpot.equals(releasedSpot)) {
									System.out.println("asd");
									board = Move.moveThis(board, clickedSpot, releasedSpot);
									System.out.println(clickedSpot.getPieceName() + "" + releasedSpot.getPieceName());
								}
								break;
							}
						}
						clickedSpot = null; // reset clicked Spot
					}
					repaintBoard();
				}
			});
		}
		frame.setSize(1250, 1240);
		frame.add(panel);
		frame.setVisible(true);

	}

	private void repaintBoard() {
		panel.removeAll();
		for (Spot spot : board) {
			spot.setlabel();
			panel.add(spot.getLabel());
		}
		panel.revalidate();
		panel.repaint();
	}

	public void intallboard() {

		for (int y = 0; y < 8; y++) {

			for (int x = 0; x < 8; x++) {
				Piece piece = null;
				String piceName = null;
				if (y == 6) {
					piece = new Bawn("Bawn");
					Spot ss = new Spot(piece, x, y, true, "Bawn");

					board.add(ss);
				}
				if (y == 1) {
					piece = new Bawn("Bawn");
					Spot ss = new Spot(piece, x, y, false, "Bawn");

					board.add(ss);
				}

				if (y == 0) {
					if (x == 0 || x == 7) {
						piceName = "Castel";
						piece = new Castel("Castel");
					}
					if (x == 1 || x == 6) {
						piceName = "Knight";
						piece = new Knight("Knight");
					}
					if (x == 2 || x == 5) {
						piceName = "Bishop";
						piece = new Bishop("Bishop");
					}
					if (x == 4) {
						piceName = "King";
						piece = new Queen("King");
					}
					if (x == 3) {
						piceName = "Queen";
						piece = new King("Queen");
					}
					Spot ss = new Spot(piece, x, y, false, piceName);

					board.add(ss);
				}

				if (y == 7) {
					if (x == 0 || x == 7) {
						piceName = "Castel";
						piece = new Castel("Castel");
					}
					if (x == 1 || x == 6) {
						piceName = "Knight";
						piece = new Knight("Knight");
					}
					if (x == 2 || x == 5) {
						piceName = "Bishop";
						piece = new Bishop("Bishop");
					}
					if (x == 4) {
						piceName = "King";
						piece = new Queen("King");
					}
					if (x == 3) {
						piceName = "Queen";
						piece = new King("Queen");
					}
					Spot ss = new Spot(piece, x, y, true, piceName);

					board.add(ss);
				}
				if (y != 1 && y != 0 && y != 6 && y != 7) {
					if ((x + y) % 2 == 0) {
						Spot ss = new Spot(piece, x, y, true, "w");

						board.add(ss);
					} else {
						Spot ss = new Spot(piece, x, y, false, "b");

						board.add(ss);
					}
				}
				labels[y * 8 + x] = board.get(y * 8 + x).getLabel();
			}
		}

	}
}

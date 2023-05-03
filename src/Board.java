import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board {
	static List<Spot> board = new ArrayList<>();
	JFrame frame = new JFrame("chess");
	JPanel panel = new JPanel(new GridLayout(8, 8));
	JLabel currentLabel;
	Point currentLocation;

	public Board() {
		intallboard();
		for (Spot s : board) {
			JLabel label = new JLabel();
			label.setOpaque(true);

			label.setIcon(s.getIcon());
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					currentLabel = (JLabel) e.getSource();
					currentLocation = e.getLocationOnScreen();
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					Point newLocation = e.getLocationOnScreen();
					int deltaX = newLocation.x - currentLocation.x;
					int deltaY = newLocation.y - currentLocation.y;
					for (Spot s : board) {
						Component c = panel.getComponentAt(s.getX() * 150, s.getY() * 150);
						if (c instanceof JLabel && c != currentLabel) {
							JLabel destinationLabel = (JLabel) c;
							if (destinationLabel.contains(e.getPoint())) {
								Piece pieceToMove = s.getPiece();

								s.setPiece((board.get(s.getX() * 8 + s.getY()).getPiece()));
								destinationLabel.setIcon(s.getIcon());
								break;
							}
						}
					}
				}
			});
			label.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					Point newLocation = e.getLocationOnScreen();
					int deltaX = newLocation.x - currentLocation.x;
					int deltaY = newLocation.y - currentLocation.y;
					int newX = currentLabel.getX() + deltaX;
					int newY = currentLabel.getY() + deltaY;
					currentLabel.setLocation(newX, newY);
					currentLocation = newLocation;
				}
			});

			panel.add(label);
		}
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1199, 1199);
	}

	public void refreshBoard() {
		panel.removeAll();
		for (Spot s : board) {
			JLabel label = new JLabel();
			label.setOpaque(true);
			label.setIcon(s.getIcon());
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					JLabel clickedLabel = (JLabel) e.getSource();
					System.out.println("Label x:" + clickedLabel.getX() + " y: " + clickedLabel.getY());
				}
			});
			panel.add(label);
		}
		panel.revalidate();
		panel.repaint();
		frame.repaint();
	}

	public void intallboard() {

		for (int y = 0; y < 8; y++) {

			for (int x = 0; x < 8; x++) {
				Piece piece = null;
				String piceName = null;
				if (y == 1) {
					piece = new Bawn("Bawn");
					board.add(new Spot(piece, x, y, true, "Bawn"));
				}
				if (y == 6) {
					piece = new Bawn("Bawn");
					board.add(new Spot(piece, x, y, false, "Bawn"));
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
					board.add(new Spot(piece, x, y, false, piceName));
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
					board.add(new Spot(piece, x, y, true, piceName));
				}
				if (y != 1 && y != 0 && y != 6 && y != 7) {
					if ((x + y) % 2 == 0) {
						board.add(new Spot(piece, x, y, true, "w"));
					} else {
						board.add(new Spot(piece, x, y, false, "b"));
					}
				}

			}
		}

	}
}

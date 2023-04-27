package oop;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main {
	static JPanel x = new JPanel(new GridLayout(8, 8));

	public static void main(String[] args) {
		System.out.println("wow");
		boolean whiteTurn = true;

		JFrame mainframe = new JFrame("Chess.Ali");
		refrechBoard();
		mainframe.add(x);
		mainframe.setSize(1400, 1400);
		mainframe.setVisible(true);
	}

	public static void refrechBoard() {
		Board s = new Board();
		for (int i = 0; i < 64; i++) {
			final int postion = i;
			JLabel label = new JLabel();
			if (s.board.get(i).icon != null) {
				label.setIcon(s.board.get(i).icon);
			}
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent me) {
					if (s.board.get(postion).isTaken && !s.board.get(postion).clicked) {
						s.board.get(postion).clicked = true;
						Piece pice = s.board.get(postion).getPiece();
						pice.setClicked(!pice.clicked);
						System.out.println(postion);
						label.setIcon(pice.getIcon());

					}
				}
			});
			x.add(label);
		}
	}

}
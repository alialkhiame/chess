package oop;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Board {

	public static ArrayList<Squar> board = new ArrayList<Squar>();

	public Board() {

		for (int i = 1; i < 65; i++) {

			int row = (i - 1) / 8 + 1;
			int col = (i - 1) % 8 + 1;
			boolean isWhitea = (row + col) % 2 == 0;

			Squar squar = new Squar();
			squar.squareId = i;
			if (isWhitea) {
				squar.squareColor = true;
				squar.icon = new ImageIcon("w.png");
			} else {
				squar.squareColor = false;
				squar.icon = new ImageIcon("b.png");
			}
			if (i > 8 && i < 17) {
				squar.isTaken = true;
				squar.icon = new ImageIcon("wBawn.png");
				squar.currentPiece = new Bawn();

			} else if (i > 48 && i < 57) {

				squar.isTaken = true;
				squar.currentPiece = new Bishop();
				squar.icon = new ImageIcon("bBawn.png");

			}

			if (i > 55 && i < 65) {

				squar.isTaken = true;

				if (i == 57 || i == 64) {
					squar.currentPiece = new Castel();
					squar.icon = new ImageIcon("bRook.png");
				}

				if (i == 59 || i == 62) {
					squar.currentPiece = new Bishop();
					squar.icon = new ImageIcon("bBishop.png");
				}

				if (i == 58 || i == 63) {
					squar.currentPiece = new Knight();
					squar.icon = new ImageIcon("bKnight.png");
				}

				if (i == 60) {
					squar.currentPiece = new Queen();
					squar.icon = new ImageIcon("bQueen.png");
				}

				if (i == 61) {
					squar.currentPiece = new King();
					squar.icon = new ImageIcon("bKing.png");
				}
			}

			if (i > 0 && i < 9) {
				squar.isTaken = true;
				if (i == 1 || i == 8) {
					squar.currentPiece = new Castel();
					squar.icon = new ImageIcon("wRook.png");

				}
				if (i == 3 || i == 6) {
					squar.currentPiece = new Bishop();
					squar.icon = new ImageIcon("wBishop.png");
				}

				if (i == 2 || i == 7) {
					squar.currentPiece = new Knight();
					squar.icon = new ImageIcon("wKnight.png");
				}

				if (i == 4) {
					squar.currentPiece = new Queen();
					squar.icon = new ImageIcon("wQueen.png");
				}

				if (i == 5) {
					squar.currentPiece = new King();
					squar.icon = new ImageIcon("wKing.png");
				}

			}
			board.add(squar);
		}

	}

}

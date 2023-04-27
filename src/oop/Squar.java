package oop;

import javax.swing.ImageIcon;

public class Squar {

	public int squareId;

	public boolean squareColor;

	public boolean isTaken;
	public boolean clicked;

	public ImageIcon icon;

	public Piece currentPiece;

	public Piece getPiece() {
		return this.currentPiece;
	}
}

package oop;

import javax.swing.ImageIcon;

public class Queen implements Piece {
	public ImageIcon whiteIcon = new ImageIcon("wQueen.png");
	public ImageIcon whiteIconClicked = new ImageIcon("wQueenClicked.png");

	ImageIcon blackIcon = new ImageIcon("bQueen.png");
	ImageIcon blackIconClicked = new ImageIcon("bQueenClicked.png");

	@Override
	public ImageIcon getIcon() {
		if (clicked) {
			if (color) {
				return whiteIconClicked;
			} else {
				return blackIconClicked;
			}
		}
		if (!clicked) {
			if (color)
				return whiteIcon;
			else
				return blackIcon;
		}
		return blackIcon;
	}

	boolean color;

	@Override
	public void setClicked(boolean color) {
		// TODO Auto-generated method stub
		this.color = color;

	}
}

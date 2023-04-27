package oop;

import javax.swing.ImageIcon;

public class King implements Piece {
	public ImageIcon whiteIcon = new ImageIcon("wKing.png");
	public ImageIcon whiteIconClicked = new ImageIcon("wKingClicked.png");

	ImageIcon blackIcon = new ImageIcon("bKing.png");
	ImageIcon blackIconClicked = new ImageIcon("bKingClicked.png");

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

package oop;

import javax.swing.ImageIcon;

public class Knight implements Piece {

	public ImageIcon whiteIcon = new ImageIcon("wKnight.png");
	public ImageIcon whiteIconClicked = new ImageIcon("wKnightClicked.png");

	ImageIcon blackIcon = new ImageIcon("bKnight.png");
	ImageIcon blackIconClicked = new ImageIcon("bKnightClicked.png");

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

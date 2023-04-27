package oop;

import javax.swing.ImageIcon;

public class Bishop implements Piece {
	public ImageIcon whiteIcon = new ImageIcon("wBishop.png");
	public ImageIcon whiteIconClicked = new ImageIcon("wBishopClicked.png");

	ImageIcon blackIcon = new ImageIcon("bBishop.png");
	ImageIcon blackIconClicked = new ImageIcon("bBishopClicked.png");

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

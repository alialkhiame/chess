package oop;

import javax.swing.ImageIcon;

public class Castel implements Piece {
	public ImageIcon whiteIcon = new ImageIcon("wRook.png");
	public ImageIcon whiteIconClicked = new ImageIcon("wRookClicked.png");

	ImageIcon blackIcon = new ImageIcon("bRook.png");
	ImageIcon blackIconClicked = new ImageIcon("bRookClicked.png");

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

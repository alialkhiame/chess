package oop;

import javax.swing.ImageIcon;

public class Bawn implements Piece {
	public ImageIcon whiteIcon = new ImageIcon("wBawn.png");
	public ImageIcon whiteIconClicked = new ImageIcon("wBawnClicked.png");

	ImageIcon blackIcon = new ImageIcon("bBawn.png");
	ImageIcon blackIconClicked = new ImageIcon("bBawnClicked.png");

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

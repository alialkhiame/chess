package oop;

import javax.swing.ImageIcon;

public interface Piece {

	public boolean color = false;
	public boolean clicked = false;
	ImageIcon whiteIcon = new ImageIcon();
	ImageIcon blackIcon = new ImageIcon();
	ImageIcon blackIconClicked = new ImageIcon();
	ImageIcon whiteIconClicked = new ImageIcon();

	public abstract ImageIcon getIcon();

	public abstract void setClicked(boolean color);
}

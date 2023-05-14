import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Spot {
	private Piece piece;
	private int x;
	private int y;
	private String pieceName;
	private boolean color;
	private ImageIcon icon = new ImageIcon();
	private JLabel label = new JLabel();
	boolean taken = false;
	private boolean squareColor = isSquareColor();

	public boolean isSquareColor() {
		return squareColor;
	}

	private void setSquareColor(boolean squareColor) {
		this.squareColor = squareColor;
	}

	public Spot() {
		this.piece = null;
		this.pieceName = null;
		taken = false;
		if (this.squareColor) {
			this.icon = new ImageIcon("w.png");
		} else {
			this.icon = new ImageIcon("b.png");
		}
		this.label = new JLabel();
		this.label.setIcon(this.icon);

	}

	public String getPieceName() {
		return this.pieceName;
	}

	public void setPieceName(String piceName) {

		this.pieceName = piceName;
	}

	public boolean isColor() {
		return this.color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public ImageIcon getIcon() {
		return this.icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public JLabel getLabel() {
		if (this.label == null) {
			setlabel();
		}

		return this.label;
	}

	public void setLabel(JLabel label) {

		this.label = label;
		setlabel();
	}

	public Spot(int x, int y, Piece piece) {
		if ((x + y) % 2 == 0) {
			setSquareColor(true);
		} else {
			setSquareColor(false);
		}
		this.setPiece(piece);
		this.setX(x);
		this.setY(y);
	}

	public Spot(Piece piece, int x, int y, boolean color, String pieceName) {
		if ((x + y) % 2 == 0) {
			setSquareColor(true);
		} else {
			setSquareColor(false);
		}
		this.taken = true;
		this.piece = piece;
		this.x = x;
		this.y = y;
		this.color = color;
		this.pieceName = pieceName;
		setlabel();
	}

	public void setlabel() {
		this.taken = false;
		if (this.pieceName == null) {
			if (this.squareColor) {
				this.icon = new ImageIcon("w.png");
				this.pieceName = "w";
			} else {
				this.icon = new ImageIcon("b.png");
				this.pieceName = "b";
			}
			this.label = new JLabel();
			this.label.setIcon(this.icon);
		}
		if (this.pieceName.equals("w") || this.pieceName.equals("b")) {
			this.icon = new ImageIcon(this.pieceName + ".png");

			this.label.setOpaque(true);
			this.label.setIcon(this.icon);
			return;
		}
		if (this.color && !this.pieceName.equals("w") && !this.pieceName.equals("b")) {
			this.taken = true;
			if (this.pieceName.equals("Castel")) {
				this.icon = new ImageIcon("wCastel.png");
			}
			if (this.pieceName.equals("Bawn")) {
				this.icon = new ImageIcon("wBawn.png");
			}
			if (this.pieceName.equals("Knight")) {
				this.icon = new ImageIcon("wKnight.png");
			}
			if (this.pieceName.equals("Bishop")) {
				this.icon = new ImageIcon("wBishop.png");
			}
			if (this.pieceName.equals("Queen")) {
				this.icon = new ImageIcon("wQueen.png");
			}
			if (this.pieceName.equals("King")) {
				this.icon = new ImageIcon("wKing.png");
			}
		} else {
			if (!this.pieceName.equals("w") && !this.pieceName.equals("b")) {
				this.taken = true;
				if (this.pieceName.equals("Castel")) {
					this.icon = new ImageIcon("bCastel.png");
				}
				if (this.pieceName.equals("Bawn")) {
					this.icon = new ImageIcon("bBawn.png");
				}
				if (this.pieceName.equals("Knight")) {
					this.icon = new ImageIcon("bKnight.png");
				}
				if (this.pieceName.equals("Bishop")) {
					this.icon = new ImageIcon("bBishop.png");
				}
				if (this.pieceName.equals("Queen")) {
					this.icon = new ImageIcon("bQueen.png");
				}
				if (this.pieceName.equals("King")) {
					this.icon = new ImageIcon("bKing.png");
				}
			}
		}
		this.label.setOpaque(true);
		this.label.setIcon(this.icon);

	}

	public Piece getPiece() {
		return this.piece;
	}

	public void setPiece(Piece p) {
		if (p != null) {
			this.taken = true;
			this.piece = p;
		} else {
			this.taken = false;
			this.piece = p;
			setPieceName();
		}

	}

	private void setPieceName() {
		// TODO Auto-generated method stub
		System.out.println();
		this.taken = false;
		if (this.pieceName == null) {
			if (this.squareColor) {
				this.icon = new ImageIcon("w.png");
				this.pieceName = "w";
			} else {
				this.icon = new ImageIcon("b.png");
				this.pieceName = "b";
			}
			this.label = new JLabel();
			this.label.setIcon(this.icon);
		}

	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void flush(Spot x) {
		// TODO Auto-generated method stub

		x.taken = false;
		x.pieceName = null;
		if (x.squareColor) {
			x.icon = new ImageIcon("w.png");
			x.pieceName = "w";
		} else {
			x.icon = new ImageIcon("b.png");
			x.pieceName = "b";
		}
		x.label = new JLabel();
		x.label.setIcon(x.icon);

	}

}

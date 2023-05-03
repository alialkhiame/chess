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

	public String getPieceName() {
		return pieceName;
	}

	public void setPieceName(String piceName) {

		this.pieceName = piceName;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		color = color;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public Spot(int x, int y, Piece piece) {
		this.setPiece(piece);
		this.setX(x);
		this.setY(y);
	}

	public Spot(Piece piece, int x, int y, boolean color, String pieceName) {
		this.piece = piece;
		this.x = x;
		this.y = y;
		this.color = color;
		this.pieceName = pieceName;
		setlabel();
	}

	public void setlabel() {
		if (pieceName.equals("w") || pieceName.equals("b")) {
			this.icon = new ImageIcon(pieceName + ".png");

			this.label.setOpaque(true);
			label.setIcon(this.icon);
			return;
		}
		if (this.color && !pieceName.equals("w") && !pieceName.equals("b")) {
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
		} else if (!pieceName.equals("w") && !pieceName.equals("b")) {
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
		this.label.setOpaque(true);
		label.setIcon(this.icon);

	}

	public Piece getPiece() {
		return this.piece;
	}

	public void setPiece(Piece p) {
		this.piece = p;
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

}

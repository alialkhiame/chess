
public class Piece {
	boolean color;
	String name;

	public Piece(String name) {
		this.name = name;
	}

	public String setName() {
		if (color)
			return "w" + this.name;

		if (!color)
			return "b" + this.name;
		return this.name;
	}

}

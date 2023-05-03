public class King extends Piece {
	String name = setName();
	boolean color;

	public King(String string) {
		super(string);

	}

	public static boolean kingIsInDanger(Spot old, Spot newSpot) {

		if (engen.move(old, newSpot)) {
			return false;

		} else {
			return true;
		}

	}

}

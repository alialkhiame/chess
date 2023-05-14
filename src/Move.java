import java.util.List;

public class Move {

	public boolean moveIsValid(List<Spot> board, Spot x, Spot y) {

		return true;
	}

	public static List<Spot> moveThis(List<Spot> board, Spot x, Spot y) {

		for (int i = 0; i < 64; i++) {
			boolean ok = false;
			if (board.get(i).equals(y)) {
				ok = true;

				board.set(i, y);

			}
			if (ok)
				if (board.get(i).equals(x)) {
					Spot.flush(x);
				}

		}

		return board;
	}

}

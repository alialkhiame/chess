
public class Bawn extends Piece {

	boolean color;

	public Bawn(String string) {
		super(string);

	}

	/*
	 * public boolean isValidMove(int startX, int startY, int endX, int endY) { //
	 * check if the destination is outside the board if (endX < 0 || endX > 7 ||
	 * endY < 0 || endY > 7) { return false; }
	 * 
	 * // check if the destination is occupied by a friendly piece Piece endPiece =
	 * board.getPiece(endX, endY); if (endPiece != null && endPiece.getColor() ==
	 * this.getColor()) { return false; }
	 * 
	 * // calculate the direction of the move int direction = (this.getColor() ==
	 * PieceColor.WHITE) ? -1 : 1;
	 * 
	 * // check if the move is a capture if (startX != endX && endPiece != null) {
	 * // diagonal capture return (endY == startY + direction && Math.abs(endX -
	 * startX) == 1); } else if (startX == endX) { // check if the move is a single
	 * step forward if (endPiece == null) { return (endY == startY + direction); }
	 * else { return false; } } else { // invalid move return false; } }
	 * 
	 */
}

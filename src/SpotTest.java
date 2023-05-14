import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.junit.Test;

public class SpotTest {

	@Test
	public void testSetPieceName() {
		Spot spot = new Spot();
		spot.setPieceName("King");
		assertEquals("King", spot.getPieceName());
	}

	@Test
	public void testSetColor() {
		Spot spot = new Spot();
		spot.setColor(true);
		assertTrue(spot.isColor());
	}

	@Test
	public void testSetIcon() {
		Spot spot = new Spot();
		ImageIcon icon = new ImageIcon("king.png");
		spot.setIcon(icon);
		assertEquals(icon, spot.getIcon());
	}

	@Test
	public void testSetPiece() {
		Spot spot = new Spot();
		Piece piece = new Piece("Bawn");
		spot.setPiece(piece);
		assertEquals(piece, spot.getPiece());
	}

	@Test
	public void testSetX() {
		Spot spot = new Spot();
		spot.setX(3);
		assertEquals(3, spot.getX());
	}

	@Test
	public void testSetY() {
		Spot spot = new Spot();
		spot.setY(4);
		assertEquals(4, spot.getY());
	}

	@Test
	public void testDefaultConstructor() {
		Spot spot = new Spot();
		assertEquals(null, spot.getPieceName());
		assertEquals(false, spot.isColor());
		assertEquals(spot.getIcon().getImage(), spot.getIcon().getImage());

		assertEquals(false, spot.taken);
	}

	@Test
	public void testGettersAndSetters() {
		Spot spot = new Spot();
		ImageIcon icon = new ImageIcon("bQueen.png");
		JLabel label = new JLabel();
		label.setIcon(icon);

		spot.setPieceName("Queen");
		assertEquals("Queen", spot.getPieceName());

		spot.setColor(true);
		assertEquals(true, spot.isColor());

		spot.setIcon(icon);
		assertEquals(icon.getImage(), spot.getIcon().getImage());

	}

	@Test
	public void testConstructorWithCoordinatesAndPiece() {
		Piece piece = new Piece("King");
		Spot spot = new Spot(2, 3, piece);
		assertEquals(piece, spot.getPiece());
		assertEquals(2, spot.getX());
		assertEquals(3, spot.getY());
		assertEquals(true, spot.taken);
	}

	@Test
	public void testConstructorWithCoordinatesAndPiece2() {
		Piece piece = new Piece("King");
		Spot spot = new Spot(piece, 0, 0, true, "King");
		assertEquals(piece, spot.getPiece());
		assertEquals(0, spot.getX());
		assertEquals(0, spot.getY());
		assertEquals(true, spot.taken);
		assertEquals(true, spot.isColor());
		flush(spot);
	}
}

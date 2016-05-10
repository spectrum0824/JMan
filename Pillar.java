import java.awt.*;
/**
 * subclass of Piece
 * @author Tanapon Meesat
 *
 */
public class Pillar extends Piece {
	/**
	 * Constructor that has coordinate and color(int) and map m to set
	 */
	public Pillar(int x, int y, int c, Map m) {
		super(Piece.PILLAR, m);
		this.setX(x);
		this.setY(y);
		if (c == 0) {
			this.setColor(Color.RED);
		} else if (c == 1) {
			this.setColor(Color.GREEN);
		} else {
			this.setColor(Color.YELLOW);
		}
	}
	/**
	 * Constructor that has coordinate and color(Color) and map m to set
	 */
	public Pillar(int x, int y, Color c, Map m) {
		super(Piece.PILLAR, m);
		this.setX(x);
		this.setY(y);
		this.setColor(c);
	}
	/**
	 * Behavior of Pillar
	 * 2/3 of time, do nothing
	 * 1/3 of time, change color randomly
	 */
	public void act() {
		int randomLength = rand(1,9);
		if (!this.hasActed() && randomLength < 4) {
			if (randomLength == 1) {
				this.setColor(Color.RED);
			} else if (randomLength == 2) {
				this.setColor(Color.GREEN);
			} else {
				this.setColor(Color.YELLOW);
			}
		}
		this.setActed(true);
		
	}
	/**
	 * @return String return coordinate and color
	 */
	public String toString() {
		return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
	}
} 
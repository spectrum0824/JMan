import java.awt.*;
/**
 * subclass of Piece
 * @author Tanapon Meesat
 *
 */
public class Walker extends Piece {
	/**
	 * Constructor that has coordinate and color(int) and map m to set
	 */
	public Walker(int x, int y, int c, Map m) {
		super(Piece.WALKER, m);
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
	 * Constructor that has coordinate and color(Color) and map m
	 */
	public Walker(int x, int y, Color c, Map m) {
		super(Piece.WALKER, m);
		this.setX(x);
		this.setY(y);
		this.setColor(c);
	}
	/**
	 * Behavior of Walker
	 * 2/3 of time, do nothing
	 * 1/3 of time, change color randomly
	 */
	public void act() {
		int randomLength = rand(1, 12);
		if (!hasActed() && randomLength < 5) {
			if (randomLength == 1) {
				if (getMap().isEmpty(getX() - 1, getY())) {
					getMap().move(getX(), getY(), getX() - 1, getY());
				}
			} else if (randomLength == 2) {
				if (getMap().isEmpty(getX() + 1, getY())) {
					getMap().move(getX(), getY(), getX() + 1, getY());
				}

			} else if (randomLength == 3) {
				if (getMap().isEmpty(getX(), getY() + 1)) {
					getMap().move(getX(), getY(), getX(), getY() + 1);
				}
			} else {
				if (getMap().isEmpty(getX(), getY() - 1)) {
					getMap().move(getX(), getY(), getX(), getY() - 1);
				}
			}
		}
		this.setActed(true);
	}
	/**
	 * @return String return coordinate and color
	 */
	public String toString() {
		return getColorWord() + " Walker at (" + getX() + ", " + getY() + ")";
	}
}
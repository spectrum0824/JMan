import java.awt.*;
/**
 * subclass of Piece
 * @author Tanapon Meesat
 */
public class Block extends Piece{
	/**
	 * Constructor that has coordinate and map m to set
	 */
	public Block(int x, int y, Map m) {
		super(Piece.BLOCK, m);
		this.setX(x);
		this.setY(y);
		this.setColor(Color.WHITE);
	}
/**
 * block does nothing
 */
	public void act() {
		this.setActed(true);
	}
/**
 * @return String return coordinate and color
 */
	public String toString() {
		return getColorWord() + " Block at (" + getX() + ", " + getY() + ")";
	}
}
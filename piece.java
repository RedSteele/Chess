import java.awt.image.BufferedImage;

public abstract class Piece {
	
	public String color;
	private boolean isWhite; 
	public boolean hasMoved;
	public boolean ep_able;

	private BufferedImage image;
	
	
	public Piece(boolean isWhite) {
		this.isWhite = isWhite;
		image = ChessApplet.getImage(this);
	}


	public void draw(Graphics g, Dimension dim) {
		g.drawImage(image, 0, 0, (int)dim.getWidth(), (int)dim.getHeight(), null);
	}


	/**
	 * draw
	 * 		paint the piece to the screen, must be called from the paint
	 * 		method of a Graphic object
	 * @param g   - the drawing context
	 * @param dim - dimensions of the containing Square
	 */
	public boolean isWhite() {
		return isWhite;
	}


	/**
	 * Gets the color
	 * @return color of the piece
	 */
	public abstract String getColor();
	
	/**
	 * Moves the piece 
	 * 
	 * @return true if the move was valid or not.
	 */
	public abstract boolean validateMove(Piece[][] board, int currentRow, int currentCol, int newRow, int newCol);



}

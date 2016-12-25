package graphical_Othello;

/**
 * A move is an immutable object representing the coordinates where the play must be made. 
 * 
 * @author babak 
 * @version assign2
 */
public class Move {
    private final int row, col;

    /**
     * initialize a move at coordinates 0, 0
     */
    public Move() {
        this(0,0);
    }

    /**
     * initialize a move at the supplied coordinates
     */
    public Move(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    /** return the row */
    public int getRow() {
        return row;
    }
    
    /** return the column */
    public int getCol() {
        return col;
    }
}
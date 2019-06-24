import javax.swing.JPanel;
/**
 * This class represents a single cell in the gameboard. I duplicate it 42 times to create a full game-board.
 * @author galbt
 *
 */
public class Cell {
	/**
	 * Value points if the cell holds a disc or not. If it's 1, it has, 0 if not.
	 */
	private int value;
	/**
	 * Pan represents a visual description of a single cell in the gameboard. For each cell object, a gameboard object is attached.
	 */
	private GameBoard pan;
	
	public Cell(){
		super();
	}
	
	public Cell(int val,GameBoard pan){
		this.value = val;
		this.pan = pan;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public GameBoard getPan() {
		return pan;
	}

	public void setPan(GameBoard pan) {
		this.pan = pan;
	}	
}

import java.awt.*;
import javax.swing.*;

/**
 * This class represents a visual representation of a single cell in the game-board.
 * @author galbt
 *
 */
public class GameBoard extends JPanel {
	/**
	 * This attribute represnets a disk which inserted by Player 1 or Player 2 during the game.
	 */
	private JPanel p;

	
	private static final long serialVersionUID = 1L;
	
	public GameBoard() {
		super();
		this.setBackground(new Color(224,224,224));
	    this.setBorder(BorderFactory.createLineBorder(Color.black, 1, true)); 
		this.setVisible(true);	
	}

	public JPanel getP() {
		return p;
	}
	
	public void setPlayer(JPanel p) {
		this.p = p;
	}
}
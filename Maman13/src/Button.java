import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

/**
 * Visual representation of a single button in the 1-7 buttons and the "Clear" button in the gameboard.
 * @author galbt
 *
 */
public class Button extends JButton{
	
	private static final long serialVersionUID = 1L;

	public Button(String s) {
		super(s);
		this.setBackground(new Color(255,229,204));
		this.setFont(new Font("Arial",Font.ITALIC , 18));
	    this.setBorder(BorderFactory.createLineBorder(Color.black)); 
		this.repaint();	
	}
}

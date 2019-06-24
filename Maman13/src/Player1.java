import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 * This class represents the Player #1 in the game. It is added on a GameBoard panel object and paints a disk.
 * @author galbt
 *
 */
public class Player1 extends JPanel {
	
	public Player1() {
		super();
		this.setBackground(new Color(224,224,224));
		this.setSize(70,70);
		this.setLocation(20,3);
		this.setVisible(true);
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.black);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.fillOval(15, 25, 45, 45);
	}
	
}

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class OptionButton extends JButton {

	private static final long serialVersionUID = 1927220541060292283L;

	public OptionButton() {
		super();
		this.setBackground(new Color(100,150,204));
		this.setFont(new Font("Arial",Font.ITALIC , 18));
	    this.setBorder(BorderFactory.createLineBorder(Color.black)); 
	    this.setSize(200,50);
		this.repaint();					
	}
}

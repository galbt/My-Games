import java.awt.*;
import javax.swing.*;


public class QuestionLabel extends JLabel {

	private static final long serialVersionUID = 8810631239241755666L;

	public QuestionLabel() {	
		this.setBackground(new Color(255, 178, 102));
		this.setSize(new Dimension(400, 80));
		this.setLocation(200,-15);
		this.setLayout(new GridBagLayout());
		this.setFont(new Font("Arial",Font.ITALIC , 18));
		this.repaint();
		this.setVisible(true);				
	}	
}
import java.awt.GridLayout;

import javax.swing.JFrame;

public class TFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private final int BOUND = 1000;
	
	public TFrame() {
		super("Trivia");
		this.setBounds(400, 20, BOUND, BOUND);
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(new TPanel());
		this.setVisible(true);
	}
}

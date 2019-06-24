import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyTimer extends JPanel {

	private static final long serialVersionUID = 2932269884247040456L;
	static JLabel label = new JLabel("Time left: 15");
	private Timer timer;
	static int counter = 14;
	
	public MyTimer() {
			 
		label.setFont(new Font("Arial",Font.BOLD,17));
		label.setBackground(Color.BLACK);
		label.setSize(new Dimension(100,50));
		label.setLocation(28, 0);
		
		timer = new Timer(1000,new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(counter == 0) {
					timer.stop();
					JOptionPane.showMessageDialog(null,"Time's up!");
					TPanel.getQuestions().remove(0);
					TPanel.addQuestion(TPanel.getQuestions().get(0));
					timer.restart();				
					MyTimer.counter = 15;
				}
				label.setText("Time left: " +String.valueOf(counter));
				counter--;				
			}
		});	
		
		this.setLayout(null);
		this.setLocation(750,490);
		this.setSize(new Dimension(150,50));
		this.setBackground(new Color(255,102,102));
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		this.add(label);
		//createTimer();
		timer.start();
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer t) {
		this.timer = t;
	}
	

	public int getCounter() {
		return counter;
	}

}

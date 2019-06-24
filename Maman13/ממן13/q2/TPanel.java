import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TimerTask;

import javax.swing.*;


public class TPanel extends JPanel {
	private static final long serialVersionUID = -1618392050286050032L;
	private final int BOUND = 1000;
	private static ArrayList<Question> questions = new ArrayList<Question>();
	private JPanel questionP;
	private static QuestionLabel q;
	private static OptionButton optionA;
	private static OptionButton optionB;
	private static OptionButton optionC;
	private static OptionButton optionD;
	private static int score = 0;
	public MyTimer timer = new MyTimer();
	
	
	public TPanel() {
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		this.setSize(new Dimension(BOUND, BOUND));
		this.setVisible(true);
		
		
		questionP = new JPanel();
		questionP.setBackground(new Color(255, 178, 102));
		questionP.setLocation(250,18);
		questionP.setSize(new Dimension(500, 50));
		questionP.setBorder(BorderFactory.createRaisedBevelBorder());
			
		q = new QuestionLabel();
		optionA = new OptionButton();
		optionB = new OptionButton();
		optionC = new OptionButton();
		optionD = new OptionButton();
		
		JLabel scoreL = new JLabel("Score: "+String.valueOf(score));
		scoreL.setFont(new Font("Arial",Font.BOLD,17));
		scoreL.setSize(new Dimension(100,50));
		
		scoreL.setLocation(40,0);
		
		JPanel scoreP = new JPanel();
		scoreP.setLayout(null);
		scoreP.setBackground(new Color(178,255,102));
		scoreP.setSize(new Dimension(150,50));
		scoreP.setLocation(750, 250);
		scoreP.add(scoreL);
		scoreP.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		this.add(scoreP);
				
		optionA.setLocation(70,250);
		this.add(optionA);		
		optionB.setLocation(70, 330);
		this.add(optionB);		
		optionC.setLocation(70, 410);
		this.add(optionC);		
		optionD.setLocation(70, 490);
		this.add(optionD);
		
		this.readQuestion();		
		questionP.add(q);
		this.add(questionP);
		TPanel.addQuestion(TPanel.getQuestions().get(0));
		
		optionA.addMouseListener(new MouseListener() {

			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (optionA.getText() == getQuestions().get(0).getCorrectAnswer()) {
					JOptionPane.showMessageDialog(null,"Correct!");
					score += 10;
				}	
				else {
					JOptionPane.showMessageDialog(null,"Wrong answer");
					if (score >= 5) {
							score -= 5;
					}
				}
				setScore(scoreL,score);
				scoreL.repaint();
				try {
					getQuestions().remove(0);
					addQuestion(getQuestions().get(0));
				}
				catch (Exception ex) {
					int p = JOptionPane.showConfirmDialog(null,"The game has ended. Your final score is: "+score+"\nStart a new game?","", JOptionPane.YES_NO_OPTION);
					if (p != 0) {
						System.exit(0);
					}
					else {
						readQuestion();
						TPanel.addQuestion(TPanel.getQuestions().get(0));
					}
				}	
				timer.getTimer().restart();				
				MyTimer.counter = 15;
			}
		});
		
		optionB.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (optionB.getText() == getQuestions().get(0).getCorrectAnswer()) {
					JOptionPane.showMessageDialog(null,"Correct!");
					score += 10;
				}	
				else {
					JOptionPane.showMessageDialog(null,"Wrong answer");
					if (score >= 5) {
							score -= 5;
					}
				}
				setScore(scoreL,score);
				scoreL.repaint();
				try {
					getQuestions().remove(0);
					addQuestion(getQuestions().get(0));
				}
				catch (Exception ex) {
					int p = JOptionPane.showConfirmDialog(null,"The game has ended. Your final score is: "+score+"\nStart a new game?","", JOptionPane.YES_NO_OPTION);
					if (p != 0) {
						System.exit(0);
					}
					else {
						readQuestion();
						TPanel.addQuestion(TPanel.getQuestions().get(0));
					}
				}	
				timer.getTimer().restart();				
				MyTimer.counter = 15;
			}
		});
		
		optionC.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (optionC.getText() == getQuestions().get(0).getCorrectAnswer()) {
					JOptionPane.showMessageDialog(null,"Correct!");
					score += 10;
				}	
				else {
					JOptionPane.showMessageDialog(null,"Wrong answer");
					if (score >= 5) {
							score -= 5;
					}
				}
				setScore(scoreL,score);
				scoreL.repaint();
				try {
					getQuestions().remove(0);
					addQuestion(getQuestions().get(0));
				}
				catch (Exception ex) {
					int p = JOptionPane.showConfirmDialog(null,"The game has ended. Your final score is: "+score+"\nStart a new game?","", JOptionPane.YES_NO_OPTION);
					if (p != 0) {
						System.exit(0);
					}
					else {
						readQuestion();
						TPanel.addQuestion(TPanel.getQuestions().get(0));
					}
				}	
				timer.getTimer().restart();				
				MyTimer.counter = 15;
			}
		});
		
		optionD.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (optionD.getText() == getQuestions().get(0).getCorrectAnswer()) {
					JOptionPane.showMessageDialog(null,"Correct!");
					score += 10;
				}	
				else {
					JOptionPane.showMessageDialog(null,"Wrong answer");
					if (score >= 5) {
							score -= 5;
					}
				}
				setScore(scoreL,score);
				scoreL.repaint();
				try {
					getQuestions().remove(0);
					addQuestion(getQuestions().get(0));
				}
				catch (Exception ex) {
					int p = JOptionPane.showConfirmDialog(null,"The game has ended. Your final score is: "+score+"\nStart a new game?","", JOptionPane.YES_NO_OPTION);
					if (p != 0) {
						System.exit(0);
					}
					else {
						readQuestion();
						TPanel.addQuestion(TPanel.getQuestions().get(0));
					}
				}	
				timer.getTimer().restart();				
				MyTimer.counter = 15;
			}
		});		
		
		this.add(timer);
		
		JButton newGame = new JButton();
		newGame.setText("New game");
		newGame.setSize(new Dimension(150,70));
		newGame.setLocation(70, 750);
		newGame.setBackground(new Color(204,0,102));
		newGame.setFont(new Font("Arial",Font.BOLD,17));
		newGame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				score = 0;
				setScore(scoreL,score);
				readQuestion();
				TPanel.addQuestion(TPanel.getQuestions().get(0));
				
			}
		});
		this.add(newGame);
		
		JButton exitGame = new JButton();
		exitGame.setText("Exit game");
		exitGame.setSize(new Dimension(150,70));
		exitGame.setLocation(250,750);
		exitGame.setBackground(new Color(204,0,102));
		exitGame.setFont(new Font("Arial",Font.BOLD,17));
		exitGame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
				
			}
		});
		this.add(exitGame);
	}	
				
	public static ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		TPanel.questions = questions;
	}
				
	public void readQuestion() {
		String[] ans = new String[5];		
		try {
			Scanner reader = new Scanner(new File("trivia.txt"));
			while (reader.hasNext()) {
				for(int i=0;i<5;i++) {
					ans[i]=reader.nextLine();	
				}
				Question question = new Question(ans);
				questions.add(question);
				for (int i=0;i<TPanel.getQuestions().size();i++)
					Collections.shuffle(TPanel.getQuestions().get(i).getAnswers());
			}
		}
		catch(Exception e) {
			System.out.println("File not found");
		}		
		Collections.shuffle(getQuestions());
		this.repaint();
	}
		
	public static void addQuestion(Question ques) {
		q.setText(ques.getQuestion());
		optionA.setText(ques.getAnswers().get(0));
		optionB.setText(ques.getAnswers().get(1));
		optionC.setText(ques.getAnswers().get(2));
		optionD.setText(ques.getAnswers().get(3));
	}
	
	public void setScore(JLabel scoreL,int score) {
		scoreL.setText("Score: "+String.valueOf(score));
	}
	

	
}


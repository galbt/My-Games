import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Frame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private final int BOUND = 800;
	private Cell[][] board = new Cell[7][7];
	static int turn =1;

	
	public Frame () {
		super("Connect Four");
		this.setLayout(new GridLayout(8,7));
		this.setBounds(550, 100, BOUND, BOUND);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0;i<6;i++) {
			for (int j=0;j<7;j++) {
				GameBoard pan = new GameBoard();
				this.getBoard()[i][j] = new Cell(0,pan);
				this.add(pan);
			}			
		}
				
		Button button1 = new Button("1");
		Button button2 = new Button("2");
		Button button3 = new Button("3");
		Button button4 = new Button("4");
		Button button5 = new Button("5");
		Button button6 = new Button("6");
		Button button7 = new Button("7");
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		
		JLabel empty1 = new JLabel("");
		JLabel empty2 = new JLabel("");
		JLabel empty3 = new JLabel("");
		
		this.add(empty1);
		this.add(empty2);
		this.add(empty3);
				
		Button clear = new Button("Clear");
		clear.setBackground(new Color(255,204,153));
		clear.setFont(new Font("Arial",Font.ITALIC , 18));
		clear.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {

				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				clearBoard();
			}
		});
				
		this.add(clear);
		
		button1.addMouseListener(new MouseListener() {
		

			
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
				if (board[0][0].getValue()==1)
					JOptionPane.showMessageDialog(null,"This row is full. Please choose another row to make your move.");						
									
				for (int i=board[0].length-2;i>=0;i--) {
					if(board[i][0].getValue()==0) {
						board[i][0].setValue(1);
						if (turn == 1) {
							Player1 p1 = new Player1();
							board[i][0].getPan().add(p1);
							board[i][0].getPan().setPlayer(p1);
							turn = 2;
						}
						else {
							Player2 p2 = new Player2();
							board[i][0].getPan().add(p2);
							board[i][0].getPan().setPlayer(p2);
							turn = 1;
						}
						repaint();
						break;
					}
				}
				if (checkVictoryP1()) {
					JOptionPane.showMessageDialog(null,"Player 1 has won.");	
					clearBoard();
				}
				else if(checkVictoryP2()) {
					JOptionPane.showMessageDialog(null,"Player 2 has won.");
					clearBoard();					
				}
			}		
		});	
		button2.addMouseListener(new MouseListener() {
			
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
					if (board[0][1].getValue()==1)
						JOptionPane.showMessageDialog(null,"This row is full. Please choose another row to make your move.");						
										
					for (int i=board[1].length-2;i>=0;i--) {
						if(board[i][1].getValue()==0) {
							board[i][1].setValue(1);
							if (turn == 1) {
								Player1 p1 = new Player1();
								board[i][1].getPan().add(p1);
								board[i][1].getPan().setPlayer(p1);
								turn = 2;
							}
							else {
								Player2 p2 = new Player2();
								board[i][1].getPan().add(p2);
								board[i][1].getPan().setPlayer(p2);
								turn = 1;
							}
							repaint();
							break;
						}
					}
					if (checkVictoryP1()) {
						JOptionPane.showMessageDialog(null,"Player 1 has won.");
						clearBoard();
					}
					else if(checkVictoryP2()) {
						JOptionPane.showMessageDialog(null,"Player 2 has won.");
						clearBoard();
					}
			}							
		});
		button3.addMouseListener(new MouseListener() {

			
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
				if (board[0][2].getValue()==1)
					JOptionPane.showMessageDialog(null,"This row is full. Please choose another row to make your move.");						
									
				for (int i=board[2].length-2;i>=0;i--) {
					if(board[i][2].getValue()==0) {
						board[i][2].setValue(1);
						if (turn == 1) {
							Player1 p1 = new Player1();
							board[i][2].getPan().add(p1);
							board[i][2].getPan().setPlayer(p1);
							turn = 2;
						}
						else {
							Player2 p2 = new Player2();
							board[i][2].getPan().add(p2);
							board[i][2].getPan().setPlayer(p2);
							turn = 1;
						}
						repaint();
						break;
					}
				}
				if (checkVictoryP1()) {
					JOptionPane.showMessageDialog(null,"Player 1 has won.");
					clearBoard();
				}
				else if(checkVictoryP2()) {
					JOptionPane.showMessageDialog(null,"Player 2 has won.");
					clearBoard();
				}
			}									
		});
		button4.addMouseListener(new MouseListener() {
			
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
				if (board[0][3].getValue()==1)
					JOptionPane.showMessageDialog(null,"This row is full. Please choose another row to make your move.");						
									
				for (int i=board[3].length-2;i>=0;i--) {
					if(board[i][3].getValue()==0) {
						board[i][3].setValue(1);
						if (turn == 1) {
							Player1 p1 = new Player1();
							board[i][3].getPan().add(p1);
							board[i][3].getPan().setPlayer(p1);
							turn = 2;
						}
						else {
							Player2 p2 = new Player2();
							board[i][3].getPan().add(p2);
							board[i][3].getPan().setPlayer(p2);
							turn = 1;
						}
						repaint();
						break;
					}
				}
				if (checkVictoryP1()) {
					JOptionPane.showMessageDialog(null,"Player 1 has won.");
					clearBoard();
				}
				else if(checkVictoryP2()) {
					JOptionPane.showMessageDialog(null,"Player 2 has won.");
					clearBoard();
				}
		}
		});
		button5.addMouseListener(new MouseListener() {
			
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
				if (board[0][4].getValue()==1)
					JOptionPane.showMessageDialog(null,"This row is full. Please choose another row to make your move.");						
									
				for (int i=board[4].length-2;i>=0;i--) {
					if(board[i][4].getValue()==0) {
						board[i][4].setValue(1);
						if (turn == 1) {
							Player1 p1 = new Player1();
							board[i][4].getPan().add(p1);
							board[i][4].getPan().setPlayer(p1);
							turn = 2;
						}
						else {
							Player2 p2 = new Player2();
							board[i][4].getPan().add(p2);
							board[i][4].getPan().setPlayer(p2);
							turn = 1;
						}
						repaint();
						break;
					}
				}
				if (checkVictoryP1()) {
					JOptionPane.showMessageDialog(null,"Player 1 has won.");
					clearBoard();
				}
				else if(checkVictoryP2()) {
					JOptionPane.showMessageDialog(null,"Player 2 has won.");
					clearBoard();
				}
		}
		});
		button6.addMouseListener(new MouseListener() {
			
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
					if (board[0][5].getValue()==1)
						JOptionPane.showMessageDialog(null,"This row is full. Please choose another row to make your move.");						
										
					for (int i=board[5].length-2;i>=0;i--) {
						if(board[i][5].getValue()==0) {
							board[i][5].setValue(1);
							if (turn == 1) {
								Player1 p1 = new Player1();
								board[i][5].getPan().add(p1);
								board[i][5].getPan().setPlayer(p1);
								turn = 2;
							}
							else {
								Player2 p2 = new Player2();
								board[i][5].getPan().add(p2);
								board[i][5].getPan().setPlayer(p2);
								turn = 1;
							}
							repaint();
							break;
						}
					}
					if (checkVictoryP1()) {
						JOptionPane.showMessageDialog(null,"Player 1 has won.");
						clearBoard();
					}
					else if(checkVictoryP2()) {
						JOptionPane.showMessageDialog(null,"Player 2 has won.");
						clearBoard();
					}
			}
		});
		button7.addMouseListener(new MouseListener() {
			
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
				if (board[0][6].getValue()==1)
					JOptionPane.showMessageDialog(null,"This row is full. Please choose another row to make your move.");						
									
				for (int i=board[6].length-2;i>=0;i--) {
					if(board[i][6].getValue()==0) {
						board[i][6].setValue(1);
						if (turn == 1) {
							Player1 p1 = new Player1();
							board[i][6].getPan().add(p1);
							board[i][6].getPan().setPlayer(p1);
							turn = 2;
						}
						else {
							Player2 p2 = new Player2();
							board[i][6].getPan().add(p2);
							board[i][6].getPan().setPlayer(p2);
							turn = 1;
						}
						repaint();
						break;
					}
				}
				if (checkVictoryP1()) {
					JOptionPane.showMessageDialog(null,"Player 1 has won.");
					clearBoard();
				}
				else if(checkVictoryP2()) {
					JOptionPane.showMessageDialog(null,"Player 2 has won.");
					clearBoard();
				}
		}
		});
		
		this.repaint();
		this.setVisible(true);	
		JOptionPane.showMessageDialog(null,"Player 1 is the black color. Player 2 is the white color.");
	}
	
	public Cell[][] getBoard() {
		return board;
	}
	
	public void clearBoard() {
		for(int i=getBoard().length-2;i>=0;i--) {
			for (int j=0;j<getBoard()[i].length;j++) {
				getBoard()[i][j].getPan().removeAll();
				getBoard()[i][j].setValue(0);
				repaint();
			}
		}
	}
	
	public boolean checkVictoryP1() {
		//Horizontal check
		try {
			for (int i=this.getBoard().length-2;i>=0;i--) {
				for (int j=0;j<this.getBoard()[0].length;j++) {
					if (this.getBoard()[i][j].getPan().getP() instanceof Player1 && this.getBoard()[i][j+1].getPan().getP() instanceof Player1
						&& this.getBoard()[i][j+2].getPan().getP() instanceof Player1 && this.getBoard()[i][j+3].getPan().getP() instanceof Player1)
						return true;
				}
			}
		}
		catch (Exception e) {}
		
		//Vertical check
		try {
			for (int i=0;i<=this.getBoard().length-4;i++) {
				for (int j=0;j<this.getBoard()[0].length;j++) {
					if (this.getBoard()[i][j].getPan().getP() instanceof Player1 && this.getBoard()[i+1][j].getPan().getP() instanceof Player1
						&& this.getBoard()[i+2][j].getPan().getP() instanceof Player1 && this.getBoard()[i+3][j].getPan().getP() instanceof Player1)
						return true;
				}
			}
		}
		catch (Exception e) {}
		
		//Ascending diagonal check 
		try {
			for (int i=this.getBoard().length-2;i>=0;i--) {
				for (int j=0;j<this.getBoard()[0].length;j++) {
					if (this.getBoard()[i][j].getPan().getP() instanceof Player1 && this.getBoard()[i-1][j+1].getPan().getP() instanceof Player1
						&& this.getBoard()[i-2][j+2].getPan().getP() instanceof Player1 && this.getBoard()[i-3][j+3].getPan().getP() instanceof Player1)
						return true;
				}
			}
		}
		catch (Exception e) {}
		
		//Descending diagonal check 
		try {
			for (int i=0;i<this.getBoard().length-2;i++) {
				for (int j=0;j<this.getBoard()[0].length;j++) {
					if (this.getBoard()[i][j].getPan().getP() instanceof Player1 && this.getBoard()[i+1][j+1].getPan().getP() instanceof Player1
						&& this.getBoard()[i+2][j+2].getPan().getP() instanceof Player1 && this.getBoard()[i+3][j+3].getPan().getP() instanceof Player1)
						return true;
				}
			}
		}
		catch (Exception e) {}
		
		return false;
	}
	
	public boolean checkVictoryP2() {
		//Horizontal check
		try {
			for (int i=this.getBoard().length-2;i>=0;i--) {
				for (int j=0;j<this.getBoard()[0].length;j++) {
					if (this.getBoard()[i][j].getPan().getP() instanceof Player2 && this.getBoard()[i][j+1].getPan().getP() instanceof Player2
						&& this.getBoard()[i][j+2].getPan().getP() instanceof Player2 && this.getBoard()[i][j+3].getPan().getP() instanceof Player2)
						return true;
				}
			}
		}
		catch (Exception e) {}
		
		//Vertical check
		try {
			for (int i=0;i<=this.getBoard().length-4;i++) {
				for (int j=0;j<this.getBoard()[0].length;j++) {
					if (this.getBoard()[i][j].getPan().getP() instanceof Player2 && this.getBoard()[i+1][j].getPan().getP() instanceof Player2
						&& this.getBoard()[i+2][j].getPan().getP() instanceof Player2 && this.getBoard()[i+3][j].getPan().getP() instanceof Player2)
						return true;
				}
			}
		}
		catch (Exception e) {}
		
		//Ascending diagonal check 
		try {
			for (int i=this.getBoard().length-2;i>=0;i--) {
				for (int j=0;j<this.getBoard()[0].length;j++) {
					if (this.getBoard()[i][j].getPan().getP() instanceof Player2 && this.getBoard()[i-1][j+1].getPan().getP() instanceof Player2
						&& this.getBoard()[i-2][j+2].getPan().getP() instanceof Player2 && this.getBoard()[i-3][j+3].getPan().getP() instanceof Player2)
						return true;
				}
			}
		}
		catch (Exception e) {}
		
		//Descending diagonal check 
		try {
			for (int i=0;i<this.getBoard().length-2;i++) {
				for (int j=0;j<this.getBoard()[0].length;j++) {
					if (this.getBoard()[i][j].getPan().getP() instanceof Player2 && this.getBoard()[i+1][j+1].getPan().getP() instanceof Player2
						&& this.getBoard()[i+2][j+2].getPan().getP() instanceof Player2 && this.getBoard()[i+3][j+3].getPan().getP() instanceof Player2)
						return true;
				}
			}
		}
		catch (Exception e) {}		
		return false;
	}
}

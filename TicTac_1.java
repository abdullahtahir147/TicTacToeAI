
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;



public class TicTac_1 {
	private JFrame frame;
	private static JButton btn1;
	private static JButton btn2;
	private static JButton btn3;
	private static JButton btn4;
	private static JButton btn5;
	private static JButton btn6;
	private static JButton btn7;
	private static JButton btn8;
	private static JButton btn9;
	
	public boolean endGame = false;
	
  
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTac_1  window = new TicTac_1() ;
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTac_1() {
		initialize();
	}
	




	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JButton btn1 = new JButton("");
		btn1.setForeground(Color.BLUE);
		btn1.setFont(new Font("Estrangelo Edessa", Font.BOLD, 68));
		
		final JButton btn2 = new JButton("");
		
		btn2.setForeground(Color.BLUE);
		btn2.setFont(new Font("Estrangelo Edessa", Font.BOLD, 68));
		final JButton btn3 = new JButton("");
		btn3.setForeground(Color.BLUE);
		btn3.setFont(new Font("Estrangelo Edessa", Font.BOLD, 68));
		final JButton btn4 = new JButton("");
		btn4.setForeground(Color.BLUE);
		btn4.setFont(new Font("Estrangelo Edessa", Font.BOLD, 68));
		final JButton btn5 = new JButton("");
		btn5.setForeground(Color.BLUE);
		btn5.setFont(new Font("Estrangelo Edessa", Font.BOLD, 68));
		final JButton btn6 = new JButton("");
		btn6.setForeground(Color.BLUE);
		btn6.setFont(new Font("Estrangelo Edessa", Font.BOLD, 68));
		final JButton btn7 = new JButton("");
		btn7.setForeground(Color.BLUE);
		btn7.setFont(new Font("Estrangelo Edessa", Font.BOLD, 68));
		final JButton btn8 = new JButton("");
		btn8.setForeground(Color.BLUE);
		btn8.setFont(new Font("Estrangelo Edessa", Font.BOLD, 68));
		final JButton btn9 = new JButton("");
		btn9.setForeground(Color.BLUE);
		btn9.setFont(new Font("Estrangelo Edessa", Font.BOLD, 68));
		
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.btn3 = btn3;
		this.btn4 = btn4;
		this.btn5 = btn5;
		this.btn6 = btn6;
		this.btn7 = btn7;
		this.btn8 = btn8;
		this.btn9 = btn9;
		
		 
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				if(btn1.getText().equals("")){
				btn1.setText("X");
				int otherCount = 0;
		
			while(count==0 && endGame==false){
				//sendHelp();
				SecureRandom test = new SecureRandom();
				int result = test.nextInt(8);
				if(result==0 &&  btn2.getText().equals("")){
					btn2.setText("O");
					count++;
				} 
				else if(result==1 &&  btn3.getText().equals("")){
					btn3.setText("O");
					count++;
					}
				else if(result==2 &&  btn4.getText().equals("")){
					btn4.setText("O");
					count++;
					}
				else if(result==3 &&  btn5.getText().equals("")){
					btn5.setText("O");
					count++;
					}
				else if(result==4 &&  btn6.getText().equals("")){
					btn6.setText("O");
					count++;
					}
				else if(result==5 &&  btn7.getText().equals("")){
					btn7.setText("O");
					count++;	
				}
				else if(result==6 &&  btn8.getText().equals("")){
					btn8.setText("O");
					count++;	
				}
				else if(result==7 &&  btn9.getText().equals("")){
					btn9.setText("O");
					count++;	
				}
				else if (otherCount == 10){
					endGame = true;
				}
				otherCount++;
			}
			TicTac_2.GameOver();
			}
				
			}});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				if(btn2.getText().equals("")){
					btn2.setText("X");
					int otherCount = 0;
					
					while(count==0 && endGame==false){
						//sendHelp();
					SecureRandom test = new SecureRandom();
					int result = test.nextInt(8);
					if(result==0 &&  btn1.getText().equals("")){
						btn1.setText("O");
						count++;
					} 
					else if(result==1 &&  btn3.getText().equals("")){
						btn3.setText("O");
						count++;
						}
					else if(result==2 &&  btn4.getText().equals("")){
						btn4.setText("O");
						count++;
						}
					else if(result==3 &&  btn5.getText().equals("")){
						btn5.setText("O");
						count++;
						}
					else if(result==4 &&  btn6.getText().equals("")){
						btn6.setText("O");
						count++;
						}
					else if(result==5 &&  btn7.getText().equals("")){
						btn7.setText("O");
						count++;
						}
					else if(result==6 &&  btn8.getText().equals("")){
						btn8.setText("O");
						count++;
					}
					else if(result==7 &&  btn9.getText().equals("")){
						btn9.setText("O");
						count++;
						}
					else if (otherCount == 10){
						endGame = true;
					}
					otherCount++;
					}
					TicTac_2.GameOver();
				}
		}});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				int otherCount =0;
				if(btn3.getText().equals("")){
					btn3.setText("X");
					
					while(count==0 && endGame==false){		
						//sendHelp();
					SecureRandom test = new SecureRandom();
					int result = test.nextInt(8);
					if(result==0 &&  btn1.getText().equals("")){
						btn1.setText("O");
						count++;
					} 
					else if(result==1 &&  btn2.getText().equals("")){
						btn2.setText("O");
						
						count++;}
					else if(result==2 &&  btn4.getText().equals("")){
						btn4.setText("O");
						count++;	
					}
					else if(result==3 &&  btn5.getText().equals("")){
						btn5.setText("O");
						count++;	
					}
					else if(result==4 &&  btn6.getText().equals("")){
						btn6.setText("O");
						count++;	
					}
					else if(result==5 &&  btn7.getText().equals("")){
						btn7.setText("O");
						count++;
						}
					else if(result==6 &&  btn8.getText().equals("")){
						btn8.setText("O");
						count++;
						}
					else if(result==7 &&  btn9.getText().equals("")){
						btn9.setText("O");
						count++;
						}
					else if (otherCount == 10){
						endGame = true;
					}
					otherCount++;
					}
					TicTac_2.GameOver();

				}
				} });
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn4.getText().equals("")){
					btn4.setText("X");
					int count = 0;
					int otherCount = 0;
					while(count==0 && endGame==false){	
						//sendHelp();	
					SecureRandom test = new SecureRandom();
					int result = test.nextInt(8);
					if(result==0 &&  btn1.getText().equals("")){
						btn1.setText("O");
						count++;
					} 
					else if(result==1 &&  btn2.getText().equals("")){
						btn2.setText("O");
						count++;
						}
					else if(result==2 &&  btn3.getText().equals("")){
						btn3.setText("O");
						count++;}
					else if(result==3 &&  btn5.getText().equals("")){
						btn5.setText("O");
						count++;}
					else if(result==4 &&  btn6.getText().equals("")){
						btn6.setText("O");
						count++;}
					else if(result==5 &&  btn7.getText().equals("")){
						btn7.setText("O");
						count++;}
					else if(result==6 &&  btn8.getText().equals("")){
						btn8.setText("O");
						count++;}
					else if(result==7 &&  btn9.getText().equals("")){
						btn9.setText("O");
						count++;}
					else if (otherCount == 10){
						endGame = true;
					}
					otherCount++;
					}
					TicTac_2.GameOver();
					
				}
			}	});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				int otherCount = 0;
				if(btn5.getText().equals("")){
					btn5.setText("X");
				
					
					while(count==0 && endGame==false){	
						//sendHelp();	
					SecureRandom test = new SecureRandom();
					int result = test.nextInt(8);
					if(result==0 &&  btn1.getText().equals("")){
						btn1.setText("O");
						count++;} 
					else if(result==1 &&  btn2.getText().equals("")){
						btn2.setText("O");
						count++;}
					else if(result==2 &&  btn3.getText().equals("")){
						btn3.setText("O");
						count++;}
					else if(result==3 &&  btn4.getText().equals("")){
						btn4.setText("O");
						count++;}
					else if(result==4 &&  btn6.getText().equals("")){
						btn6.setText("O");
						count++;}
					else if(result==5 &&  btn7.getText().equals("")){
						btn7.setText("O");
						count++;}
					else if(result==6 &&  btn8.getText().equals("")){
						btn8.setText("O");
						count++;}
					else if(result==7 &&  btn9.getText().equals("")){
						btn9.setText("O");
						count++;}
					else if (otherCount == 10){
						endGame = true;
					}
					otherCount++;

				}
					TicTac_2.GameOver();
			}
		}});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				int otherCount = 0;
				if(btn6.getText().equals("")){
					btn6.setText("X");
					
					while(count==0 && endGame==false){		
						//sendHelp();
					SecureRandom test = new SecureRandom();
					int result = test.nextInt(8);
					if(result==0 &&  btn1.getText().equals("")){
						btn1.setText("O");
						count++;} 
					else if(result==1 &&  btn2.getText().equals("")){
						btn2.setText("O");
						count++;}
					else if(result==2 &&  btn3.getText().equals("")){
						btn3.setText("O");
						count++;}
					else if(result==3 &&  btn4.getText().equals("")){
						btn4.setText("O");
						count++;}
					else if(result==4 &&  btn5.getText().equals("")){
						btn5.setText("O");
						count++;}
					else if(result==5 &&  btn7.getText().equals("")){
						btn7.setText("O");
						count++;}
					else if(result==6 &&  btn8.getText().equals("")){
						btn8.setText("O");
						count++;}
					else if(result==7 &&  btn9.getText().equals("")){
						btn9.setText("O");
						count++;}
					else if (otherCount == 10){
						endGame = true;
					}
					otherCount++;
					
					
				}
					TicTac_2.GameOver();
			}
		}});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				int otherCount = 0;
				if(btn7.getText().equals("")){
				btn7.setText("X");
					
					
					while(count==0 && endGame==false){		
					//	sendHelp();
					SecureRandom test = new SecureRandom();
					int result = test.nextInt(8);
					if(result==0 &&  btn1.getText().equals("")){
						btn1.setText("O");
						count++;	} 
					else if(result==1 &&  btn2.getText().equals("")){
						btn2.setText("O");
						count++;}
					else if(result==2 &&  btn3.getText().equals("")){
						btn3.setText("O");
						count++;}
					else if(result==3 &&  btn4.getText().equals("")){
						btn4.setText("O");
						count++;}
					else if(result==4 &&  btn5.getText().equals("")){
						btn5.setText("O");
						count++;}
					else if(result==5 &&  btn6.getText().equals("")){
						btn6.setText("O");
						count++;}
					else if(result==6 &&  btn8.getText().equals("")){
						btn8.setText("O");
						count++;}
					else if(result==7 &&  btn9.getText().equals("")){
						btn9.setText("O");
						count++;}
					else if (otherCount == 10){
						endGame = true;
					}
					otherCount++;
					}
					TicTac_2.GameOver();
					
				}
				
		}});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				int otherCount = 0;
				if(btn8.getText().equals("")){
					btn8.setText("X");
					
					while(count==0 && endGame==false){		
					//	sendHelp();
					SecureRandom test = new SecureRandom();
					int result = test.nextInt(8);
					if(result==0 &&  btn1.getText().equals("")){
						btn1.setText("O");
						count++;} 
					else if(result==1 &&  btn2.getText().equals("")){
						btn2.setText("O");
						count++;}
					else if(result==2 &&  btn3.getText().equals("")){
						btn3.setText("O");
						count++;}
					else if(result==3 &&  btn4.getText().equals("")){
						btn4.setText("O");
						count++;}
					else if(result==4 &&  btn5.getText().equals("")){
						btn5.setText("O");
						count++;}
					else if(result==5 &&  btn7.getText().equals("")){
						btn7.setText("O");
						count++;}
					else if(result==6 &&  btn6.getText().equals("")){
						btn6.setText("O");
						count++;}
					else if(result==7 &&  btn9.getText().equals("")){
						btn9.setText("O");
						count++;}
					else if (otherCount == 10){
						endGame = true;
					}
					otherCount++;

					}
					TicTac_2.GameOver();
				}
		}});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn9.getText().equals("")){
					btn9.setText("X");
					int count = 0;
					int otherCount = 0;
					while(count==0 && endGame==false){		
					//	sendHelp();
					SecureRandom test = new SecureRandom();
					int result = test.nextInt(8);
					if(result==0 &&  btn1.getText().equals("")){
						btn1.setText("O");
						count++;} 
					else if(result==1 &&  btn2.getText().equals("")){
						btn2.setText("O");
						count++;}
					else if(result==2 &&  btn3.getText().equals("")){
						btn3.setText("O");
						count++;}
					else if(result==3 &&  btn4.getText().equals("")){
						btn4.setText("O");
						count++;}
					else if(result==4 &&  btn5.getText().equals("")){
						btn5.setText("O");
						count++;}
					else if(result==5 &&  btn7.getText().equals("")){
						btn7.setText("O");
						count++;}
					else if(result==6 &&  btn6.getText().equals("")){
						btn6.setText("O");
						count++;}
					else if(result==7 &&  btn8.getText().equals("")){
						btn8.setText("O");
						count++;}
					else if (otherCount == 10){
						endGame = true;
					}
					otherCount++;
						}
					TicTac_2.GameOver();
				
				
		}
			}});
		

		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 2, 2));
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		
		panel_2.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		
		panel_4.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		
		panel_8.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		
		panel_9.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		
		panel_5.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		
		panel_12.add(btn7, BorderLayout.CENTER);
		
		
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		
		panel_10.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
	
		panel_1.add(btn9, BorderLayout.CENTER);

	
	}

	

		public static JButton getBtn1() {
			return btn1;
		}

		public void setBtn1(JButton btn1) {
			this.btn1 = btn1;
		}

		public static JButton getBtn2() {
			return btn2;
		}

		public void setBtn2(JButton btn2) {
			this.btn2 = btn2;
		}

		public static JButton getBtn3() {
			return btn3;
		}

		public void setBtn3(JButton btn3) {
			this.btn3 = btn3;
		}

		public static JButton getBtn4() {
			return btn4;
		}

		public void setBtn4(JButton btn4) {
			this.btn4 = btn4;
		}

		public static JButton getBtn5() {
			return btn5;
		}

		public void setBtn5(JButton btn5) {
			this.btn5 = btn5;
		}

		public static JButton getBtn6() {
			return btn6;
		}

		public void setBtn6(JButton btn6) {
			this.btn6 = btn6;
		}

		public static JButton getBtn7() {
			return btn7;
		}

		public void setBtn7(JButton btn7) {
			this.btn7 = btn7;
		}

		public static JButton getBtn8() {
			return btn8;
		}

		public void setBtn8(JButton btn8) {
			this.btn8 = btn8;
		}

		public static JButton getBtn9() {
			return btn9;
		}

		public void setBtn9(JButton btn9) {
			this.btn9 = btn9;
		}
	    
	    
}


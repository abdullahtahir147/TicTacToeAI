import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTac_2 extends TicTac_1  {
	private static JFrame frame;
	public static void GameOver() {
		// TODO Auto-generated method stub
		String b1 = getBtn1().getText();
		String b2 = getBtn2().getText();
		String b3 = getBtn3().getText();
		String b4 = getBtn4().getText();
		String b5 = getBtn5().getText();
		String b6 = getBtn6().getText();
		String b7 = getBtn7().getText();
		String b8 = getBtn8().getText();
		String b9 = getBtn9().getText();
	
		
		try{
			if ((!b1.equals(""))&& (!b2.equals(""))&& (!b3.equals(""))&& (!b4.equals(""))&& (!b5.equals(""))&& (!b6.equals(""))
					&& (!b7.equals(""))&& (!b8.equals(""))&& (!b9.equals(""))) {
				youDraw();
			}
				if(b1.equals("X")&& b2.equals("X")&& b3.equals("X")){
					youWon();
				}else if(b4.equals("X")&& b5.equals("X")&& b6.equals("X")){
					youWon();
				}else if(b7.equals("X")&& b8.equals("X")&& b9.equals("X")){
					youWon();
				}else if(b1.equals("X")&& b4.equals("X")&& b7.equals("X")){
					youWon();
				}else if(b2.equals("X")&& b5.equals("X")&& b8.equals("X")){
					youWon();
				}else if(b3.equals("X")&& b6.equals("X")&& b9.equals("X")){
					youWon();
				}else if(b3.equals("X")&& b6.equals("X")&& b9.equals("X")){
					youWon();
				}else if(b1.equals("X")&& b5.equals("X")&& b9.equals("X")){
					youWon();
				}else if(b7.equals("X")&& b5.equals("X")&& b3.equals("X")){
					youWon();
				}
				
				if(b1.equals("O")&& b2.equals("O")&& b3.equals("O")){
					youStoopid();
				}else if(b4.equals("O")&& b5.equals("O")&& b6.equals("O")){
					youStoopid();
				}else if(b7.equals("O")&& b8.equals("O")&& b9.equals("O")){
					youStoopid();
				}else if(b1.equals("O")&& b4.equals("O")&& b7.equals("O")){
					youStoopid();
				}else if(b2.equals("O")&& b5.equals("O")&& b8.equals("O")){
					youStoopid();
				}else if(b3.equals("O")&& b6.equals("O")&& b9.equals("O")){
					youStoopid();
				}else if(b3.equals("O")&& b6.equals("O")&& b9.equals("O")){
					youStoopid();
				}else if(b1.equals("O")&& b5.equals("O")&& b9.equals("O")){
					youStoopid();
				}else if(b7.equals("O")&& b5.equals("O")&& b3.equals("O")){
					youStoopid();
				}
		}catch(NullPointerException e){
			
			System.out.println("k");
		}
	}
	
	public static void youWon() {
		
		JOptionPane.showMessageDialog(frame, "Congrats, You Won!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		Exit();
	//	System.out.println("It came here");
//		int check = 0;
//		check++;
//		System.out.println(check);
	}
	
	public static void youStoopid() {
	
		JOptionPane.showMessageDialog(frame, "Congrats, you stoopid", "Your Parents Must Be Proud!", JOptionPane.INFORMATION_MESSAGE);
		Exit();
//		System.out.println("It came here");
//		int check = 0;
//		check++;
//		System.out.println(check);
	}
	
	public static void youDraw() {
		
		JOptionPane.showMessageDialog(frame, "Draw is only Half bad", "Atleast You Tried", JOptionPane.INFORMATION_MESSAGE);
		Exit();
		//		System.out.println("It came here");
//		int check = 0;
//		check++;
//		System.out.println(check);
	}
	    public static void Exit(){
	    	
	    		System.exit(0);
	    	
	    	 }
}


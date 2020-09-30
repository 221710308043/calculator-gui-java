import javax.swing.*;

public class calc {

	public static void main(String[] args) {
		// JFrame layout
		JFrame layout = new JFrame();
		
		//JTextField
		JTextField inputField = new JTextField(16);
		inputField.setBounds(5, 10, 385, 40);
		
		// Row 1
		//AC Button
		JButton ac_btn=new JButton("AC");
		ac_btn.setBounds(5, 60, 195, 75);
		
		// Div Button
		JButton div_btn=new JButton("/");
		div_btn.setBounds(200, 60, 95, 75);
		
		// mul Button
		JButton mul_btn=new JButton("X");
		mul_btn.setBounds(295, 60, 95, 75);
		
		// Row 2
		// 7 Button
		JButton seven_btn=new JButton("7");
		seven_btn.setBounds(120, 60, 100, 60);
		
		// 8 Button
		JButton eight_btn=new JButton("8");
		eight_btn.setBounds(120, 60, 100, 40);
				
		// 9 Button
		JButton nine_btn=new JButton("9");
		nine_btn.setBounds(120, 60, 100, 40);
				
		// - Button
		JButton sub_btn=new JButton("-");
		sub_btn.setBounds(120, 60, 100, 40);
				
		// 4 Button
		JButton four_btn=new JButton("4");
		four_btn.setBounds(120, 60, 100, 40);
				
		// 5 Button
		JButton five_btn=new JButton("5");
		five_btn.setBounds(120, 60, 100, 40);
				
		// 6 Button
		JButton six_btn=new JButton("6");
		six_btn.setBounds(120, 60, 100, 40);
				
		// + Button
		JButton plus_btn=new JButton("plus");
		plus_btn.setBounds(120, 60, 100, 40);
				
		// 1 Button
		JButton one_btn=new JButton("1");
		one_btn.setBounds(120, 60, 100, 40);
				
		// 2 Button
		JButton two_btn=new JButton("2");
		two_btn.setBounds(120, 60, 100, 40);
				
		// 3 Button
		JButton three_btn=new JButton("3");
		three_btn.setBounds(120, 60, 100, 40);
				
		// = Button
		JButton submit_btn=new JButton("=");
		submit_btn.setBounds(120, 60, 100, 40);
				
		// 0 Button
		JButton zero_btn=new JButton("0");
		zero_btn.setBounds(120, 60, 100, 40);
				
		// dot Button
		JButton dot_btn=new JButton(".");
		dot_btn.setBounds(120, 60, 100, 40);
		
		
		layout.add(inputField);
		layout.add(ac_btn);
		layout.add(div_btn);
		layout.add(mul_btn);
		
		layout.setSize(410, 500);
		
		layout.setLayout(null);
		layout.setVisible(true);
	}

}

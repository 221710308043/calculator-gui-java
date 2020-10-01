import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class view{
	public void outputFinal() {
		Color ac_color = new Color(172, 57, 57);
		Color operators_color = new Color(102, 102, 102);
		Color number_color = new Color(77, 77, 77);
		Color submit_color = new Color(0, 68, 102);
		Color border_color = new Color(128, 139, 152);
		
		JFrame layout = new JFrame("Calculator");
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		
//		layout.setIconImage(new ImageIcon(imgURL).getImage());
		Image icon = Toolkit.getDefaultToolkit().getImage("img/icon.png");  
		layout.setIconImage(icon);

		
		JPanel panel= new JPanel();  
		panel.setBounds(40,80,200,200);    
        panel.setBackground(Color.black);  
		
        layout.setContentPane(panel);
		//JTextField
		JTextField inputField = new JTextField(16);
	    inputField.setHorizontalAlignment(JTextField.RIGHT);

		inputField.setBounds(5, 0, 395, 60);
		inputField.setFont(new Font("SegoeUI", Font.PLAIN, 30));
		inputField.setForeground(Color.WHITE);
		inputField.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = inputField.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '/' || ke.getKeyChar() == 'x' || ke.getKeyChar() == '-' || ke.getKeyChar() == '+' || ke.getKeyChar() == '.' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE  ) {
	            	inputField.setEditable(true);
//	               label.setText("");
	            } else {
	            	inputField.setEditable(false);
//	               label.setText("* Enter only numeric digits(0-9)");
	            }
	         }
	      });
//		inputField.setBorder(false);
		inputField.setBorder(new LineBorder(border_color,1));
		
		inputField.setBackground(Color.black);
		//-------------------------------------
		// Row 1
		//AC Button
		JButton ac_btn=new JButton("AC");
		ac_btn.setBounds(5, 60, 195, 75);
		ac_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		ac_btn.setBackground(ac_color);
		ac_btn.setForeground(Color.WHITE);
		
		// Div Button
		JButton div_btn=new JButton("/");
		div_btn.setBounds(200, 60, 100, 75);
		div_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		div_btn.setBackground(operators_color);
		div_btn.setForeground(Color.WHITE);
		
		// mul Button
		JButton mul_btn=new JButton("X");
		mul_btn.setBounds(300, 60, 100, 75);
		mul_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		mul_btn.setBackground(operators_color);
		mul_btn.setForeground(Color.WHITE);
		
		//------------------------------------
		// Row 2
		// 7 Button
		JButton seven_btn=new JButton("7");
		seven_btn.setBounds(5, 135, 95, 75);
		seven_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		seven_btn.setBackground(number_color);
		seven_btn.setForeground(Color.WHITE);
		
		
		// 8 Button
		JButton eight_btn=new JButton("8");
		eight_btn.setBounds(100, 135, 100, 75);
		eight_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		eight_btn.setBackground(number_color);
		eight_btn.setForeground(Color.WHITE);		
		
		// 9 Button
		JButton nine_btn=new JButton("9");
		nine_btn.setBounds(200, 135, 100, 75);
		nine_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		nine_btn.setBackground(number_color);
		nine_btn.setForeground(Color.WHITE);			
		
		// - Button
		JButton sub_btn=new JButton("-");
		sub_btn.setBounds(300, 135, 100, 75);
		sub_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		sub_btn.setBackground(operators_color);
		sub_btn.setForeground(Color.WHITE);		
		
		//--------------------------------------
		// Row 3
		// 4 Button
		JButton four_btn=new JButton("4");
		four_btn.setBounds(5, 210, 95, 75);
		four_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		four_btn.setBackground(number_color);
		four_btn.setForeground(Color.WHITE);	
				
		// 5 Button
		JButton five_btn=new JButton("5");
		five_btn.setBounds(100, 210, 100, 75);
		five_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		five_btn.setBackground(number_color);
		five_btn.setForeground(Color.WHITE);			
		
		// 6 Button
		JButton six_btn=new JButton("6");
		six_btn.setBounds(200, 210, 100, 75);
		six_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		six_btn.setBackground(number_color);
		six_btn.setForeground(Color.WHITE);	
				
		// + Button
		JButton plus_btn=new JButton("+");
		plus_btn.setBounds(300, 210, 100, 75);
		plus_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		plus_btn.setBackground(operators_color);
		plus_btn.setForeground(Color.WHITE);	
			
		// -------------------------------------
		// Row 4
		// 1 Button
		JButton one_btn=new JButton("1");
		one_btn.setBounds(5, 285, 95, 75);
		one_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		one_btn.setBackground(number_color);
		one_btn.setForeground(Color.WHITE);	
				
		// 2 Button
		JButton two_btn=new JButton("2");
		two_btn.setBounds(100, 285, 100, 75);
		two_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		two_btn.setBackground(number_color);
		two_btn.setForeground(Color.WHITE);	
				
		// 3 Button
		JButton three_btn=new JButton("3");
		three_btn.setBounds(200, 285, 100, 75);
		three_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		three_btn.setBackground(number_color);
		three_btn.setForeground(Color.WHITE);	
				
		// = Button
		JButton submit_btn=new JButton("=");
		submit_btn.setBounds(300, 285, 100, 150);
		submit_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		submit_btn.setBackground(submit_color);
		submit_btn.setForeground(Color.WHITE);	
				
		//----------------------------------------
		// 0 Button
		JButton zero_btn=new JButton("0");
		zero_btn.setBounds(5, 360, 195, 75);
		zero_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		zero_btn.setBackground(number_color);
		zero_btn.setForeground(Color.WHITE);	
				
		// dot Button
		JButton dot_btn=new JButton(".");
		dot_btn.setBounds(200, 360, 100, 75);
		dot_btn.setFont(new Font("SegoeUI", Font.BOLD, 25));
		dot_btn.setBackground(operators_color);
		dot_btn.setForeground(Color.WHITE);	
		
		layout.add(inputField);
		layout.add(ac_btn);
		layout.add(div_btn);
		layout.add(mul_btn);
		layout.add(seven_btn);
		layout.add(eight_btn);
		layout.add(nine_btn);
		layout.add(sub_btn);
		layout.add(four_btn);
		layout.add(five_btn);
		layout.add(six_btn);
		layout.add(plus_btn);
		layout.add(one_btn);
		layout.add(two_btn);
		layout.add(three_btn);
		layout.add(submit_btn);
		layout.add(zero_btn);
		layout.add(dot_btn);

		layout.setSize(420, 480);
		
//		public void TextFieldInput() {
//			
//		}
		
		zero_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
//				String s = inputField.getText();
				
				
				
				// translateToMorse tm = new translateToMorse();
//				String englishText = s.toLowerCase();
//				String output = new String(englishText);
				//	System.out.println(englishString());
//				output = "";
//					for(int i=0; i<englishText.length(); i++) {	
//						System.out.print(translateMorse(englishText.charAt(i)));
//						System.out.print(" ");
//						
//						output = output + translateMorse(englishText.charAt(i)) + " ";
//						
//						
//						
//					}
				String input = inputField.getText();
				String num = "0";
				input += num;
				
				inputField.setText(input);
			}
			});
		
		one_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {

		
				String input = inputField.getText();
				int value;
				int num = 1;
				
				input += String.valueOf(num);

				value = Integer.valueOf(input);

				System.out.println(value);

				inputField.setText(input);
			}
			});
		
		two_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "2";
				input += num;
				
				inputField.setText(input);
			}
			});
		
		three_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "3";
				input += num;
				
				inputField.setText(input);
			}
			});

		four_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "4";
				input += num;
				
				inputField.setText(input);
			}
			});
		
		five_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "5";
				input += num;
				
				inputField.setText(input);
			}
			});
		
		six_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "6";
				input += num;
				
				inputField.setText(input);
			}
			});
		seven_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "7";
				input += num;
				
				inputField.setText(input);
			}
			});
		eight_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "8";
				input += num;
				
				inputField.setText(input);
			}
			});
		
		nine_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "9";
				input += num;
				
				inputField.setText(input);
			}
			});
		
		dot_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = ".";
				input += num;
				
				inputField.setText(input);
			}
			});
		
		plus_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "+";


				input = num;
				
				inputField.setText(input);
				
			}
			});
		
		sub_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "-";
				input += num;
				
				inputField.setText(input);
			}
			});
		
		mul_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "x";
				input += num;
				
				inputField.setText(input);
			}
			});
		
		div_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				String num = "/";
				input += num;
				
				inputField.setText(input);
			}
			});
		
		ac_btn.addActionListener(new ActionListener() {
			@Override
		
			public void actionPerformed(ActionEvent e) {
					inputField.setText("");
			}
			});
			
		submit_btn.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				
				
				
				String input = inputField.getText();
				int input2 = Integer.valueOf(input);
//				System.out.println(input);



//				storage value = new storage();
//				value.store(input, "no");


				
				
				
				
			}
			
			
		});
		
		
//		int x = 1;
//		layout.getRootPane().setWindowDecorationStyle(x);
		layout.setLayout(null);

		layout.setUndecorated(false);
		layout.setVisible(true);
	}
	
}
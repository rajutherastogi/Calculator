package calculators;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btnPlus;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMin;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnMult;
	private JButton btnDot;
	private JButton btn0;
	private JButton btnDiv;
	private JButton btnEqual;
	private JButton btnClr;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 227, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 190, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText()+btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn7.setBounds(10, 42, 40, 40);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn8.setBounds(60, 42, 40, 40);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn9.setBounds(110, 42, 40, 40);
		frame.getContentPane().add(btn9);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 7));
		btnPlus.setBounds(160, 42, 40, 40);
		frame.getContentPane().add(btnPlus);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn4.setBounds(10, 92, 40, 40);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn5.setBounds(60, 92, 40, 40);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn6.setBounds(110, 92, 40, 40);
		frame.getContentPane().add(btn6);
		
		btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		btnMin.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnMin.setBounds(160, 92, 40, 40);
		frame.getContentPane().add(btnMin);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn1.setBounds(10, 142, 40, 40);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn2.setBounds(60, 142, 40, 40);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn3.setBounds(110, 142, 40, 40);
		frame.getContentPane().add(btn3);
		
		btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnMult.setBounds(160, 142, 40, 40);
		frame.getContentPane().add(btnMult);
		
		btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnDot.setBounds(10, 192, 40, 40);
		frame.getContentPane().add(btnDot);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn0.setBounds(60, 193, 40, 40);
		frame.getContentPane().add(btn0);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnDiv.setBounds(110, 192, 40, 40);
		frame.getContentPane().add(btnDiv);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(textField.getText());
				if(operations=="+")
				{
					result=firstnum+secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operations=="-")
				{
					result=firstnum-secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operations=="*")
				{
					result=firstnum*secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operations=="/")
				{
					result=firstnum/secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 5));
		btnEqual.setBounds(160, 193, 40, 40);
		frame.getContentPane().add(btnEqual);
		
		btnClr = new JButton("C");
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClr.setBounds(160, 242, 40, 40);
		frame.getContentPane().add(btnClr);
		
		JButton btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace=strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 5));
		btnBack.setBounds(10, 243, 40, 40);
		frame.getContentPane().add(btnBack);
		
	}
}

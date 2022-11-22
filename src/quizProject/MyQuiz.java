package quizProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyQuiz extends JFrame implements ActionListener{
		JButton b1,b2;
		JTextField  t2;
		String name;
		MyQuiz(){
		setBounds(250,100,1000,600);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		
//		ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("quizProject/Sources/quiz2.png"));
		ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("quizProject/Sources/quiz6.png"));
		JLabel im = new JLabel(ic);
		im.setBounds(0,0,500,600);
		add(im);
		
		JLabel im1 = new JLabel("My Quiz");
		im1.setFont(new Font("Mongolian Baiti",Font.BOLD,45));
//		im1.setForeground(Color.BLUE);
		im1.setForeground(new Color(30,144,254));
		im1.setBounds(700,40,400,50);
		add(im1);
		
		JLabel im2 = new JLabel("Enter Your Name:");
		im2.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
//		im2.setForeground(Color.BLUE);
		im2.setForeground(new Color(30,144,254));
		im2.setBounds(510,80,400,50);
		add(im2);
		
	    t2 = new JTextField ();
		t2.setFont(new Font("Times New Roman",Font.BOLD,20));
		t2.setBounds(510,120,300,30);
		add(t2);
		
		JLabel im3 = new JLabel("Enter Your Age:");
		im3.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
//		im3.setForeground(Color.BLUE);
		im3.setForeground(new Color(30,144,254));
		im3.setBounds(510,150,400,50);
		add(im3);
		
		JTextField t3 = new JTextField();
		t3.setFont(new Font("Times New Roman",Font.BOLD,20));
		t3.setBounds(510,190,300,30);
		add(t3);
		
		JLabel im4 = new JLabel("Enter Your Phone no:");
		im4.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
//		im4.setForeground(Color.BLUE);
		im4.setForeground(new Color(30,144,254));
		im4.setBounds(510,220,400,50);
		add(im4);
		
		JTextField t4 = new JTextField();
		t4.setFont(new Font("Times New Roman",Font.BOLD,20));
		t4.setBounds(510,260,300,30);
		add(t4);
		
		JLabel im5 = new JLabel("Your High Score:");
		im5.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
//		im5.setForeground(Color.BLUE);
		im5.setForeground(new Color(30,144,254));
		im5.setBounds(510,290,400,50);
		add(im5);
		
		 b1 = new JButton("Next");
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(30,144,254));
		b1.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
		b1.setBounds(530,420,130,30);
		b1.addActionListener(this);
		add(b1);
		
		 b2 = new JButton("Exit");
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color(30,144,254));
		b2.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
		b2.setBounds(720,420,130,30);
		b2.addActionListener(this);
		add(b2);
		
		
		setVisible(true);
		
	}
		
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource() == b1)
			{
				 name= t2.getText();   //
				this.setVisible(false);
				new WelcomeScr(name);
			}else 
			{
				System.exit(0);
			}
			
		}

		
		public static void main(String args[])
		{
			new MyQuiz();
		}

	}





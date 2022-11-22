package quizProject;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class WelcomeScr extends JFrame implements ActionListener{

	JLabel l1 ;
	JButton b2,b3;
	WelcomeScr(String Username){
		setBounds(250,100,1000,600);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		l1 = new JLabel("Welcome "+Username+" to the MyQuiz");
		l1.setBounds(200,10,800,100);
		l1.setFont(new Font("Mongolian Baiti",Font.BOLD,35));
		l1.setForeground(new Color(30,144,254));
		add(l1);
		
		JLabel im6 = new JLabel("Your High Score:");
		im6.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
//		im6.setForeground(Color.BLUE);
		im6.setForeground(new Color(30,144,254));
		im6.setBounds(310,190,400,50);
		add(im6);
		
		
		b2 = new JButton("Back");
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color(30,144,254));
		b2.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
		b2.setBounds(530,420,130,30);
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("Start Quiz");
		b3.setForeground(Color.WHITE);
		b3.setBackground(new Color(30,144,254));
		b3.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
		b3.setBounds(720,420,130,30);
		b3.addActionListener(this);
		add(b3);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b2)
		{
			this.setVisible(false);
			
			new MyQuiz().setVisible(true);
		}else if(ae.getSource() == b3)
		{
			new QuizPannel();
			this.setVisible(false);
			
		}
		
	}
	public static void main(String args[])
	{
		 new WelcomeScr("");
	}

}

package quizProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
     static int  passScore;
     JButton b1;
	
	Score(int passScore)
	{
		setBounds(200,40,1200,700);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		
		ImageIcon In = new ImageIcon(ClassLoader.getSystemResource("quizProject/Sources/Quiz time2.png"));
		Image Im1 = In.getImage().getScaledInstance(500,550,Image.SCALE_DEFAULT);
		ImageIcon Im2 = new ImageIcon(Im1);
		JLabel Im = new JLabel(Im2);
		Im.setBounds(0,400,300,250);
		add(Im);
		
		JLabel l2 = new JLabel("Thank You For Playing My Quiz");
		l2.setBounds(100,30,1000,200);
//		l2.setFont(new Font("RALEWAY",Font.PLAIN,50));
		l2.setFont(new Font("Jokerman",Font.PLAIN,40));
		l2.setForeground(new Color(199,21,133));
		add(l2);
		
		JLabel l3 = new JLabel("Your Score Is :"+passScore);
		l3.setBounds(700,200,600,200);
		l3.setFont(new Font("Jokerman",Font.PLAIN,40));
		l3.setForeground(new Color(199,21,133));
		add(l3);
		
		 b1 =new JButton("Play Again");
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.setBounds(700,400,150,40);
		b1.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
		add(b1);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			this.setVisible(false);
			new QuizPannel().setVisible(true);
		}
		
		
	}
	
	public static void main(String args[])
	{
		new Score(passScore).setVisible(true);
//		System.out.println(passScore);
		
	}

	
}

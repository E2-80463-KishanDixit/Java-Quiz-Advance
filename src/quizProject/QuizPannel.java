package quizProject;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
public class QuizPannel extends JFrame implements ActionListener{
	
	JLabel qno,qtn;
	JButton next,pre,sub;
	public static int count = 0;
	public static int timer = 15;
	public static int ans_given = 0;
	public static int score = 0;
	static int passScore =0;
	
	
	String q[][]=new String [10][5];
	String pa[][] = new String[10][1];
	String ca[][] = new String[10][2];  //correct answer
	JRadioButton opt1,opt2,opt3,opt4;
	ButtonGroup optn ;
	
	QuizPannel()
	{
		
		setBounds(200,40,1200,700);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizProject/Sources/HAPPY QUIZ1.jpg"));
		JLabel lb = new JLabel(i1);
		lb.setBounds(0,0,1200,200);
		add(lb);
		
		qno = new  JLabel("");
		qno.setFont(new Font("Tahona",Font.PLAIN,20));
		qno.setBounds(58,240,50,40);
		add(qno);
		
		qtn = new  JLabel("");
		qtn.setFont(new Font("Tahona",Font.PLAIN,20));
		qtn.setBounds(84,63,800,400);
		add(qtn);
		
		

		q[0][0] = "which of the following option leads to the portability and security of java?";
		q[0][1] = "Bytecode is executed by the JVM";
		q[0][2] = "The applet makes the java code secure and protable";
		q[0][3] = "use of exception handling";
		q[0][4] = "Dynamic binding between objects";
		
		
		q[1][0] = "Which of the following is not a Java features?";
		q[1][1] = "Dynamic";
		q[1][2] = "Architecture Neutral";
		q[1][3] = "Use of pointers";
		q[1][4] = "Object-oriented";
		
	
		q[2][0] = "Which of the following is a valid declaration of a char?";
		q[2][1] =  "char ch = '\\utea'";            
		q[2][2] = "char ca = 'tea'";
		q[2][3] = "char cr = \\u0223";
		q[2][4] = "char cc = '\\itea'";
		
		
		q[3][0] = " What is the return type of the hashCode() method in the Object class?";
		q[3][1] = " Object";
		q[3][2] = "int";
		q[3][3] = "long";
		q[3][4] = " void";
		
		
		q[4][0] = "Which of the following is a valid long literal?";
		q[4][1] = "ABH8097";
		q[4][2] = "L990023";
		q[4][3] = "904423";
		q[4][4] = "0xnf029L";
				 
				 
		q[5][0] = "In which process, a local variable has the same name as one of the instance variables?";
		q[5][1] = "Serialization";
		q[5][2] = "Variable Shadowing";
		q[5][3] = "Abstraction";
		q[5][4] = " Multi-threading";
		
		
		q[6][0] = "Which of the following is true about the anonymous inner class?";
		q[6][1] = "It has only methods";
		q[6][2] = "Objects can't be created";
		q[6][3] = "It has a fixed class name";
		q[6][4] = "It has no class name";
		
		
				
		q[7][0] = "Which package contains the Random class?";
		q[7][1] = "java.util package";
		q[7][2] = "java.lang package";
		q[7][3] = "java.awt package";
		q[7][4] = "java.io package";
		
		q[8][0] = "What do you mean by nameless objects?";
		q[8][1] = "An object created by using the new keyword.";
		q[8][2] = "An object of a superclass created in the subclass.";
		q[8][3] = "An object without having any name but having a reference.";
		q[8][4] = " An object that has no reference.";
		
		
		q[9][0] = "An interface with no fields or methods is known as a ______.";
		q[9][1] = "Runnable Interface";
		q[9][2] = "Marker Interface";      
		q[9][3] = "Abstract Interface";
		q[9][4] = "CharSequence Interface";
	
		
		ca[0][1]="Bytecode is executed by the JVM";
		ca[1][1]="Use of pointers";
		ca[2][1]= "char ch = '\\utea'";                              
		ca[3][1]="int";
		ca[4][1]="0xnf029L";
		ca[5][1]="Variable Shadowing";
		ca[6][1]="It has no class name";
		ca[7][1]="java.util package";
		ca[8][1]=" An object that has no reference.";
		ca[9][1]="Marker Interface";
		
		opt1= new JRadioButton("");
		opt1.setBounds(80,280,400,30);
		opt1.setFont(new Font("Tahona",Font.PLAIN,15));
		opt1.setBackground(Color.WHITE);
		add(opt1);
		
		opt2= new JRadioButton("");
		opt2.setBounds(80,310,400,30);
		opt2.setFont(new Font("Tahona",Font.PLAIN,15));
		opt2.setBackground(Color.WHITE);
		add(opt2);
		
		
		opt3= new JRadioButton("");
		opt3.setBounds(80,340,400,30);
		opt3.setFont(new Font("Tahona",Font.PLAIN,15));
		opt3.setBackground(Color.WHITE);
		add(opt3);
		
		
		opt4= new JRadioButton("");
		opt4.setBounds(80,370,400,30);
		opt4.setFont(new Font("Tahona",Font.PLAIN,15));
		opt4.setBackground(Color.WHITE);
		add(opt4);
		setVisible(true);
		
		optn = new ButtonGroup();
		optn.add(opt1);
		optn.add(opt2);
		optn.add(opt3);
		optn.add(opt4);
		
		
		next= new JButton("Next");
		next.setBounds(1000,300,100,30);
		next.setFont(new Font("Tahona",Font.PLAIN,15));
		next.setBackground(new Color(30,144,254));
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		add(next);
		
		
		pre= new JButton("Previous");
		pre.setBounds(1000,350,100,30);
		pre.setFont(new Font("Tahona",Font.PLAIN,15));
		pre.setBackground(new Color(30,144,254));
		pre.setForeground(Color.WHITE);
		pre.addActionListener(this);
		add(pre);
		
		sub= new JButton("Submit");
		sub.setEnabled(false);
		sub.setBounds(1000,400,100,30);
		sub.setFont(new Font("Tahona",Font.PLAIN,15));
		sub.setBackground(new Color(30,144,254));
		sub.setForeground(Color.WHITE);
		sub.addActionListener(this);
		add(sub);
		
		start(0);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == next) {
			repaint();
			ans_given =1;                              
			if(optn.getSelection() == null)
			{
				pa[count][0] ="";
			}else {
				pa[count][0]=optn.getSelection().getActionCommand();
			}                  
			
			
			if(count==8)
			{
				next.setEnabled(false);
				sub.setEnabled(true);
			}
			
			count++;
			start(count);
			}
		else if(ae.getSource() == sub){
			
			ans_given =1;
			if(optn.getSelection() == null)
			{
				pa[count][0] ="";
			}else {
				pa[count][0]=optn.getSelection().getActionCommand();
			}
			
//			count++;                                  //*******************
//			start(count);                             //*******************
			
			for(int i=0;i<pa.length;i++)
			{
				if(pa[i][0].equals(ca[i][1]))
				{
					score+=1;
					passScore += score;                 //******************
				}
				else
				{
					score+=0;
					passScore += score;                //*****************
				}
				
//				passScore += score;                      //
//				 new Score(passScore).setVisible(true);//
			}
			this.setVisible(false);
			 new Score(passScore).setVisible(true);
			
			
		}else if(ae.getSource() == pre) {
			
		}
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		String time = "Time Left -"+ timer+"sec.";
		g.setColor(Color.RED);
		g.setFont(new Font("Tahona",Font.PLAIN,15));
		
		
		if(timer>0) {
			g.drawString(time,1000,280);
		}else {
			g.drawString("Times Up!!",1000,280);
		}
		timer--;
		
		try {
			Thread.sleep(1000);
			repaint();
		}catch(Exception e){
			e.printStackTrace();
		}
		if(ans_given ==1) {
			ans_given = 0;
			timer =15;
		}else if(timer<0)
		{
			timer = 15;
			
			if(count==8)
			{
				next.setEnabled(false);
				sub.setEnabled(true);
			}
			if(count ==9) {
				if(optn.getSelection() == null)
				{
					pa[count][0] ="";
				}else {
					pa[count][0]=optn.getSelection().getActionCommand();
				}
				
				
				for(int i=0;i<pa.length;i++)
				{
					if(pa[i][0].equals(ca[i][1]))
					{
						score+=1;
						passScore += score;              //****************
					}
					else
					{
						score+=0;
					}
					
//					passScore += score;                      //
//					 new Score(passScore).setVisible(true);
				}
				
				this.setVisible(false);
				
				 new Score(passScore).setVisible(true);
			}else {
				if(optn.getSelection() == null)
				{
					pa[count][0] ="";
				}else {
					pa[count][0]=optn.getSelection().getActionCommand();
				}
				
//				if(count==8)
//				{
//					next.setEnabled(false);
//					sub.setEnabled(true);
//				}
				count++;
				start(count);
			}
		}
	}
	
	public void start(int count) {
		
	 qno.setText(""+ (count+1)+".");
	 qtn.setText(q[count][0]);
	 opt1.setLabel(q[count][1]);
	 opt1.setActionCommand(q[count][1]);
	 opt2.setLabel(q[count][2]);
	 opt2.setActionCommand(q[count][2]);
	 opt3.setLabel(q[count][3]);
	 opt3.setActionCommand(q[count][3]);
	 opt4.setLabel(q[count][4]);
	 opt4.setActionCommand(q[count][4]);
	 optn.clearSelection();
		
	}
	public static void main(String args[])
	{
		new QuizPannel();
		passScore =score ;          //
//		new Score(passScore);  
		 new Score(passScore).setVisible(true);
		 
		 
//		System.out.println(passScore);
//		System.out.println(score);
//		
	}
	
}

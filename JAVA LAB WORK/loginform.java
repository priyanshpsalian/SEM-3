import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class loginform extends Frame implements ActionListener
{
	Label l1=new Label("User name : ");//OBJECT CREATE 
	Label l2=new Label("Surname : ");//OBJECT CREATE
	Label l3=new Label(" ");//OBJECT CREATE
	TextField t1=new TextField();//OBJECT CREATE
	TextField t2=new TextField();//OBJECT CREATE
	Button b=new Button("submit");//OBJECT CREATE
	public loginform()
	{
                add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		l1.setBounds(20,45,70,20);//set co-ordinates 
		t1.setBounds(180,45,200,20);
		l2.setBounds(20,95,70,20);
		t2.setBounds(180,95,200,20);
		b.setBounds(150,150,100,50);
		b.addActionListener(this);
		addWindowListener(new A());
	}
	public void actionPerformed(ActionEvent e)
	{ 
		l3.setText("SUBMITTED "+t1.getText());
	}
	public static void main(String s[])
    {
		loginform l=new loginform();
		l.setSize(new Dimension(400,400));
		l.setTitle("Login");
		l.setVisible(true);
   }//end of main
}//end of class loginform
 class A extends WindowAdapter
{ 
	public A(){}
	public void WindowClosing(WindowEvent e)
   { 
	System.exit(0);
   }
}//end of class A
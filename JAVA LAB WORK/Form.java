import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Form{
 public static void main(String[] args) {
 //assigning the different fields in the GUI
 JFrame f = new JFrame("Registration Form");
 Button submit = new Button("Submit");
 Button cancel = new Button("Cancel");
 JLabel form,name,age,emailId,address,Submit,Cancel;
 JTextField Name,Age,EmailId;
 JTextArea Address;
 form = new JLabel("A Basic Registration form");
 name = new JLabel("Name :-");
 age = new JLabel("Age :-");
 emailId = new JLabel("Email Id :-");
 address = new JLabel("Address :-");
 Submit =new JLabel("");
Cancel =new JLabel("");
 Name = new JTextField();
 Age = new JTextField();
 EmailId = new JTextField();
 Address = new JTextArea();
 //setting the size of the fields used
 form.setBounds(125,5,400,20);
 name.setBounds(10,20,125,30);
 age.setBounds(10,50,125,30);
 emailId.setBounds(10,80,125,30);
 address.setBounds(10,110,125,30);
 Name.setBounds(100,25,150,20);
 Age.setBounds(100,55,150,20);
 EmailId.setBounds(100,85,150,20);
 Address.setBounds(100,115,150,100);
 submit.setBounds(50,300,100,30);
 cancel.setBounds(200,300,100,30);
 Submit.setBounds(100, 250,200,30);
 Cancel.setBounds(100, 250,200,30);
 
 //Adding elements in the screen
 f.add(form);
f.add(submit);
 f.add(name);
 f.add(Name);
 f.add(age);
 f.add(Age);
 f.add(emailId);
 f.add(EmailId);
 f.add(address);
 f.add(Address);
 f.add(cancel);
 f.add(Submit);
 f.add(Cancel);
 //Size of the GUI,layout,visibility
 f.setSize(500,500);
 f.setLayout(null);
 f.setVisible(true);
 submit.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent e){
 Submit.setVisible(true);
 Submit.setText("Form Submitted");
 Cancel.setVisible(false);
}
 });
 cancel.addActionListener(new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent e){
 Cancel.setVisible(true);
 Cancel.setText("Form Cancelled");
 Submit.setVisible(false);
 }
 });
 } 
}

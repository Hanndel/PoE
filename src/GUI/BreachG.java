package GUI;
import javax.swing.*;  
public class BreachG extends JFrame{//inheriting JFrame  
JFrame f;  
public BreachG(){  
JButton b=new JButton("a");//create button  
b.setBounds(170,100,100, 40);  
          
add(b);//adding button on frame  
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
new BreachG();  
}}  
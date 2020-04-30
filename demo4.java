import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

class Fdemo extends Frame implements ActionListener
{
  Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
  TextField tx,tx1;
  Fdemo()
  {
    setLayout(null);
	Font f=new Font("null",Font.BOLD,50);
	setFont(f);
	setTitle("CALCULATIOR");
    
	tx=new TextField("");
	tx.setSize(410,60);
	tx.setLocation(15,100);
	add(tx);
    
	
	b=new Button("CE");
    b.setSize(100,80);
	b.setLocation(15,250);
    add(b);
    b1=new Button("C");
    b1.setSize(100,80);
	b1.setLocation(120,250);
    add(b1);
    b2=new Button("DEL");
    b2.setSize(100,80);
	b2.setLocation(225,250);
    add(b2);
    b3=new Button("%");
    b3.setSize(100,80);
	b3.setLocation(330,250);
    add(b3);
    b4=new Button("7");
    b4.setSize(100,80);
	b4.setLocation(15,335);
    add(b4);
    b5=new Button("8");
    b5.setSize(100,80);
	b5.setLocation(120,335);
    add(b5);
    b6=new Button("9");
    b6.setSize(100,80);
	b6.setLocation(225,335);
    add(b6);
    b7=new Button("*");
    b7.setSize(100,80);
	b7.setLocation(330,335);
    add(b7);
    b8=new Button("4");
    b8.setSize(100,80);
	b8.setLocation(15,420);
    add(b8);
    b9=new Button("5");
    b9.setSize(100,80);
	b9.setLocation(120,420);
    add(b9);
    b10=new Button("6");
    b10.setSize(100,80);
	b10.setLocation(225,420);
    add(b10);
    b11=new Button("-");
    b11.setSize(100,80);
	b11.setLocation(330,420);
    add(b11);
    
    b12=new Button("1");
    b12.setSize(100,80);
	b12.setLocation(15,505);
    add(b12);
    b13=new Button("2");
    b13.setSize(100,80);
	b13.setLocation(120,505);
    add(b13);
    b14=new Button("3");
    b14.setSize(100,80);
	b14.setLocation(225,505);
    add(b14);
    b15=new Button("+");
    b15.setSize(100,80);
	b15.setLocation(330,505);
    add(b15);
    
    b16=new Button("00");
    b16.setSize(100,80);
	b16.setLocation(15,590);
    add(b16);
    b17=new Button("0");
    b17.setSize(100,80);
	b17.setLocation(120,590);
    add(b17);
    b18=new Button(".");
    b18.setSize(100,80);
	b18.setLocation(225,590);
    add(b18);
    b19=new Button("=");
    b19.setSize(100,80);
	b19.setLocation(330,590);
    add(b19);
	b.addActionListener(this);
    b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b10.addActionListener(this);
	b11.addActionListener(this);
	b12.addActionListener(this);
	b13.addActionListener(this);
	b14.addActionListener(this);
	b15.addActionListener(this);
	b16.addActionListener(this);
	b17.addActionListener(this);
	b18.addActionListener(this);
	b19.addActionListener(this);
	
  }  
   public void actionPerformed(ActionEvent e)
   {
	 Button b123=(Button)e.getSource();  
	 String s1=tx.getText();
	 String s2=b123.getLabel();
	 if(e.getSource()==b19)
	 {
	  try{
	         ScriptEngineManager mgr = new ScriptEngineManager();
             ScriptEngine engine = mgr.getEngineByName("js"); 
		     tx.setText(""+engine.eval(s1));
		 }
	 catch(Exception e1){}
	 }
	 else if(e.getSource()==b2 && s1.length()!=0)
	 {
		 tx.setText(""+s1.substring(0,s1.length()-1)); 
	 }	
     else if(e.getSource()==b1)
	 {
		 tx.setText("");
	 }
	 else if(e.getSource()!=b2)
	 {
	 tx.setText(""+s1+s2);
	 }
	 
   }
}

class demo4
{
  public static void main(String ar[])
  {  
	Fdemo f=new Fdemo();
	f.setVisible(true);
	f.setSize(450,690);
	f.setLocation(100,100);
    f.setBackground(Color.white);
  }	
}
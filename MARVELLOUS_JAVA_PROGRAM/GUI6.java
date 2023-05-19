import java.awt.*;
import java.awt.event.*;

class MarvellousWindow extends Frame implements ActionListener
{
	public Button b1;
	public TextField t1;
	
	public MarvellousWindow(String str,int x,int y)
	{
		super();
		setSize(x,y);
		setTitle(str);
		
		b1=new Button("Submit");
		t1=new TextField();
		b1.setBounds(50,50,100,50);
		t1.setBounds(50,100,100,50);
		add(b1);
		add(t1);
		
		b1.addActionListener(this);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent obj)
	{
		t1.setText("JAVA");
}
}
class GUI6
{
	public static void main(String arg[]) 
	{
		MarvellousWindow mobj=new MarvellousWindow("First",500,500);
	
}
}










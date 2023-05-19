import java.awt.*;

class MarvellousWindow extends Frame
{
public MarvellousWindow(String str,int x,int y)
{
		super();
		setSize(x,y);
		setTitle(str);
		setVisible(true);
}
}
class GUI3
{
	public static void main(String arg[]) 
	{
		MarvellousWindow mobj=new MarvellousWindow("First",500,500);
		MarvellousWindow mobj1=new MarvellousWindow("Second",200,200);
	
}
}










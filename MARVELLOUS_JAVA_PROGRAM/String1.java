import java.lang.String;
public class String1
{

	public static void main(String[] args)
	{
		String name="Harry";
		System.out.println("NAME OF STRING:"+name);
		
        int value=name.length();
        System.out.println("String Length is:"+value);
		
		String value1=name.toLowerCase();
        System.out.println("toLowerCase METHOD:"+value1);
		
		String value2=name.toUpperCase();
        System.out.println("toUpperCase METHOD:"+value2);
		
		String nts="     Sahane    ";
		System.out.println(nts);
		System.out.println("TREIM METHOD:"+nts.trim());
		
		System.out.println("SUBSTRING METHOD:"+name.substring(3));
		System.out.println("SUBSTRING METHOD 1st to end:"+name.substring(1,4));
		
        System.out.println("REPLACE METHOD:"+name.replace("Harry","pranit"));
        System.out.println("REPLACE METHOD:"+name.replace('r','p'));
        System.out.println("REPLACE METHOD:"+name.replace("r","ps"));
        
        System.out.println("startsWith METHOD:"+name.startsWith("Har"));	//ture nd false
        System.out.println("endssWith METHOD:"+name.endsWith("arry"));	//ture nd false
        System.out.println("CharAt METHOD:"+name.charAt(4));
        System.out.println("Indexof METHOD:"+name.indexOf("rry"));	//Index postion
        
        String ps="Harryrry";
        System.out.println("Indexof METHOD:"+ps.indexOf("rry"));	//Index postion
        System.out.println("Indexof METHOD:"+ps.indexOf("rry",4));	//Index postion
        System.out.println("equals METHOD:"+name.equals("Harry"));
        System.out.println("equals METHOD:"+name.equalsIgnoreCase("HarRy"));
        
	}

}

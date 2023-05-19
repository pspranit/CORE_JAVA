import java.lang.String;
public class String
{
    public static void main(String[]Args)
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
		System.out.println("SUBSTRING METHOD 1st to end:"+name.substring(0,5));
		
		
		
    }
}

	
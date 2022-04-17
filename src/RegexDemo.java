import java.util.Scanner;
import java.util.regex.*;

public class RegexDemo
{
public static void validfirst(String str1)
{
	String regex="[A-Z ][a-z]*";
	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(str1);
	if(m.find())
	{
		System.out.println("yes valid name ");
	}
	else 
	{
		System.out.println("no not a valid name ");
	}
	

}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the name ");
		String name=s.nextLine();
		 validfirst(name);
		 }
	}
		



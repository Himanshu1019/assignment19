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
		System.out.println("yes valid firstname ");
	}
	else 
	{
		System.out.println("no not a valid firstname ");
	}
	

}


public static void validlast(String str1)
{
	String regex="[A-Z ][a-z]*";
	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(str1);
	if(m.find())
	{
		System.out.println("yes valid lastname ");
	}
	else 
	{
		System.out.println("no not a valid lastname ");
	}
	

}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the firstname ");
		String firstname=s.nextLine();
		System.out.println("please enter the lastname ");
		String lastname=s.nextLine();
		 validfirst(firstname);
		 
		 validlast(lastname);
		 }
	}
		



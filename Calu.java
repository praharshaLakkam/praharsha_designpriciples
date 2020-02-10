package epam.task3;
import java.util.*;
public class Calu {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the calculation you want perform");
		String s1=sc.next();
		System.out.println("Enter the two numbers");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		addition a=new addition();
		subtraction s=new subtraction();
		multiplication m=new multiplication();
		division d=new division();
		if(s1.equals("addition"))
		{
			a.addi(n,n1);
		}
		else if(s1.equals("subtract"))
		{
			s.subt(n,n1);
		}
		else if(s1.equals("multiplication"))
		{
			m.mult(n,n1);
		}
		else if(s1.equals("division"))
		{
			d.divi(n,n1);
		}
		
	}

}

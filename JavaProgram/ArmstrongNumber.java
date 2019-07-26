package JavaProgram;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int num=371;
		int tem;
		int rem=0;
		int cube=0;
		tem=num;
		
		
		
		while(num>0)
		{
	     rem=num%10;
	     cube=cube+rem*rem*rem;
	     num=num/10;
		}
		
		if(tem==cube)
		{
			System.out.println("number is armstrong.....");
		}
		else
		{
			System.out.println("number is not armstrong....");
		}
		
		
		
	     

	}

}

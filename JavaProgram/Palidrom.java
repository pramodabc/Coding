package JavaProgram;

public class Palidrom {

	public static void main(String[] args) 
	{
		int num=151;
		int sum=0;
		int temp;
		temp=num;
		
		
	
	while(num>0)   {
		
		//int rem=num%10;
	 sum=sum*10+num%10;
	 
	num= num/10;
	
	System.out.println(sum);
	System.out.println(num);
	
	}
	
	if(temp==sum)
	{
		System.out.println("num is palidrom");
	}
	
	
	
		
		
		
		
	}

}


public class MethodOver
{
	
	/*public void m1(byte b)
	{
		System.out.println("byte method");
	}
	
	public void m1(short s)
	{
		System.out.println("short method");
	}
	
	public void m1(int i)
	{
		System.out.println("integer method");
	}*/
	
	public void m1(Byte b1)
	{
		System.out.println("Byte method");
		System.out.println("B1");
	}
	
	public void m1(Short s1)
	{
		System.out.println("Short method");
	}
	
	public void m1(Integer i1 )
	{
		
		System.out.println("Integer method");
	}

	public void m1(Long l)
	{
		
		System.out.println("Long method");
	}
	public void m1(Float f )
	{
		
		System.out.println("Float method");
	}

	
	public void m1(Double d)
	{
		System.out.println("Double method");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		MethodOver method=new MethodOver();
		
		/* method.m1((short)(10));
		 method.m1(10);
		 method.m1((byte)(10));*/
		
		method.m1(-0.123f);
		method.m1((Integer)(2222));
		method.m1(11111);
		method.m1(12);
		
		
		
		
		
			

		 
	}

}

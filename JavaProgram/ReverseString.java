package JavaProgram;

public class ReverseString {

	public static void main(String[] args)
	{
		String s="PramoD";
		
		char[] c = s.toCharArray();
		
	//	for(int i=0;i<c.length;i++)
		
		for(int i=c.length-1;i>=0;i--)
		{
			
			System.out.println(c[i]);
			
		}

	}

}

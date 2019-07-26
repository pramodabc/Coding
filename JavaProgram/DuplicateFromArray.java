package JavaProgram;

public class DuplicateFromArray {

	public static void main(String[] args)
	{
		int [] a= {1,2,3,4,1,5,3,4,5
				};
	   int lenghts=	a.length;
	   
	   System.out.println(lenghts);
		
		for(int i=0;i<lenghts-1;i++)
			for(int j=i+1;j<lenghts;j++)
			{
				
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}		

	}

}

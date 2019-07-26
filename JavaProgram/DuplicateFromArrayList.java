package JavaProgram;

import java.util.ArrayList;
import java.util.List;

public class DuplicateFromArrayList {

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(12);
		
		System.out.println(list);
		
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
                       {
                    	   
                    	   System.out.println(list.get(i));
                       }

			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

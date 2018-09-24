package sundayclass012118;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

class Arrays031118 {

	public static void main(String[] args) 
	{
		
	/*int a=10;
	 a=20;
	 
	 System.out.println(a);*/
		
		List<String>a= new ArrayList<>();
		
		a.add("tom");
		a.add("Sunday");
		a.add("polo");
		
		
		/*System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));*/
		
		for (int i=0;i<3;i++)
		
		//for(int i=0;i<a.size();i++)	
		{
			System.out.println(a.get(i));
		}

	}

}

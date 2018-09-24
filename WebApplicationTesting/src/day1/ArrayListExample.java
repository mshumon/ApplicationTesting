package day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		
		/*int a=10;
		a=5;
		System.out.println(a);*/
		
		List<String>a= new ArrayList<>();
		a.add("Shumon");
		a.add("Hello");
		a.add("Polo");
		a.add("Hiiii");
		
		
		/*System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));*/
		
		//for(int i=0;i<4;i++) // 0+1=1;
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
			
		}

	}

}

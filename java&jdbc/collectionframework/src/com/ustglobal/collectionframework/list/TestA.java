package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(22.5);
		al.add("sita");
		al.add(true);
		al.add(null);
		al.add('A');
		al.add('A');
		Object o=al.get(2);
		System.out.println(o);
		System.out.println("********************");
				
		
		for(int i=0;i<6;i++)
		{
			Object obj = al.get(i);
		
		System.out.println(obj);
		}
	}

}

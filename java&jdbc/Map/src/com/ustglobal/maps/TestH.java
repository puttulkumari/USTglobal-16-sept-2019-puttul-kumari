package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101,"ajay");
		ht.put(702,"vijay");
		ht.put(100,"sonu");
		ht.put(99,"monu");
		ht.put(101,"sriram");
		ht.put(605,"xx");
		ht.put(208,"jj");
		
		
		
		//ht.put(101,null);    //can't use throw -NullPointerException
		//ht.put(null,"john"); //null cannot use in hash map-NullPointerException
		
		System.out.println("data :"+ht);//random orders
	}

}

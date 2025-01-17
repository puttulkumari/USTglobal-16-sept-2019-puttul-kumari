package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {
public static void main(String[] args) {
	
	System.out.println("main started");
	System.out.println(Thread.currentThread().getId());
	
	MyIdThread mi = new MyIdThread();
	System.out.println("my id thread :"+mi.getId());
	
	//mi.setId();  we can't set the id
	System.out.println("priority "+Thread.currentThread().getPriority());
	//Thread.currentThread().setPriority(19);      // IllegalArgumentException
	
	System.out.println("main ended");
}
}

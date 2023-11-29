package com.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeEventTest implements ServletRequestAttributeListener {

	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println("..........................");
		System.out.println("attributeadded method has been called in"+this.getClass().getName());
		
		System.out.println("Newly added Attributed Name" +event.getName()+" value"+event.getValue());
		
		System.out.println("...............................");
		
	}
	
	public void attributeRemove(ServletRequestAttributeEvent event) {
		System.out.println("..........................");
		System.out.println("attributeRemove  method has been called in"+this.getClass().getName());
		
		System.out.println(" Remove attribute name " +event.getName()+" value"+event.getValue());
		
		System.out.println("...............................");
		
	}
}

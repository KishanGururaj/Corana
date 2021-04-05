package com.wolken.wolkenapp;

import com.wolken.wolkenapp.exception.CornanaException;

public class CoronaTester {
	public static void main(String[] args) {
		
		System.out.println("main method entered ");
		Bbmp bbmp=new Bbmp();
		try {
			bbmp.check(101.00);
		} catch (CornanaException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		Bbmp bbmp1=new Bbmp();
		try {
			bbmp1.check(99.00);
		} catch (CornanaException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}
	

}

package com.wolken.wolkenapp;

import com.wolken.wolkenapp.exception.CornanaException;


public class Bbmp {
	public void check(double temp)throws CornanaException {
		if(temp>100.00) {
			System.out.println("carona bantu ninge");
		}
		else {
			throw new CornanaException();
		}
	}

}

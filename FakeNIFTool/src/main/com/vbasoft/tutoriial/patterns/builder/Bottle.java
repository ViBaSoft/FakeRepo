package com.vbasoft.tutoriial.patterns.builder;

public class Bottle extends Packing{

	@Override
	public void pack() {
		// TODO Auto-generated method stub
		System.out.println("Packing cold drink labeled: " + getLabel() );
	}
	
	

}

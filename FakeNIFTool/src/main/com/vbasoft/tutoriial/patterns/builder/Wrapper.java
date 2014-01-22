package com.vbasoft.tutoriial.patterns.builder;

public class Wrapper extends Packing{

	@Override
	public Packing pack() {
		// TODO Auto-generated method stub
		setLabel(getLabel() + "Packing Burger n labeled: ");
		return this;
	}
	
	

}

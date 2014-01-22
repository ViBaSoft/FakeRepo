package com.vbasoft.tutoriial.patterns.builder;

public class VegBurger implements Item {

	Packing wrapper = new Wrapper();
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 5.45; //$5.45
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Veg Cheese Burger";
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		wrapper.setLabel(getName());
		return wrapper.pack();
	}

}

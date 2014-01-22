package com.vbasoft.tutoriial.patterns.builder;

public interface Item {

	public String getName();
	public double getPrice();
	public Packing packing();
}

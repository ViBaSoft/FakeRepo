package com.vbasoft.tutoriial.patterns.builder;

public abstract class Packing {
	private String label;
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public abstract Packing pack();

}

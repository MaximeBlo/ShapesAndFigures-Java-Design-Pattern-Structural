package fr.iutvalence.info.dut.m3105.preamble;

public abstract class Shape {

	
	public void draw(Position pos){
		System.out.println("Drawing "+this.toString() + " at " + pos.toString());
	}
	
}

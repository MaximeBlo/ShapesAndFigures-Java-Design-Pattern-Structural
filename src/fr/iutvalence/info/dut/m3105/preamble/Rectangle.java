package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape{

	private int height;
	private int Width;
	
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.Width = width;
	}
	
	public String toString(){
		return "Rectangle (w="+this.Width+", h="+this.height+")";
	}
	
	
}

package fr.iutvalence.info.dut.m3105.preamble;


public class BorderDecorator extends ShapeDecorator{
	private int thickness;
	
	public BorderDecorator(int thick, Shape aShape){
		this.thickness = thick;
		this.theShape = aShape;
	}
	
	@Override
	public String toString(){
		return this.theShape.toString()+", with border(t="+this.thickness+")";
	}
}

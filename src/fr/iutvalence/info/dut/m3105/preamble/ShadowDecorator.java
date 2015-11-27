package fr.iutvalence.info.dut.m3105.preamble;

public class ShadowDecorator extends ShapeDecorator {
	private int angle;
	private int intensity;
	
	public ShadowDecorator(int a, int i, Shape aShape) {
		this.angle = a;
		this.intensity = i;
		this.theShape = aShape;
	}

	@Override
	public String toString() {
		return this.theShape.toString()+", with(a="+this.angle+"and i="+this.intensity+")";
	}
}

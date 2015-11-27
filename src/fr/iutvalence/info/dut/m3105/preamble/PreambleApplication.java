package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(5);
		Rectangle rect = new Rectangle(3, 5);

		circle.draw(new Position(0,0));
		rect.draw(new Position(3,3));
		Shape s = new BorderDecorator(2, circle);
		s.draw(new Position(0, 0));
		s = new ShadowDecorator(90, 3, s);
		s.draw(new Position(1, 1));
	}

}

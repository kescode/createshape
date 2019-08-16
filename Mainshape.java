package createshape;
import java.util.Scanner;
import createshape.Circle;
import createshape.Square;
import createshape.Triangle;
import createshape.Shape;

public class Mainshape {

	public static void main(String[] args) {
		
		Shape pent = new Shape();
		Shape rect = new Shape();
		Triangle tri = new Triangle();
		Square sq = new Square();
		
		pent.setType("pentagon");
		pent.setColor("red");
		pent.setSides(5);
		pent.setWidth(20);
		pent.setLength(20);
		
		rect.setType("rectangle");
		rect.setColor("green");
		rect.setSides(4);
		rect.setWidth(40);
		rect.setLength(20);
		
		System.out.println("Your shape is a "+ pent.getColor() + " " + pent.getType() + ", has " + pent.getSides() + " sides and is " + pent.getWidth() + " units wide and is " + pent.getLength() + " units long.");		
		
		System.out.println("Your shape is a "+ rect.getColor() + " " + rect.getType() + ", has " + rect.getSides() + " sides and is " + rect.getWidth() + " units wide and is " + rect.getLength() + " units long.");						

		System.out.println("Your shape is a "+ tri.getColor() + " " + tri.getType() + ", has " + tri.getSides() + " sides and is " + tri.getWidth() + " units wide and is " + tri.getLength() + " units long.");		

		System.out.println("Your shape is a "+ sq.getColor() + " " + sq.getType() + ", has " + sq.getSides() + " sides and is " + sq.getWidth() + " units wide and is " + sq.getLength() + " units long.");		

	}

}

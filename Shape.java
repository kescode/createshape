package createshape;


public class Shape {

	private String type;
	private String color;
	private int sides;
	private int width;
	private int length;
	
		public Shape() {
			this.type = "Hexagon";
			this.color = "White";
			this.sides = 6;
			this.width = 20;
			this.length = 20;
		} 
		
		
		public void Shape(String type, String color, int sides, int width, int length) {
			this.type = type;
			this.color = color;
			this.sides = sides;
			this.width = width;
			this.length = length;
		}
		
		
		public String getType() {
			return type;
		}

		
		public String getColor() {
			return color;
		}
		
		
		public int getSides() {
			return sides;
		}
		
		public int getWidth() {
			return width;
		}
		
		
		public int getLength() {
			return length;
		}
		
		public void setType(String type) {
			this.type = type;
		}
		
		
		public void setColor(String color) {
			this.color = color;
		}
		
		
		public void setSides(int sides) {
			this.sides = sides;
		}
		
		public void setWidth(int width) {
			this.width = width;
		}
		
		
		public void setLength(int length) {
			this.length = length;
		}
		
		}

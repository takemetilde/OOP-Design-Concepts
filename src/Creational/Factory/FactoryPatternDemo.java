package Creational.Factory;

public class FactoryPatternDemo {

	public static void main(String[] args){
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		// Instantiate an object of circle and call its draw() method
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		
		// Instantiate an object of rectangle and call its draw() method
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		// Instantiate an object of circle and call its draw() method
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();
		
	}
}

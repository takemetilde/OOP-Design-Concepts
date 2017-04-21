package Creational.Factory;

public class ShapeFactory {

	// Method to get object of type shape
	public Shape getShape(String shapeType){
		
		// Returns null if shape type is empty
		if(shapeType == null){
			return null;
		}
		
		// Instantiates new shape object based on input argument
		if(shapeType.equalsIgnoreCase("circle")){
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase("square")){
			return new Square();
		} 
		
		return null;
			
	}
	
}

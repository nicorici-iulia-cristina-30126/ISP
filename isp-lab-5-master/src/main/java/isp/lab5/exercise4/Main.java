package isp.lab5.exercise4;

public class Main {
    public static void main(String[] args) {
        AbstractShapeFactory roundedShapeFactory = ShapeFactoryProvider.getShapeFactory("rounded");
        AbstractShapeFactory normalShapeFactory = ShapeFactoryProvider.getShapeFactory("normal");
        AbstractShapeFactory normalSquareShapeFactory = ShapeFactoryProvider.getShapeFactory("normal square");
        AbstractShapeFactory roundedSquareShapeFactory = ShapeFactoryProvider.getShapeFactory("rounded square");
        

        // create instances
        Shape rectangle = roundedShapeFactory.getShape("roundedRectangle");
        Shape shape = normalShapeFactory.getShape("rectangle");
        Shape square = normalSquareShapeFactory.getShape("square");
        Shape rounded = roundedSquareShapeFactory.getShape("roundedSquare");
        
        rectangle.draw();
        shape.draw();
        square.draw();
        rounded.draw();
    }
}
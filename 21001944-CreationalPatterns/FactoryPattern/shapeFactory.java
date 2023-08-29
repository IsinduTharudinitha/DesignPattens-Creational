public class shapeFactory {
    public shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new rectangle();
        }
        else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new square();
        }
        return null;
    }
}

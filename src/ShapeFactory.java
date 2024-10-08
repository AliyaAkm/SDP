import java.util.HashMap;
import java.util.Map;
class ShapeFactory {
    private static final Map<String, FlyweightShape> circleMap = new HashMap<>();

    public static FlyweightShape getCircle(String color) {
        FlyweightCircle circle = (FlyweightCircle) circleMap.get(color);
        if (circle == null) {
            circle = new FlyweightCircle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
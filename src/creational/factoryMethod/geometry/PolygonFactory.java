package creational.factoryMethod.geometry;

import java.util.HashMap;
import java.util.Map;

public class PolygonFactory {

    private static final Map<Integer, Polygon> polygons  = new HashMap<Integer, Polygon>() {{
        put(2, new Square());
        put(3, new Triangle());
    }};


    public static Polygon createPolygon(int numberOfSide){
        if(!polygons.containsKey(numberOfSide)){
            throw new IllegalArgumentException("Invalid number of side");
        }
        return polygons.get(numberOfSide);
    }
}

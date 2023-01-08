package creational.factoryMethod.geometry;

public class TestPolygon {
    public static void main(String[] args) {
        Polygon polygon = PolygonFactory.createPolygon(5);
        assert polygon != null;
        System.out.println(polygon.getDescription());
    }
}

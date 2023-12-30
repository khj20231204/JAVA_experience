package genericMethod.ex;

public class GenericMethod {

    public static <T,V> double staticMakeRectangle(Point<T,V> p1, Point<T,V> p2){

        double left = ((Number) p1.x).doubleValue();  //T
        double right = ((Number) p2.x).doubleValue();  //V
        double top = ((Number) p1.y).doubleValue();  //T
        double bottom = ((Number) p2.y).doubleValue();  //V

        double width = right - left;
        double height = top - bottom;

        return width * height;
    }

    public <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2){

        double left = ((Number) p1.x).doubleValue();  //T
        double right = ((Number) p2.x).doubleValue();  //V
        double top = ((Number) p1.y).doubleValue();  //T
        double bottom = ((Number) p2.y).doubleValue();  //V

        double width = right - left;
        double height = top - bottom;

        return width * height;
    }

}

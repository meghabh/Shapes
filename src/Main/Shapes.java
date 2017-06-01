import java.util.ArrayList;
import java.util.List;

/**
 * Created by meghah on 6/1/17.
 */
public class Shapes {

    List<Shape> allShapes;

    public Shapes() {
        allShapes = new ArrayList<>();
    }

    public boolean isEmpty() {
        return allShapes.isEmpty();
    }

    public void add(Shape shape) {
        if(shape == null)
            throw  new IllegalArgumentException();
        allShapes.add(shape);
    }

    public int getTotalArea() {
        int sum = 0;
        for(Shape shape : allShapes)
            sum += shape.getArea();
        return sum;
    }
}

/**
 * Created by meghah on 6/1/17.
 */
public class Square implements Shape {
    private int side;

    public Square(int side) {
       super();
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

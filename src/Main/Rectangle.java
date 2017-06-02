/**
 * Created by meghah on 6/1/17.
 */
public class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public Rectangle scaleRectangleByTwo(int scalingFactor) {

        int length = scalingFactor * this.length;
        int width = scalingFactor * this.width;
        Rectangle scaledrectangle = new Rectangle(length, width);
        return scaledrectangle;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Rectangle))
            return false;
        Rectangle rectangle = (Rectangle) obj;
        return (this.length == rectangle.length && this.width == rectangle.width);

    }

    public int getlength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

}

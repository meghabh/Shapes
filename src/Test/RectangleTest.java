import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by meghah on 6/1/17.
 */
public class RectangleTest {

    @Test
    public void shouldCalculateArea()
    {
        Rectangle rectangle=new Rectangle(2,3);
        assertEquals(6,rectangle.getArea());
    }
    @Test
    public void shouldScaleRectangleByTwo()
    {

        assertEquals(new Rectangle(4,6),new Rectangle(2,3).scaleRectangleByTwo(2));
    }
    @Test
    public void shouldGetLength()
    {
        assertEquals(4,new Rectangle(4,3).getlength());
    }
    @Test
    public  void shouldGetWidth()
    {
        assertEquals(3,new Rectangle(4,3).getWidth());
    }
    @Test
    public void equalityCheckWithNullShouldReturnFalse()
    {
        assertEquals(false,new Rectangle(4,3).equals(null));

    }
    @Test
    public void equalityCheckwithDifferentType()
    {
        assertEquals(false,new Rectangle(4,3).equals(new Object())
        );
    }
}

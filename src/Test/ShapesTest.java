import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by meghah on 6/1/17.
 */
public class ShapesTest {
    @Test
    public void newShapesBasketShouldBeEmpty() {
        Shapes shapes = new Shapes();
        assertTrue(shapes.isEmpty());
    }

    @Test
    public void shapesBasketShouldNotBeEmptyAfterFirstInsertion() {
        Shapes shapesBasket = new Shapes();
        Shape shape = new Rectangle(3, 4);
        shapesBasket.add(shape);
        assertFalse(shapesBasket.isEmpty());
    }
    @Test
    public void shouldBeAbleToAddSquareToBasket(){
        Shapes shapesBasket = new Shapes();
        Shape shape = new Square(6);
        shapesBasket.add(shape);
        assertFalse(shapesBasket.isEmpty());
    }
    @Test
    public void shouldBeAbleToComputeSumOfArea(){
        Shapes shapesBasket = new Shapes();
        shapesBasket.add(new Rectangle(4,5));
        shapesBasket.add(new Square(4));
        shapesBasket.add(new Square(10));
        shapesBasket.add(new Rectangle(6,8));
        shapesBasket.add(new Rectangle(3,9));
        assertEquals(211, shapesBasket.getTotalArea());
    }

    @Test
    public void addingNullShouldThrowException(){
        Shapes shapes = new Shapes();
        try{
            shapes.add(null);
            fail("Expecting IllegalArgumentException, caught no exception.");
        }catch(IllegalArgumentException e){}
        catch (Exception e){
            fail("Expecting IllegalArgumentException, caught exception - " + e);
        }
    }
}

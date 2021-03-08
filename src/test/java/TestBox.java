import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/***
 * Тесты для класса Box.
 */
public class TestBox {

    @Test
    public void tsetEmptyBoxWeight(){
        Box<Orange> orangeBox = new Box<>();
        float desiredZeroWeight = orangeBox.getWeight();
        assertEquals(0, desiredZeroWeight);
    }

    @Test
    public void testOneOrangeStoredBoxWeight(){
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        float desiredZeroWeight = orangeBox.getWeight();
        assertEquals(1.5f, desiredZeroWeight);
    }

    @Test
    public void pourFromBoxAtoBoxBAndDesiredEmptyA(){
        Box<Apple> a = new Box<>();
        Box<Apple> b = new Box<>();
        a.addFruit(new Apple());
        a.addFruit(new Apple());

        b.addFruit(new Apple());

        a.pourToOtherBox(b);

        assertEquals(0, a.getFuits().size());
        assertEquals(3, b.getFuits().size());
    }


}

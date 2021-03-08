import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTaskOne {

    @Test
    public void testArraySwap(){
        Task1and2 tasks = new Task1and2();
        Apple[] apples = {new Apple("Yellow apple"), new Apple("Red apple")};
        tasks.swap(apples, 0, 1);
        assertEquals(apples[0].getName(), "Red apple");
        assertEquals(apples[1].getName(), "Yellow apple");

    }

    @Test
    public void testAddArrayToListAndDesiredSize2(){

        String[] inputs = {"aaa", "bbb"};
        List<String> outputs = Task1and2.asList(inputs);
        assertEquals(2, outputs.size());
    }

    @Test
    public void testConvertArrayToList(){

        String[] inputs = {"aaa", "bbb", "ccc"};
        List<String> outputs = Task1and2.asList(inputs);
        assertEquals("aaa", outputs.get(0));
        assertEquals("bbb", outputs.get(1));
        assertEquals("ccc", outputs.get(2));

    }
}

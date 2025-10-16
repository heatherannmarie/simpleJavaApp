import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class appTest {
    @Test
    public void testAdd() {
        int input1 = 8;
        int input2 = 4;
        assertTrue(App.add(input1, input2) == 12);
        assertTrue(App.subtract(input1, input2) == 4);
        assertTrue(App.multiply(input1, input2) == 32);
        assertTrue(App.divide(input1, input2) == 2);
        
    }
}

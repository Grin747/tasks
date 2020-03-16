package task2;

import org.junit.Assert;
import org.junit.Test;

public class DiscountTests {
    @Test
    public void regularData() {
        int[] original = new int[]{
                10, 4, 8, 124, 159, 14, 456, 981
        };
        int[] expected = new int[]{
                4, 62, 79, 7
        };

        int[] actual = Main.decryptData(original, 50, 2, 4);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void excessiveReadLength(){
        int[] original = new int[]{
                10, 4, 8, 124, 159, 14, 456, 981
        };
        int[] expected = new int[]{
                4, 62, 79, 7, 228, 490
        };

        int[] actual = Main.decryptData(original, 50, 2, 40);

        Assert.assertArrayEquals(expected, actual);
    }
}
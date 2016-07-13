package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by roosevelt on 7/13/16.
 */
public class SnakeTest {
    Snake mSerpent;

    @Test
    public void testIfSnakeMakesAppropriateSound() throws Exception {
        mSerpent = new Snake(true);
        String expectedValue = "Hiss!!!";
        String actualValue = mSerpent.makeNoise();

        assertEquals("Serpent does not make the right sound!", expectedValue,actualValue);
    }

    @Test
    public void testIfSnakeHasAppropriateTopSpeed() throws Exception {
        mSerpent = new Snake(true);
        int expectedValue = 5;
        int actualValue = mSerpent.getTopSpeed();

        assertEquals("Serpent does not have the right speed!", expectedValue, actualValue);

    }
}

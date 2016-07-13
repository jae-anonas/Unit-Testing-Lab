package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by roosevelt on 7/13/16.
 */
public class LionTest {
    Lion mSimba;

    @Test
    public void testIfLionMakesAppropriateSound() throws Exception {
        mSimba = new Lion(true);
        String expectedValue = "Roar!!!";
        String actualValue = mSimba.makeNoise();

        assertEquals("Simba does not make the right sound!", expectedValue,actualValue);
    }

    @Test
    public void testIfLionHasAppropriateTopSpeed() throws Exception {
        mSimba = new Lion(true);
        int expectedValue = 50;
        int actualValue = mSimba.getTopSpeed();

        assertEquals("Simba does not have the right speed!", expectedValue, actualValue);

    }

}

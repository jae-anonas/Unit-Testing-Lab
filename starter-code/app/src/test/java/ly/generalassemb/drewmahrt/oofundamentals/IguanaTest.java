package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by roosevelt on 7/13/16.
 */
public class IguanaTest {
    Iguana mJohnny;

    @Test
    public void testIfIguanaMakesAppropriateSound() throws Exception {
        mJohnny = new Iguana(true);
        String expectedValue = "Purrrrr...";
        String actualValue = mJohnny.makeNoise();

        assertEquals("Iguana does not make the right sound!", expectedValue,actualValue);
    }

    @Test
    public void testIfSnakeHasAppropriateTopSpeed() throws Exception {
        mJohnny = new Iguana(true);
        int expectedValue = 22;
        int actualValue = mJohnny.getTopSpeed();

        assertEquals("Iguana does not have the right speed!", expectedValue, actualValue);

    }
}

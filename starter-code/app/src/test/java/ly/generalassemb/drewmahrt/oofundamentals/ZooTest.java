package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by roosevelt on 7/13/16.
 */
public class ZooTest {
    Zoo newYorkCityZoo;
    @Test
    public void testIfZooAddsAnimals() throws Exception {
        newYorkCityZoo = Zoo.getInstance();
        Lion expectedLion = new Lion(true);

        //add an animal
        newYorkCityZoo.addAnimal(expectedLion);

        //get animal from Zoo animals list, should be the same as the one added
        Lion actualLion = (Lion) newYorkCityZoo.getAnimals().get(0);

        assertSame("Not the same Lion", expectedLion,actualLion);
    }

    @Test
    public void testIfZooRemovesAnimals() throws Exception {
        newYorkCityZoo = Zoo.getInstance();

        //add an animal first
        Snake addedSnake = new Snake(true);
        newYorkCityZoo.addAnimal(addedSnake);

        //get the number of animals
        int zooCurrentPopulation = newYorkCityZoo.getAnimals().size();

        //remove added animal
        newYorkCityZoo.removeAnimal(addedSnake);

        //check size of animals ArrayList, should be 1 less
        // than zooCurrentPopulation
        int expectedSize = zooCurrentPopulation - 1;
        int actualSize = newYorkCityZoo.getAnimals().size();

        assertEquals("Zoo did not remove animal!", expectedSize, actualSize);
    }

}

package ly.generalassemb.drewmahrt.oofundamentals;

/**
 * Created by roosevelt on 7/13/16.
 */
public class Iguana extends Reptile {
    boolean mIsHerbivore;

    public Iguana(boolean isHerbivore) {
        super(true, 22, false, "Iguana");
        mIsHerbivore = isHerbivore;
    }

    @Override
    public String makeNoise() {
        return "Purrrrr...";
    }

    @Override
    public String toString() {
        return "Iguana" + (mIsHerbivore ? " (Herbivore)" : "");
    }
}

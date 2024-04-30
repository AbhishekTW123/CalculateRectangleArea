package test.java.centimeters;

import main.java.centimeters.Compare;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareTest {

    private final Compare compare = new Compare(1F);

    @Test
    public void shouldCompareToEquals() {

        assertTrue(compare.isEquals(1F));

    }

    @Test
    public void shouldCompareNotToEquals() {

        assertFalse(compare.isEquals(2F));

    }

    @Test
    public void shouldCheckInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> new Compare(-2F));
    }

}

package test.java.centimeters;

import main.java.centimeters.IsEqual;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsEqualTest {

    private final IsEqual isEqual = new IsEqual(1F);

    @Test
    public void shouldCompareToEquals() {

        assertTrue(isEqual.check(1F));

    }

    @Test
    public void shouldCompareNotToEquals() {

        assertFalse(isEqual.check(2F));

    }

    @Test
    public void shouldCheckInvalidLength() {
        assertThrows(IllegalArgumentException.class, () -> new IsEqual(-20F));
    }

}

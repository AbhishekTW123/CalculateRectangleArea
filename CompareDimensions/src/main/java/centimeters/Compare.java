package main.java.centimeters;

public class Compare {
     public float lhs;

    public Compare(float lhs) {
        if (isInvalid(lhs)) {
            throw new IllegalArgumentException("invalid value for lhs");
        }

        this.lhs = lhs;
    }

    public boolean isEquals(float rhs) {
        if (isInvalid(rhs)) {
            throw new IllegalArgumentException("invalid value for rhs");
        }
        return rhs == lhs;
    }

    private static boolean isInvalid(float value) {
        return value < 0.0;
    }
}

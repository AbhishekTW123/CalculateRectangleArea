package main.java.centimeters;

public class IsEqual {

    public float lhs;

    public IsEqual(float lhs) {
        if (checkInvalidValue(lhs)) {
            throw new IllegalArgumentException("invalid value for lhs");
        }

        this.lhs = lhs;
    }

    public boolean check(float rhs) {
        if (checkInvalidValue(rhs)) {
            throw new IllegalArgumentException("invalid value for rhs");
        }
        boolean equals;
        equals = rhs == lhs;
        return equals;
    }

    private static boolean checkInvalidValue(float value) {
        return value < 0.0;
    }
}

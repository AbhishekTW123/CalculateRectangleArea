package org.example;

public class CalculateArea {
    public String rectangle(float length, float width) {
        float result;
        if (checkInvalidValue(length)) {
            return "length is less than or equal to 0";
        }
        if (checkInvalidValue(width)) {
            return "width is less than or equal to 0";
        }

        result = length * width;
        return Float.toString(result);
    }

    private static boolean checkInvalidValue(float value) {

        return value <= 0.0;
    }

}

package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();

        for (int idx = 1; idx < numberOfRows; idx++) {
            sb.append(TriangleUtilities.getRow(idx));
            sb.append('\n');
        }
//        System.out.print(sb.toString());
        return sb.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for (int idx = 0; idx < numberOfStars; idx++) {
            sb.append("*");
        }
        return sb.toString();
    }

    public static String getSmallTriangle() {
//        System.out.print(getTriangle(5));
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
//        System.out.print(getTriangle(10));
        return getTriangle(10);
    }
}

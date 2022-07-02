package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String str = "";
        for (int i =start; i<= stop; i++) {
            if (!(i%2 == 0)) {
                str = (str+i);
//                System.out.print(str);
            }
        }
        return str;
    }


    public static String getOddNumbers(int start, int stop) {
        String str = "";
        for (int i =start; i<stop; i++) {
            if ((i%2 == 0)) {
                str = (str+i);
//                System.out.print(str);
            }
//            else {
//                System.out.println(str + i);
//            }
//            System.out.println();
        }
        return str;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String str = "";
        for (int i = start; i<stop; i+=step) {
            str = str + String.valueOf(i*i);
        }
//        System.out.print(str);
        return str;
    }

    public static String getRange(int stop) {
        return NumberUtilities.getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return NumberUtilities.getRange(start,stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String strB = "";
        for (int i=start; i< stop; i += step) {
            strB = strB + String.valueOf(i);
        }
        return strB;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String str = "";
        for (int i=start; i < stop; i+= step) {
            str = str + String.valueOf((int)Math.pow(i, exponent));
        }
        return str;
    }
}

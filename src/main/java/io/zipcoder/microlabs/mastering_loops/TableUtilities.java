package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
//        int[][] arr = new int[tableSize+1][tableSize+1];
//        StringBuilder sb = new StringBuilder();
//
//        for (int row=1; row<arr.length; row++) {
//            for (int col=1; col<arr[col].length; col++) {
////                System.out.println(sb.append(String.format("%3d |", row, col)));
//
//                sb.append(String.format("%3d |", arr[row][col]));
//            }
////            System.out.println();
//            sb.append("\n");
//        }
//        return sb.toString();
//    }

        StringBuilder sb = new StringBuilder();

        for (int inR=1; inR<=tableSize; inR++) {
            for (int inC=1; inC<=tableSize; inC++) {
                sb.append(String.format("%3d |", inR*inC));
            }
            sb.append("\n");
        }
        return sb.toString();

    }
}

package app;

import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        int[] integerTable  = {1, 2, 3, 4, 5, 20, 30, 40 ,50 ,60};
        int[] secondTable  = {1, 2, 3, 3, 2, 1};
        int[] thirdTable  = {1, 2, 3, 2, 1};

        System.out.println(Arrays.toString(integerTable) + (isPalidrom(integerTable)?" jest palidromem ":" nie jest palidromem"));
        System.out.println(Arrays.toString(secondTable) + (isPalidrom(secondTable)?" jest palidromem ":" nie jest palidromem"));
        System.out.println(Arrays.toString(thirdTable) + (isPalidrom(thirdTable)?" jest palidromem ":" nie jest palidromem"));

    }

    private static boolean isPalidrom(int[] integerTable){
        for (int value = 0 ; value <  integerTable.length; value++) {
            if (integerTable[value] != integerTable[integerTable.length-1 - value]) return false;
        }
        return true;
    }





}

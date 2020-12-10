package task7ConsoleVersion;

import logic.ArrayUtil;

import java.util.Scanner;

public class MainConsole {
    public static void main(String[] args) {
        int large = getLargeOfArray();
        int[] tempArray = new int[large];
        for (int x = 0; x < large; x++) {
            tempArray[x] = getIntValue("Array[" + x + "]");
        }
        ArrayUtil arrayUtil = new ArrayUtil(tempArray);
        showResult(arrayUtil.getNumberOfIdenticalConsecutiveElements(), "Number of consecutive identical elements");
    }

    public static int getIntValue(String valueName) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input " + valueName + ":");

        return scanner.nextInt();
    }

    public static void showResult(int result, String typeOfResult) {
        System.out.print("Result. " + typeOfResult + ":" + result);
    }

    public static boolean isIntValueMoreLowerLimit(int value, int lowerLimit) {
        return value >= lowerLimit;
    }

    public static int getLargeOfArray() {
        while (true) {
            int large = getIntValue("large of Array");
            if (isIntValueMoreLowerLimit(large, 1))
                return large;
            System.out.println("Input ERROR!  Large of Array mast be more then 0. Try Again");
        }
    }
}

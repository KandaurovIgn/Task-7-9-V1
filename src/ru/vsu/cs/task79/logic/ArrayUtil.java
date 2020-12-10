package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayUtil {
    private int array[];

    public ArrayUtil(int[] array) {
        this.array = array;
    }

    public int getNumberOfIdenticalConsecutiveElements() {
        if (array.length > 1) {
            int numberOfDuplicates = 0;
            int repeated = 0;
            for (int x = 0; x < array.length - 1; x++) {
                if (array[x] == array[x + 1]) {
                    numberOfDuplicates++;
                    repeated++;
                    continue;
                }
                if (repeated != 0) {
                    numberOfDuplicates++;
                    repeated = 0;
                }
            }

            if (array[array.length - 2] == array[array.length - 1])
                numberOfDuplicates++;

            return numberOfDuplicates;
        } else
            return 0;


    }

    public int getNumberOfArray(int index) {
        return array[index];
    }

    public void showArray() {
        System.out.print("Array[]: ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + ' ');
        }
    }

    public static int[] toIntArray(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        Integer[] arr = list.toArray(new Integer[0]);
        return ArrayUtil.toPrimitive(arr);
    }

    public static int[] toPrimitive(Integer[] arr) {
        if (arr == null) {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}

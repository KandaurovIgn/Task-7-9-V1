package tests;

import logic.ArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    @org.junit.jupiter.api.Test
    public void test1GetNumberOfConsecutiveIdenticalElements() {
        int[] array = new int[]{1, 1, 1, 1, 1};
        ArrayUtil arrayUtil = new ArrayUtil(array);
        int actual = arrayUtil.getNumberOfIdenticalConsecutiveElements();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void test2GetNumberOfConsecutiveIdenticalElements() {
        int[] array = new int[]{3, 10, 9, 8, 8, 8};
        ArrayUtil arrayUtil = new ArrayUtil(array);
        int actual = arrayUtil.getNumberOfIdenticalConsecutiveElements();
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void test3GetNumberOfConsecutiveIdenticalElements() {
        int[] array = new int[]{5, 8, 8, 1};
        ArrayUtil arrayUtil = new ArrayUtil(array);
        int actual = arrayUtil.getNumberOfIdenticalConsecutiveElements();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void test4GetNumberOfConsecutiveIdenticalElements() {
        int[] array = new int[]{10, 9};
        ArrayUtil arrayUtil = new ArrayUtil(array);
        int actual = arrayUtil.getNumberOfIdenticalConsecutiveElements();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void test5GetNumberOfConsecutiveIdenticalElements() {
        int[] array = new int[]{1};
        ArrayUtil arrayUtil = new ArrayUtil(array);
        int actual = arrayUtil.getNumberOfIdenticalConsecutiveElements();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void test6GetNumberOfConsecutiveIdenticalElements() {
        int[] array = new int[]{000};
        ArrayUtil arrayUtil = new ArrayUtil(array);
        int actual = arrayUtil.getNumberOfIdenticalConsecutiveElements();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}
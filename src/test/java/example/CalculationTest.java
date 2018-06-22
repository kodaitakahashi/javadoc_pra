package example;

import org.junit.Assert;
import org.junit.Test;

public class CalculationTest {

    @Test
    public void 整数値1と整数値1をaddに渡すと整数値2が返ってくる() {
        int actual = Calculation.add(1, 1);

        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void 整数値1_2_3をaddに渡すと整数値6が返ってくる() {

        int[] nums = { 1, 2, 3 };
        int actual = Calculation.add(nums);

        int expected = 6;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Integer型の1とByte型の1をaddに渡すと整数値2が返ってくる() {
        Integer num1 = Integer.valueOf("1");
        Byte num2 = Byte.valueOf("1");
        int actual = Calculation.add(num1, num2);

        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Integer型の1とShort型の1をaddに渡すと整数値2が返ってくる() {
        Integer num1 = Integer.valueOf("1");
        Short num2 = Short.valueOf("1");
        int actual = Calculation.add(num1, num2);

        int expected = 2;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void Integer型の1とInteger型の1をaddに渡すと整数値2が返ってくる() {
        Integer num1 = Integer.valueOf("1");
        Integer num2 = Integer.valueOf("1");
        int actual = Calculation.add(num1, num2);

        int expected = 2;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void Integer型の1とLong型の1をaddに渡すと整数値2が返ってくる() {
        Integer num1 = Integer.valueOf("1");
        Long num2 = Long.valueOf("1");
        int actual = Calculation.add(num1, num2);

        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Integer型の1とFloat型の2_1をaddに渡すと整数値3が返ってくる() {
        Integer num1 = Integer.valueOf("1");
        Float num2 = Float.valueOf("2.1");
        int actual = Calculation.add(num1, num2);

        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Integer型の1とDouble型の2_1をaddに渡すと整数値3が返ってくる() {
        Integer num1 = Integer.valueOf("1");
        Double num2 = Double.valueOf("2.1");
        int actual = Calculation.add(num1, num2);

        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Number型の配列のInteger型の1とDouble型の2_1とShort型の1をaddに渡すと整数値4が返ってくる() {
        Number[] nums = { Integer.valueOf("1"), Double.valueOf("2.1"), Short.valueOf("1") };
        int actual = Calculation.add(nums);

        int expected = 4;

        Assert.assertEquals(expected, actual);

    }

    @Test(expected = NullPointerException.class)
    public void nullが入ったNumber型の配列をaddに渡すとNullPointerExceptionが発生する() {
        Number[] nums = { null, Double.valueOf("2.1"), Short.valueOf("1") };
        Calculation.add(nums);

    }

}

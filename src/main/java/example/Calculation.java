package example;

import java.util.Arrays;

public class Calculation {

    /**
     * 二つの整数の足し算の結果を返します。
     * 
     * @param num1
     *            足し算する整数
     * @param num2
     *            足し算する整数
     * @return 足し算の結果を整数値で返します。
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * 受け取った複数の整数の足し算の結果を返します。
     * 
     * 
     * <p>
     * 複数の整数値を足し算したい時に使用します。
     * </p>
     * 
     * @param nums
     *            足し算をする複数の整数値の配列
     * 
     * @return 足し算の結果を整数値で返します。
     */
    public static int add(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    /**
     * 二つの<code>Number</code>オブジェクトの足し算の結果を返します。
     * 
     * <p>
     * 引数<code>Number</code>オブジェクトは全て整数として扱うため、整数値を返します。
     * </p>
     * 
     * <p>
     * 基本型のラッパークラスを値を整数として足し算したい時に使用します。
     * </p>
     * <p>
     * int型で返すため、int型が扱える値を超えるとNumberFormatExceptionが発生します。
     * </p>
     * 
     * @param num1
     *            足し算する<code>Number</code>オブジェクト <code>null</code>は許可しません
     * @param num2
     *            足し算する<code>Number</code>オブジェクト <code>null</code>は許可しません
     * @return 足し算の結果を整数値で返します。
     */
    public static int add(Number num1, Number num2) {
        return num1.intValue() + num2.intValue();
    }

    /**
     * 受け取った複数の<code>Number</code>オブジェクトの足し算の結果を返します。
     * 
     * <p>
     * 引数<code>Number</code>オブジェクトは全て整数として扱うため、整数値を返します。
     * 
     * </p>
     * 
     * <p>
     * 複数の基本型のラッパークラスを値を整数として足し算したい時に使用します。
     * </p>
     * 
     * <p>
     * <code>int</code>型で返すため、<code>int</code>型が扱える値を
     * 超える値を渡すと整数値がおかしくなるため渡す数値は気を付けてください。
     * </p>
     * 
     * @param numbers
     *            足し算をする<code>Number</code>オブジェクトの配列 <code>null</code>は許可しません。
     *            <p>
     *            <code>null</code>が含まれた配列の場合、NullPointerExceptionが発生します。
     *            </p>
     * @return 足し算の結果を整数値で返します。
     */
    public static int add(Number[] numbers) {
        return Arrays.stream(numbers).mapToInt(Number::intValue).sum();
    }

}

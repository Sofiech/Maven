/**
 * FileName: Inkrement
 * Author: aspid
 * Date: 01.08.2022 12:13
 * Description:
 */

public class Dikrem {
    public static void main (String[] args){
        int num1 = 7;
        int num2 = num1++;
        int result1 = num1 + num2;
        System.out.println("Результат 1: " + result1);

        int num3 = 7;
        int num4 = ++num1;
        int result2 = num3 + num4;
        System.out.println("Результат 2: " + result2);

        int num5 = 7;
        int num6 = num1--;
        int result3 = num5 + num6;
        System.out.println("Результат 3: " + result3);

        int num7 = 7;
        int num8 = --num1;
        int result4 = num7 + num8;
        System.out.println("Результат 4: " + result4);

        int num9 = 7;
        int num10 = 2;
        int result5 = num9 % num10;
        System.out.println("Результат 5: " + result5);

    }
}

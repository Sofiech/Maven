/**
 * FileName: Logic
 * Author: aspid
 * Date: 01.08.2022 13:19
 * Description:
 */
public class Logic {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 7;
        int num3 = 7;
        int num4 = 5;

        if (num1 == num2 && num3 > num4){
            System.out.println("Результат равен");
        } else {
            System.out.println("Результат не равен");
        }

        int num5 = 7;
        int num6 = 6;
        int num7 = 7;
        int num8 = 5;

        if (num5 == num6 || num7 > num8){
            System.out.println("Результат равен");
        } else {
            System.out.println("Результат не равен");
        }
    }
}

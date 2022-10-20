/**
 * FileName: Equels
 * Author: aspid
 * Date: 01.08.2022 12:30
 * Description:
 */
public class Equels
{
    public static void main(String[] args)
    {
        int num1 = 7;
        int num2 = num1++;

        int result = num1 % num2;

        if (num1 == num2)
        {
            System.out.println("Result");
        }
        else{
            System.out.println("No result");
        }

        int num3 = 5;
        int num4 = num3++;
        int num5 = num4;
        int result1 = num5;

        if (num3 != num4)
        {
        System.out.println("Result");
        }
        else
        {
            System.out.println("Result no");
        }
    }
}
